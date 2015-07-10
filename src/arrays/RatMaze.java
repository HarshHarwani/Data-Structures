package arrays;

/**
 * 
 * @author hharwani
 * @description A Maze is given as N*N binary matrix of blocks where source
 *              block is the upper left most block i.e., maze[0][0] and
 *              destination block is lower rightmost block i.e., maze[N-1][N-1].
 *              A rat starts from source and has to reach destination. The rat
 *              can move only in two directions: forward and down.
 *
 */
public class RatMaze {

    private int[][] solve;
    private int size;

    public RatMaze(int n) {
        solve = new int[n][n];
        this.size = n;
    }

    public boolean solveMaze(int[][] maze) {
        if (solveMazUtil(maze, 0, 0, solve)) {
            printsol(solve);
            return true;
        } else {
            System.out.println("no solution exists");
            return false;
        }
    }

    private boolean solveMazUtil(int[][] maze, int i, int j, int[][] solve) {
        // if we have reached the rightmost corner we write it as a soln.
        if (i == size - 1 && j == size - 1) {
            solve[i][j] = 1;
            return true;
        }
        if (isSafe(i, j, maze)) {
            solve[i][j] = 1;

            if (solveMazUtil(maze, i + 1, j, solve))
                return true;
            if (solveMazUtil(maze, i, j + 1, solve))
                return true;

            solve[i][j] = 0; //backtracking, once we cant move right or down we have to backtrack
            return false;
        }
        return false;

    }

    private boolean isSafe(int i, int j, int[][] maze) {
        boolean b = i >= 0 && i < this.size && j >= 0 && j < this.size && maze[i][j] == 1;
        return b;
    }

    private void printsol(int[][] solve) {
        for (int j = 0; j < this.size; j++) {
            for (int i = 0; i < this.size; i++) {
                System.out.print(solve[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
