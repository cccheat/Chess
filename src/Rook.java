public class Rook extends Pieces {

	public Rook() {
		name = "Rook";
	}

	@Override
	public boolean canMove(int startx, int starty, int endx, int endy) {
		if (isFree(endx, endy) && isValid(endx, endy)) {
			if (((startx == endx) && !(endy == starty)) || (!(startx == endx) && (endy == starty)))
				return true;
		} else {
			return false;
		}
		return false;
	}

	@Override
	public boolean canJump() {
		return false;
	}

	@Override
	public String toString() {
		return "rook";
	}

	@SuppressWarnings("unused")
	@Override
	public boolean IntheWay(int startx, int starty, int endx, int endy) {
		// if the xs are the same it must be moving up on the y axis meaing i
		// have to check every y value on the movement scale
		if (startx == endx) {
			for (int i = starty; i < endy; i++) {
				// if there is anything on the board then say false
				// otherwise just give a true
				if (!(chessBoard[startx][i] == null))
					return false;
				else
					return true;
			}
			// if the ys are the same it checks every value on the x value of
			// the movement scale
		} else if (starty == endy) {
			for (int o = startx; o < endx; o++) {
				// if there is anything on the board then say false
				// otherwise just give a true
				if (!(chessBoard[o][starty] == null))
					return false;
				else
					return true;
			}
		}
		return false;
	}

}