import java.util.Scanner;

	public class keyboardInputGameplay {
		public static void keyboardInput(String[][] gameOutline) {
			// Finding current location of A
			for (int i = 0; i < gameOutline.length; i++) {
				for (int j = 0; j < (gameOutline[i].length); j++) {
					if (gameOutline[i][j].equals("A")) {
						// found the location of A, in row i and column j
						int row = i;
						int column = j;
	
						// created a loop asking the user to move, and updating the game outline
						while (true) {
							@SuppressWarnings("resource")
							Scanner scan = new Scanner(System.in);
							System.out.println("Use Keys (W,S,A,D) to Move");
							String userMove = scan.nextLine();
	
							// using switch/case to see which letter is typed by the user
							switch (userMove) {
							case "w":
								gameOutline[row - 1][column] = "A";
								if (gameOutline[row][column].equals("A")) {
									gameOutline[row][column] = " ";
	
								}
								row = row - 1;
								break;
	
							case "d":
								gameOutline[row][column + 3] = "A";
								if (gameOutline[row][column].equals("A")) {
									gameOutline[row][column] = " ";
	
								}
								column = column + 3;
								break;
							case "s":
								gameOutline[row + 1][column] = "A";
								if (gameOutline[row][column].equals("A")) {
									gameOutline[row][column] = " ";
	
								}
								row = row + 1;
								break;
							case "a":
								gameOutline[row][column - 3] = "A";
								if (gameOutline[row][column].equals("A")) {
									gameOutline[row][column] = " ";
	
								}
								column = column - 3;
								break;
	
							}
							runGame.printGameOutline(gameOutline);
						}
					}
}
				}
		}
	}

		
