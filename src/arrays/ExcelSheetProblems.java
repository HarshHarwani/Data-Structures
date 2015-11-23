package arrays;
/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
For example:
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 * @author HarshHarwani
 *
 */
public class ExcelSheetProblems {

	public static int titleToNumber(String s){
		
		int len=s.length()-1;
		int pow=0;
		int result=0;
		while(len>=0){
			char c=s.charAt(len);
			result+=(int)Math.pow(26, pow)*(c-'A'+1);
			len--;
			pow++;
		}
		return result;
	}
public static String numberToTitle(int n){
		StringBuilder sbBuilder=new StringBuilder();
		while(n>0){
			n--;
			char c=(char)(n%26+'A');
			n=n/26;
			sbBuilder.append(c);
		}
		return sbBuilder.reverse().toString();
	}
	
	
	public static void main(String[] args) {
		int result=titleToNumber("AB");
		System.out.println(result);
		System.out.println(numberToTitle(result));
	}
}
