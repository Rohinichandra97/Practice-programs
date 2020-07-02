
public class Queen 
{
	private int size = 0;
	
	public Queen(int n)
	{
		size = n;
	}
	
	public void QP1(int board[][], int rows, int cols, int qc)
	{
		if(QP(board,rows,cols,qc))
		{
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					System.out.print("| " + board[i][j]);
				}
				System.out.println( "|" );
			}
		}
		else
		{
			System.out.println(" Seems, that number cant have somany queens!, try 2 factors !");
		}
	}
	
	public boolean QP(int board[][], int rows, int cols, int qc)
	{
		if(qc == 0)
		{
			return true;
		}
		else
		{
			for(int i = 0; i < size; i++)
			{
				if(checkIfFeasibleposition(board,rows,i))
				{
					board[rows][i] = 1;
					if(QP(board, rows+1, 0, qc-1))
						return true;
					else
						board[rows][i] = 0;
				}
				else
				{
					board[rows][i] = 0;
				}
			}
			return false;
		}
	}
	
	private boolean checkIfFeasibleposition(int[][] board, int rows, int cols) 
	{
		
		if(! rowsCheck(rows,board))
			return false;
		else if(!columnCheck(cols,board))
			return false;
		else if(!diagonalCheck(rows,cols,board))
			return false;
		else
			return true;
	}
	
	private boolean diagonalCheck(int rows, int cols,int board[][]) 
	{
		if( !checkForwardDiagonal(board,rows,cols))
			 return false;
		else if( !checkBackwardDiagonal(board,rows,cols))
			 return false;					 
		else
			return true;
	}
	
	private boolean checkBackwardDiagonal(int[][] board, int rows1, int cols1) 
	{
		int rows = rows1;
		int cols = cols1;
		while(rows < size && cols >= 0)
		{
			
			if(board[rows1][cols1] == 1)
			{
				return false;
			}
			rows = rows + 1;
			cols = cols-1;
		}
		while(rows1 >= 0 && cols1 < size)
		{
			
			if(board[rows1][cols1] == 1)
			{
				return false;
			}
			rows1 = rows1 - 1;
			cols1 = cols1 + 1;
		}
		return true;
	}
	
	private boolean checkForwardDiagonal(int[][] board, int rows1, int cols1) 
	{
		int rows = rows1;
		int cols = cols1;
		while(rows < size && cols < size)
		{

			if(board[rows][cols] == 1)
			{
				return false;
			}
			rows = rows + 1;
			cols = cols + 1;
		}
		while(rows1 >= 0 && cols1 >= 0)
		{
			
			if(board[rows1][cols1] == 1)
			{
				return false;
			}
			rows1 = rows1 - 1;
			cols1 = cols1 - 1;
		}
		return true;
	}
	
	private boolean columnCheck(int cols,int board[][]) 
	{
		
		for(int i = 0; i<size;i++)
		{
			if(board[i][cols] == 1)
			{
				return false;
			}
		}
		return true;
	}
	
	private boolean rowsCheck(int rows,int board[][]) 
	{
		
		for(int i = 0; i<size;i++)
		{
			if(board[rows][i] == 1)
			{
				return false;
			}
		}
		return true;
	}
}
