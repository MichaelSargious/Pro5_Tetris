package tetris.game;

import java.util.Random;

import tetris.autoplay.AutoPlayer;
import tetris.autoplay.Auto_Imp;
import tetris.game.pieces.Factory_Imp;
import tetris.game.pieces.PieceFactory;

public class MyTetrisFactory {

	/**
	 * The default number of rows.
	 */
	public static final int DEFAULT_ROWS = 20;
	/**
	 * The default number of columns.
	 */
	public static final int DEFAULT_COLUMNS = 10;

	/**
	 * Creates a new TetrisGame. It initializes the used PieceFactory with the
	 * given Random number generator. The size should be DEFAULT_ROWS x
	 * DEFAULT_COLUMNS.
	 *
	 * @param r
	 *            the random number generator to use for the PieceFactory.
	 */
	static public TetrisGame createTetrisGame(Random r) {
	    TetrisGame Tet = new Imp_Game(r) ;
	    return Tet ;
     	//throw new UnsupportedOperationException();
	}

	/**
	 * Create a new PieceFactory that can generate new pieces.
	 *
	 * @param r
	 *            the random number generator to use for the PieceFactory.
	 */
	static public PieceFactory createPieceFactory(Random r) {
		PieceFactory Fac = new Factory_Imp(r);
		return Fac ;
		//throw new UnsupportedOperationException();	
	}
	
	/**
	 * Creates a new Board with given rows and columns.
	 *
	 * @param rows
	 *            the number of rows
	 * @param columns
	 *            the number of columns
	 */
	static public Board createBoard(int rows, int columns) {
		Board Bor = new Imp_Board(rows,columns) ;
		return Bor ;
	}

	/**
	 * The AutoPlayer provides moves for a tetris game.
	 *
	 * @param game
	 *            the game for which the AutoPlayer should provide moves
	 */
	static public AutoPlayer createAutoPlayer(TetrisGameView game) {
		AutoPlayer Auto =  new Auto_Imp(game) ;
		return Auto ;
		//throw new UnsupportedOperationException();
	}
}
