package tetris.autoplay;

import tetris.game.TetrisGameView;

public class Auto_Imp implements AutoPlayer {

	TetrisGameView game ; 
	
	public Auto_Imp(TetrisGameView game) {
		this.game = game ;
	}

	@Override
	public void rowsCompleted() {

	}

	@Override
	public void piecePositionChanged() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pieceLanded() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub

	}

	@Override
	public Move getMove() {
		// TODO Auto-generated method stub
		return null;
	}

}
