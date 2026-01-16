/**
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  char[][] arr;
  int num_rows;
  int num_cols;

  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
    arr = new char[rows][cols];
    num_rows = rows;
    num_cols = cols;
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
    num_rows = rows;
    num_cols = cols;
	  arr = new char[rows][cols];
	  for(int i = 0; i < rows -1; i++) {
		  for(int j = 0; j < rows -1; j++) {
			  arr[i][j] = fill;
		  }
	  }
  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {
    return num_rows;
  }

  /**
   * Returns the number of columns in grid
   */
  public int numCols()
  {
    return num_cols;
  }

  /**
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
    return arr[row][col];
  }

  /**
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
    arr[row][col] = ch;
  }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
	  if(arr[row][col] == ' ') return true;
	  return false;
  }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
	  for(int i = row0; i < row1 -1; i++) {
		  for(int j = col0; j < row1 -1; j++) {
			  arr[i][j] = fill;
		  }
	  }
  }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
	  for(int i = row0; i < row1 -1; i++) {
		  for(int j = col0; j < row1 -1; j++) {
			  arr[i][j] = ' ';
		  }
	  }
  }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
    int count = 0;
	for(int i = 0; i < row -1; i++) {
		  if (arr[row][0] == ' ') count++;
	}
	return count;
  }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
	    int count = 0;
		for(int i = 0; i < col -1; i++) {
			  if (arr[0][col] == ' ') count++;
		}
		return count;
  }
}
