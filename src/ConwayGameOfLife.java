import java.util.Random;

public class ConwayGameOfLife {

	public static void main(String[] args) {
		int[][] array = new int[10][10];

		for(int i = 0; i < array.length; i++)
			for(int q = 0; q < array[i].length; q++)
				array[i][q] = rand();

		print(array);

		for(int count = 1; count > 0; count--) {
			int[][] old;
			old = array;

			int[][] N = new int[old.length][old[0].length];

			int temp;

			// Check and change each cell
			for(int X = 0; X < old.length; X++)
				for(int Y = 0; Y < old[X].length; Y++) {
					temp = countNeighbors(old, X, Y);
					if(temp < 2) {
						N[X][Y] = 0;
					} else if(temp > 3) {
						N[X][Y] = 0;
					} else if(temp == 3) {
						N[X][Y] = 1;
					} else if(temp == 2) {
						N[X][Y] = old[X][Y];
					}
				}


			// Set new array equal to the main array
			System.out.println();
			array = N;
			print(array);
		}



	}

	public static int countNeighbors(int[][] array, int X, int Y) {

		int neighbors = 0;

		if(X-1 < 0) {
			if(Y-1 < 0 && Y+1 > array[X].length) {
				neighbors = neighbors + 1;
			}
		}
		return neighbors;
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
