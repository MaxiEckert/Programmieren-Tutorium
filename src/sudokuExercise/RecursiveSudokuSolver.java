package sudokuExercise;


public class RecursiveSudokuSolver implements SudokuSolver
{
	/**
	 * The model, where the numbers of the puzzle are stored
	 */ 
	private int model[][] ;

	public RecursiveSudokuSolver(int[][] model) {
		this.model = model;
	}

	/** Checks if num is an acceptable value for the given row */
	private boolean checkRow( int row, int num ) {

	}

	/** Checks if num is an acceptable value for the given column */
	private boolean checkCol( int col, int num ) {

	}

	/** Checks if num is an acceptable value for the box around row and col */
	private boolean checkBox( int row, int col, int num ) {

	}


	/** Recursive function to find a valid number for one single cell */
	public boolean solve(int row, int col) {		
		/* 1) Wenn Zeilenende erreicht, 
		 * fange wieder links an,
		 * gehe eine Zeile nach unten
		 * oder breche ab, wenn du ganz fertig bist
		 */


		// 2) Das Feld ist erfolgreich gesetzt
		// Funktionsaufruf mit naechster Spalte


		//3) Probiere alle Zahlen aus


		//4) Der Versuch war wohl nichts
		//Feld zurÃ¼ck setzen und zum Aufrufe mit false zurÃ¼ckkehren

	}

	public String toString() {
		String puzzle = "";
		puzzle += "_______________________";
		puzzle += "\n";
		for (int i = 0; i < model.length; i++) {
			puzzle += "|";
			for (int j = 0; j < model.length; j++) {
				puzzle += model[i][j] == 0 ? " " : model[i][j];
				puzzle += "|";
				puzzle += j % 3 == 2 && j < 8? " |" : ""; 
			}
			puzzle += "\n";	
			puzzle += i % 3 == 2 && i < 8? "-----------------------"+"\n" : ""; 
		}
		puzzle += "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾";
		puzzle += "\n";
		return puzzle;
	}
}
