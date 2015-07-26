package strings;
//Replace all spaces in a String with ‘%20′
public class String20 {
    public String replaceString20(String s){
        char[] c=s.toCharArray();
        StringBuilder sBuilder=new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(c[i]==' '){
                sBuilder.append("%20");
            }else{
                sBuilder.append(c[i]);
            }
        }
        return sBuilder.toString();
    }
    
    public String replaceString201(String s){
        return null;
    }
}
