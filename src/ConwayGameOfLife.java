import java.util.Random;

public class ConwayGameOfLife {

	public static void main(String[] args) {
		int[][] X = new int[10][10];

		for(int i = 0; i < X.length; i++)
			for(int q = 0; q < X[i].length; q++)
				X[i][q] = rand();

		print(X);

		for(int count = 10; count > 0; count--) {
			int[][] old;
			old = X;

			int[][] N = new int[old.length][old[0].length];

			// Check and change each cell





			// Set new array equal to the main array
			X = N;
		}



	}

	public static int rand() {

		Random rand = new Random();
		return rand.nextInt(2);
	}

	public static void print(int[][] X) {
		for(int i = 0; i < X.length; i++) {
			for(int q = 0; q < X[i].length; q++)
				System.out.print(X[i][q] + " ");
			System.out.println();
		}
	}
}
