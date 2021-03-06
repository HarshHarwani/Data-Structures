package arrays;
import java.util.*;

public class PowerSet {

    
    
    public static Set<Set<Integer>> getPowerSet(Set<Integer> originalSet){
        Set<Set<Integer>> sets=new HashSet<Set<Integer>>();
        if(originalSet.isEmpty()){
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list=new ArrayList<Integer>(originalSet);
        Integer head=list.get(0);
        Set<Integer> rest=new HashSet<Integer>(list.subList(1,list.size()));
        Set<Set<Integer>> interResult=getPowerSet(rest);
        for(Set<Integer> ele: interResult){
            Set<Integer> newSet=new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(ele);
            sets.add(newSet);
            sets.add(ele);
        }
        return sets;
    }
    

    public static void main(String args[]){
        Set<Integer> set=new HashSet<Integer>();
        set.add(1);
        set.add(2); 
        set.add(3);
        Set<Set<Integer>> resultSet=getPowerSet(set);
        for(Set<Integer> ele:resultSet){
            System.out.println(ele.toString());
        }
    }
}
