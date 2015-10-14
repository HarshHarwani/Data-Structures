package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, return true if and only if there
 * are two distinct indices i and j in the array such that nums[i] = nums[j] and
 * the difference between i and j is at most k.
 * 
 * @author hharwani
 *
 */

public class ContainsDuplicate2 {

    
    public boolean containsNearByDuplicate(int[] a,int k){
        if(a==null || a.length==0)
            return false;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                int index=map.get(a[i]);
                if(i-index<=k)
                    return true;
            }
            map.put(a[i],i);
            
        }
        return false;
    }
    
    
    
    
    public static void main(String args[]){
        ContainsDuplicate2 coDuplicate2=new ContainsDuplicate2();
        int arr[] =  {1, 5, 1, 4, 2};
        System.out.println(coDuplicate2.containsNearByDuplicate(arr, 2));
    }
}
