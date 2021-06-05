package tetris.game;

import java.util.Random;

import tetris.game.pieces.Piece;
import tetris.game.pieces.Pieces_Imp;

public class Imp_Game implements TetrisGame {
	
	Random r;
	TetrisGameView game ;
	
	public Imp_Game(Random r) {
		this.r = r ;
	}
	
	@Override
	public void addObserver(GameObserver observer) {
	game.addObserver(observer);
	}

	@Override
	public void removeObserver(GameObserver observer) {
		game.removeObserver(observer);
	}

	@Override
	public Piece getCurrentPiece() {
		return game.getCurrentPieceCopy() ;
	}

	@Override
	public Board getBoard() {
		return game.getBoardCopy();
	}

	@Override
	public Piece getNextPiece() {
		return game.getNextPieceCopy();
	}

	@Override
	public int getNumberOfCompletedRows() {
		return game.getBoardCopy().deleteCompleteRows();
	}

	@Override
	public int getPieceColumn() {
		return game.getPieceColumn();
	}

	@Override
	public int getPieceRow() {
		return game.getPieceRow();
	}

	@Override
	public long getPoints() {
		game.getPoints() ;
		return 0;
	}

	@Override
	public boolean isGameOver() {
		return game.isGameOver();
	}

	@Override
	public boolean moveDown() {
		return false;
	}

	@Override
	public boolean moveLeft() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveRight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean newPiece() {
		return false;
	}

	@Override
	public boolean rotatePieceClockwise() {
		if (game.getCurrentPieceCopy().getClockwiseRotation() != null )
			return true ;
		else return false ;
	}

	@Override
	public boolean rotatePieceCounterClockwise() {
		if (game.getCurrentPieceCopy().getCounterClockwiseRotation() != null )
			return true ;
		else return false ;
	}

	@Override
	public void setGameOver() {

	}

	@Override
	public void step() {
		// TODO Auto-generated method stub

	}

}
