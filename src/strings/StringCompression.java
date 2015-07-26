package strings;

public class StringCompression {
    //Write an algo­rithm to com­press the given string by using the count of repeated char­ac­ters
    //and if new com­pressed string length is not smaller than the orig­i­nal string then return the orig­i­nal string.
    public String getCompressesString(String s){
        StringBuilder sbBuilder=new StringBuilder();
        char[] c=s.toCharArray();
        int count=1;
        char last=s.charAt(0);
        for(int i=1;i<c.length;i++){
            if(last==c[i]){
                count++;
            }else{
                sbBuilder.append(last);
                sbBuilder.append(count);
                last=c[i];
                count=1;
            }
        }
        if(s.length()<sbBuilder.toString().length()){
            return s;
        }else{
            return sbBuilder.toString();
        }
    }

}
