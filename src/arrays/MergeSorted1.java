package arrays;


//given two sorted Array a and b, a has buffer to hold b, so merge both the arrays.
public class MergeSorted1 {
    
    public void MergeSortedBuffer(int[] a,int[] b, int lastA,int lastB){
        int indexA=lastA-1;
        int indexB=lastB-1;
        int mergedIndex=lastA+lastB-1;
        while(indexB>=0){
            if(indexA>=0 && a[indexA]>b[indexB]){
                a[mergedIndex]=a[indexA];
                indexA--;
            }else{
                a[mergedIndex]=b[indexB];
                indexB--;
            }
            mergedIndex--;
        }
        for(int i:a){
        System.out.print(" "+i+",");
        }
    }
}
