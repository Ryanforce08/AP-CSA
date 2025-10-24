// Implements the game of Craps logic

public class CrapsGame {
	private int point = 0;

	/**
	 * Calculates the result of the next dice roll in the Craps game. The parameter
	 * total is the sum of dots on two dice. point is set to the saved total, if the
	 * game continues, or 0, if the game has ended. Returns 1 if player won, -1 if
	 * player lost, 0 if player continues rolling.
	 */
	public int processRoll(int total) {
		// First roll 7 or 11 is win
		// First roll 2, 3, 12 is lose
		// Any
		if (point == 0) {
			// First roll
			if (total == 7 || total == 11) {
				return 1;
			}
			if (total == 2 || total == 3 || total == 11) {
				return -1;
			}
			this.point = total;
			return 0;
		}

		if (total == this.point) {
			this.point = 0; 
			return 1;
		}
		if (total == 7) {
			return -1;
		}
		return 0;
	}

	/**
	 * Returns the saved point
	 */
	public int getPoint() {
		return point;
	}
}
