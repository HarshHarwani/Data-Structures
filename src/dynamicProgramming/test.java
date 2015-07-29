package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class test {
    
    public static int[][] Simple_Task(int N, int M, String[][] Mat) {
        int[][] mat1=new int[N][M];
        for(int i=0;i<N;i++){
          for(int j=0;j<M;j++){
            if(Mat[i][j].equals("X")){
               mat1[i][j]=1;
            }
            if(Mat[i][j].equals(".")){
               mat1[i][j]=0;
            }
          }
      }
       return mat1; 
      }
    
    
    public static String morse_enc(String m) {
        Map<String, String> htMorseCodeCharacters = new HashMap<String, String>();
        htMorseCodeCharacters.put("A", "._");
        htMorseCodeCharacters.put("B", "_...");
        htMorseCodeCharacters.put("C", "_._.");
        htMorseCodeCharacters.put("D", "_..");
        htMorseCodeCharacters.put("E", ".");
        htMorseCodeCharacters.put("F", ".._.");
        htMorseCodeCharacters.put("G", "__.");
        htMorseCodeCharacters.put("H", "....");
        htMorseCodeCharacters.put("I", "..");
        htMorseCodeCharacters.put("J", ".___");
        htMorseCodeCharacters.put("K", "_._");
        htMorseCodeCharacters.put("L", "._..");
        htMorseCodeCharacters.put("M", "__");
        htMorseCodeCharacters.put("N", "_.");
        htMorseCodeCharacters.put("O", "___");
        htMorseCodeCharacters.put("P", ".__.");
        htMorseCodeCharacters.put("Q", "__._");
        htMorseCodeCharacters.put("R", "._.");
        htMorseCodeCharacters.put("S", "...");
        htMorseCodeCharacters.put("T", "_");
        htMorseCodeCharacters.put("U", ".._");
        htMorseCodeCharacters.put("V", "..._");
        htMorseCodeCharacters.put("W", ".__");
        htMorseCodeCharacters.put("X", "_.._");
        htMorseCodeCharacters.put("Y", "_.__");
        htMorseCodeCharacters.put("Z", "__..");
        htMorseCodeCharacters.put("1", ".____");
        htMorseCodeCharacters.put("2", "...__");
        htMorseCodeCharacters.put("3", "...__");
        htMorseCodeCharacters.put("4", "...._");
        htMorseCodeCharacters.put("5", ".....");
        htMorseCodeCharacters.put("6", "_....");
        htMorseCodeCharacters.put("7", "__...");
        htMorseCodeCharacters.put("8", "___..");
        htMorseCodeCharacters.put("9", "____.");
        htMorseCodeCharacters.put("0", "_____");
        String[] strarr=m.split(" ");
        StringBuffer buffer=new StringBuffer();
        for(String string:strarr){
            String updated=string.toUpperCase();
            char[] c=updated.toCharArray();
            for(char f:c){
               buffer.append(htMorseCodeCharacters.get(String.valueOf(f)));
               if(c.length>1)
               buffer.append(" ");
            }
            buffer.append("_");
        }
       String str=buffer.toString();
       return str.substring(0,str.length()-1);

    }
    
    
    
    
    
    public static void main(String args[]){
                int N=3;
                int M=4;
                String[][] mat={{"X",".","X","."},{".",".","X","X"},{".",".",".","X"}};
                Simple_Task(N, M, mat);
                System.out.println(morse_enc("N Its over"));
    }
}
