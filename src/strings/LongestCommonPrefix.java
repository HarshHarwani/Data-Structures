package strings;

public class LongestCommonPrefix {
    String[] arr;
    public String longestCommonPrefix(String s){
        arr=s.split(" ");
        int curr;
        int resultlen=arr[0].length();
        for(int i=0;i<arr.length;i++){
            curr=0;
            while(curr<resultlen && curr<arr[i].length() && arr[0].charAt(curr)==arr[i].charAt(curr)){
                curr++;
            }
            resultlen=curr;
            
        }
        return arr[0].substring(0,resultlen);
    }

}
