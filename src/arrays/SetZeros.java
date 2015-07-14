package arrays;


/**
 *  write an algorithm such that if an element in a N*N matrix is zero, its entire row and column are
 *  set to zero.
 * @author hharwani
 *
 */
public class SetZeros {
    
    
    public void setZeros(int[][] a){
        boolean[] rows=new boolean[a.length];
        boolean[] columns=new boolean[a[0].length];
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    rows[i]=true;
                    columns[i]=true;
                }
            }
        }
        for(int i=0;i<rows.length;i++){
            if(rows[i]==true)
                nullifyrow(a,i);
        }
        for(int i=0;i<columns.length;i++){
            if(columns[i]==true)
                nullifycolumn(a,i);
        }
        printsol(a);
    }

    private void nullifycolumn(int[][] a, int column) {
        for(int i=0;i<a[0].length;i++){
            a[i][column]=0;
        }
    }

    private void nullifyrow(int[][] a, int row) {
        for(int i=0;i<a.length;i++){
            a[row][i]=0;
        }
    }
    
    public void printsol(int[][] solve) {
        for (int j = 0; j <solve.length ; j++) {
            for (int i = 0; i < solve[0].length; i++) {
                System.out.print(solve[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
