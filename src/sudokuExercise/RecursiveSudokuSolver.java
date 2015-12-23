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
	    for (int col = 0; col < 9; col++) {
           if (model[row][col] == num) {
               return false;
           }
        }
	    return true;
	}

	/** Checks if num is an acceptable value for the given column */
	private boolean checkCol( int col, int num ) {
	    for (int row = 0; row < 9; row++) {
            if (model[row][col] == num) {
                return false;
            }
        }
	    return true;
	}

	/** Checks if num is an acceptable value for the box around row and col */
	private boolean checkBox( int row, int col, int num ) {
	    row = (row / 3) * 3;
	    col = (col / 3) * 3;
	    
	    for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (model[row + r][col + c] == num) {
                    return false;
                }
            }
        }
	    return true;
	    
	}


	/** Recursive function to find a valid number for one single cell */
	public boolean solve(int row, int col) {		
		/* 1) Wenn Zeilenende erreicht, 
		 * fange wieder links an,
		 * gehe eine Zeile nach unten
		 * oder breche ab, wenn du ganz fertig bist
		 */
	    if (col == model.length) {
	        row++;
	        col = 0;
	        if (row == model.length) {
	            return true;
	        }
	    }

		// 2) Das Feld ist erfolgreich gesetzt
		// Funktionsaufruf mit naechster Spalte
	    if (model[row][col] > 0) {
	        return solve(row, col + 1);
        }

		//3) Probiere alle Zahlen aus
	    for (int i = 1; i < 10; i++) {
            if (checkRow(row, i) && checkCol(col, i) && checkBox(row, col, i)) {
                model [row][col] = i;
                if (solve(row, col + 1)) {
                    return true;
                }
            }
        }

		//4) Der Versuch war wohl nichts
		//Feld zurÃ¼ck setzen und zum Aufrufe mit false zurÃ¼ckkehren
	    model[row][col] = 0;
	    return false;
	}

	public String toString() {
		String puzzle = "";
		puzzle += "-----------------------";
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
		puzzle += "-----------------------";
		puzzle += "\n";
		return puzzle;
	}
}
