package tetris.game.pieces;
import java.util.Random;


import tetris.game.pieces.Piece.PieceType;

public class Factory_Imp implements PieceFactory {

	Random r;
	
	public Factory_Imp(Random r) {
		super();
		this.r = r;
	}

	@Override
	public Piece getIPiece() {
		boolean[][] i_body = new boolean[][] {
			new boolean[] { true },
			new boolean[] { true },
			new boolean[] { true },
			new boolean[] { true },
			} ;
		return new Pieces_Imp (i_body,PieceType.I,new Point(1,0) ) ;
	}

	@Override
	public Piece getJPiece() {
		boolean[][] j_body = new boolean[][] {
			new boolean[] { false , true },
			new boolean[] { false , true },
			new boolean[] { true , true },
			} ;
		return new Pieces_Imp (j_body,PieceType.J,new Point(1,1)) ;
	}

	@Override
	public Piece getLPiece() {
		boolean[][] l_body = new boolean[][] {
			new boolean[] { true , false },
			new boolean[] { true , false },
			new boolean[] { true , true },
			} ;
		return new Pieces_Imp (l_body,PieceType.L,new Point(1,0)) ;
	}

	@Override
	public Piece getOPiece() {
		boolean[][] o_body = new boolean[][] {
			new boolean[] { true , true },
			new boolean[] { true , true },
			} ;
		return new Pieces_Imp (o_body, PieceType.O,new Point(1,1)) ;
	}

	@Override
	public Piece getSPiece() {
		boolean[][] s_body = new boolean[][] {
			new boolean[] { false , true , true },
			new boolean[] { true , true , false },
			} ;
		return new Pieces_Imp (s_body, PieceType.S ,new Point(1,1) ) ;
	}

	@Override
	public Piece getZPiece() {
		boolean[][] z_body = new boolean[][] {
			new boolean[] { true , true , false },
			new boolean[] { false , true , true },
			} ;
		return new Pieces_Imp (z_body, PieceType.Z ,new Point(1,1)) ;
	}

	@Override
	public Piece getTPiece() {
		boolean[][] t_body = new boolean[][] {
			new boolean[] { true , true , true },
			new boolean[] { false , true , false },
			} ;
		return new Pieces_Imp (t_body,PieceType.T,new Point(0,1)) ;
	}

	@Override
	public Piece getNextRandomPiece() {
		int n = r.nextInt(7);
			
		Piece[] array = new Piece[7] ;
		array[0] = getIPiece();
		array[1] =  getJPiece();
		array[2] =  getLPiece();
		array[3] =  getOPiece();
		array[4] =  getSPiece();
		array[5] =  getZPiece();
		array[6] =  getTPiece();
		
		return array[n] ;
	}

}
