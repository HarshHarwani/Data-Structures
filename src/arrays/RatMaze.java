package arrays;

public class RatMaze {
    
    private int[][] solve;
    private int size;
    public RatMaze(int n){
        solve=new int[n][n];
        this.size=n;
    }
    
    public boolean solveMaze(int[][] maze){
        if(solveMazUtil(maze,0,0,solve)){
            printsol(solve);
            return true;
        }
        else{
            System.out.println("no solution exists");
            return false;
        }
    }

  
    private boolean solveMazUtil(int[][] maze, int i, int j, int[][] solve) {
        //if we have reached the rightmost corner we write it as a soln. 
        if(i==size-1 && j==size-1){
            solve[i][j]=1;
            return true;
        }
        if(isSafe(i,j,maze)){
            solve[i][j]=1;
            
            if(solveMazUtil(maze, i+1, j, solve))
                return true;
            if(solveMazUtil(maze, i, j+1, solve))
                return true;
            
            solve[i][j]=0;
            return false;
        }
        return false;
            
    }
    
    private boolean isSafe(int i, int j, int[][] maze) {
        boolean b= i>=0 && i<this.size && j>=0 && j<this.size && maze[i][j]==1;
        return b;
    }

    private void printsol(int[][] solve) {
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                System.out.print(solve[i][j]+" ");
            }
            System.out.println("\n");
        }
    }


}
