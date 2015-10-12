package arrays;

public class ReverseArray {
    
    
    
    public static void reverseArray(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    
    
    public static void reverseArrayRecursively(int[] a,int start,int end){
       if(start>end)
           return;
       int temp=a[start];
       a[start]=a[end];
       a[end]=temp;
       reverseArrayRecursively(a, start+1, end-1);
    }
    
    
    
    public static void main(String args[]){
        int[] a = {1, 2, 3, 4, 5};
        reverseArray(a);
        printArray(a);
        reverseArrayRecursively(a, 0, a.length-1);
        printArray(a);
    }


    private static void printArray(int[] a) {
        System.out.println("The reverse array is-->\n");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
    
    
    
    
    
    
    

}
