package tetris.game;
import tetris.game.Board;
import tetris.game.pieces.Piece;
import tetris.game.pieces.Piece.PieceType;
import tetris.game.pieces.Point;

public class Imp_Board implements Board {

	private int Rows ;
	private int Columns ;
	private PieceType[][] Bor ;
	
	public Imp_Board (int Rows , int Columns) {
		this.Rows = Rows ;
		this.Columns = Columns ;
		this.Bor =  new PieceType[this.Rows][this.Columns];
	}
	
	public Imp_Board(PieceType[][] new_bor) {
		this.Bor = new_bor ;
	}

	@Override
	public PieceType[][] getBoard() {
		return this.Bor  ;
	}

	@Override
	public int getNumberOfRows() {
		return this.Rows;
	}

	@Override
	public int getNumberOfColumns() {
		return this.Columns;
	}

	@Override
	public void addPiece(Piece piece, int row, int column) {
		if (canAddPiece(piece,row,column)==false) throw new IllegalArgumentException() ;
		if (piece == null) throw new IllegalArgumentException() ;
		if ( canAddPiece(piece,row,column)==true){ 
			int vor_row = piece.getRotationPoint().getRow() ;
			int vor_column = piece.getRotationPoint().getColumn() ;
			for (int i = 0 ; i < piece.getHeight() ; i++){
				for (int j = 0 ; j < piece.getWidth() ; j++){
					if (piece.getBody()[i][j] == true) 
						Bor[row-vor_row+i][column-vor_column+j] = piece.getPieceType() ;
			    }
			}
		}
	}  
	
	@Override
	public boolean canAddPiece(Piece piece, int row, int column) {
		if (piece == null) throw new IllegalArgumentException() ;
		if (row >= this.Rows || row < 0 || column >= this.Columns || column < 0 ) return false ; 
		int vor_row = piece.getRotationPoint().getRow() ;
		int vor_column = piece.getRotationPoint().getColumn() ;
		for (int i = 0 ; i < piece.getHeight() ; i++){
			for (int j = 0 ; j < piece.getWidth() ; j++){
				if (piece.getBody()[i][j] == true ) {
					if ((row-vor_row+i) >= this.Rows || (row-vor_row+i) < 0) return false ;
					if ((row-vor_row) >= this.Rows || (row-vor_row) < 0) return false ;
					if ((column-vor_column+j) >= this.Columns || (column-vor_column+j) < 0) return false ;
					if ((column-vor_column) >= this.Columns || (column-vor_column) < 0) return false ;
					if(Bor[row-vor_row+i][column-vor_column+j] != null) return false ;
				}
			}
		}
	  return true ;
	}	


	@Override
	public void removePiece(Piece piece, int row, int column) {
		if ((canRemovePiece(piece,row,column))==false) throw new IllegalArgumentException() ;
		if (piece == null) throw new IllegalArgumentException() ;
		if ((canRemovePiece(piece,row,column))==true) {
			int vor_row = piece.getRotationPoint().getRow() ;
			int vor_column = piece.getRotationPoint().getColumn() ;
			for (int i = 0 ; i < piece.getHeight() ; i++){
				for (int j = 0 ; j < piece.getWidth() ; j++){
				    if (piece.getBody()[i][j]) 
						Bor[row-vor_row+i][column-vor_column+j] = null ;
				    }
				}
			}
	}

	@Override
	public boolean canRemovePiece(Piece piece, int row, int column) {
		if (piece == null) throw new IllegalArgumentException() ;
		if (row >= this.Rows || row < 0 || column >= this.Columns || column < 0 ) return false ; 
		int vor_row = piece.getRotationPoint().getRow() ;
		int vor_column = piece.getRotationPoint().getColumn() ;
		for (int i = 0 ; i < piece.getHeight() ; i++){
			for (int j = 0 ; j < piece.getWidth() ; j++){
				if (piece.getBody()[i][j] == true ) {
					if ((row-vor_row+i) >= this.Rows || (row-vor_row+i) < 0) return false ;
					if ((row-vor_row) >= this.Rows || (row-vor_row) < 0) return false ;
					if ((column-vor_column+j) >= this.Columns || (column-vor_column+j) < 0) return false ;
					if ((column-vor_column) >= this.Columns || (column-vor_column) < 0) return false ;
					if(Bor[row-vor_row+i][column-vor_column+j] != piece.getPieceType()) return false ;
				}
			}
		}
	  return true;
	}

	@Override
	public int deleteCompleteRows() {
		int null_check = 0 ;
		int row_check = 0 ;
		for ( int i = (this.Rows-1)  ; i >= 0 ; i--) {
			for ( int j = 0 ; j < this.Columns ; j++) {
				if (Bor[i][j] == null) null_check++ ;
			}
			if (null_check == 0){
				row_check++ ;
				for ( int del = 0 ; del < this.Columns ; del++) {
					Bor[i][del] = null ;
				}
				for ( int x = (i-1)  ; x >= 0 ; x--) {
					for ( int y = 0 ; y < this.Columns ; y++) {
						Bor[x+1][y] = Bor[x][y] ; 
					}
				}
				i++ ;
			}else null_check = 0 ;
		}
		return row_check;
	}

	@Override
	public Board clone() {
		PieceType[][] new_bor = null ;
		for (int i = 0 ; i < Rows ; i++ ) {
			for (int j = 0 ; j < Columns ; j++ ) {
				new_bor[i][j] = this.Bor[i][j] ;
			}
		}
		return new Imp_Board(new_bor);
	}

}
