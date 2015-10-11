package arrays;
//Check if Array Contains All Elements Of Some Given Range
/**
 * 
 * @author hharwani
 *
 *int[] arrA = { 11, 17, 13, 19, 15, 16, 12, 14 };
Range : 12-15
Output: True
 */
public class ArrayRange {
        
    
    public static boolean isRangePresent(int [] a,int start,int end){
        for(int i=0;i<a.length;i++){
            if(start<=a[i] && a[i]<=end){
                int z=a[i]-start;
                if(a[z]>0){
                    a[z]=-1*a[z];
                }
            }
        }
        int range=end-start;
        for(int i=0;i<range;i++){
            if(a[i]>0)
                return false;
        }
        return true;
    }
    
    
    
    
    public static void main(String[] args) throws java.lang.Exception {
        int[] arrA = { 11, 17, 13, 19, 15, 16, 12, 14 };
        int x = 12;
        int y = 17;
        System.out.println(isRangePresent(arrA, x, y));
    
    }    
    
    
    
    
    
    
}
