public class Sudoku_Solver {

    public static void main(String args[])
    {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,4,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        if(SudokuSolver(sudoku, 0, 0))
        {
            System.out.println("Solution exits.....");
            Printsudoku(sudoku);
        }
        else 
        {
            System.out.println("Soln not exits");
        }
    }
    public static boolean SudokuSolver(int sudoku[][],int row,int col)
    {
        //base case 
        if(row==9 &&col==0)
        {
            return true;
        }
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==9)
        {
            nextrow=row+1;
            nextcol=0;
        }

        if(sudoku[row][col]!=0)
        {
            return SudokuSolver(sudoku, nextrow, nextcol);
        }

        for(int digit=1;digit<=9;digit++)
        {
            if(isSafe(sudoku,row,col,digit));
            {
                sudoku[row][col]=digit;
                if(SudokuSolver(sudoku, nextrow, nextcol))
                {
                    //solution exit
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false ;
    }

    public static boolean isSafe(int sudoku[][],int row,int col,int digit)
    {
        //coloum
        for(int i=0;i<9;i++)
        {
            if(sudoku[i][col]==digit)
            return false ;
        }
        //row
        for(int j=0;j<9;j++)
        {
            if(sudoku[row][j]==digit)
            return false ;
        }
        //grid 
        int srow=(row/3)*3;
        int scol=(col/3)*3;
        //3x3 grid 
        for(int i=srow;i<srow+3;i++)
        {
            for(int j=scol;j<scol+3;j++)
            {
                if(sudoku[i][j]==digit)
                {
                    return false ;
                }
            }
        }
        return true;
    }


    public static void Printsudoku(int sudoku[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
}
