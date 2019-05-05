
public class ConwayGameOfLife {

	public static void main(String[] args) {
		int[][] X = new int[10][10];

		for(int i = 0; i < X.length; i++)
			for(int q = 0; q < X[i].length; q++)
				X[i][q] = 1;

		for(int i = 0; i < X.length; i++) {
			for(int q = 0; q < X[i].length; q++)
				System.out.print(X[i][q]);
			System.out.println();
		}

	}

}
