package strings;

public class StringToInteger {
	
	public int SToI(String str){
		if(str==null || str.length()==0)
			return -1;
		str=str.trim();
		int i=0;
		char flag='+';
		if(str.charAt(0)=='-'){
			flag='-';
		}
		i++;
		double result=0;
		while(i<str.length() && str.charAt(i)>=0 && str.charAt(i)<=9){
			result=result*10+ (str.charAt(i)-'0');
		}
		if(flag=='-')
			result=-result;
		if(result>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(result<Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int)result;
			
	}

}
