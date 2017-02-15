
public class Board {
	public Pieces[][] chessBoard;

	// good coding practice
	public static int WIDTH = 8;
	public static int HEIGHT = 8;

	// every one of the squares should be a button so that when you click on it
	// it does something
	// i just realized that
	// tht would make so many things so much easier
	public Board() {
		chessBoard = new Pieces[WIDTH][HEIGHT];
	}

	/**
	 * 
	 * @param endx
	 * @param endy
	 * @return if the place it wants to go to is free
	 */
	public boolean isFree(int endx, int endy) {
		if (chessBoard[endx][endy] == null)
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @param endx
	 * @param endy
	 * @return if the end position is off the grid or not
	 */
	public boolean isValid(int endx, int endy) {
		if (endx > WIDTH || endy > HEIGHT)
			return false;
		else
			return true;
	}
}