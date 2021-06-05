package tetris.game.pieces;

import java.util.ArrayList;
import java.util.Arrays;

public class Pieces_Imp implements Piece {

	private boolean[][] body ;
	private PieceType typ ;
	private Point rot_point ;
	private int Height ;
	private int Width ;
	
	public Pieces_Imp (boolean[][] body, PieceType typ ,Point rot_point ) {
		this.body = body ;
		this.rot_point = rot_point ;
		this.typ = typ ;
		this.Width = body[0].length ;
		this.Height = body.length ;
	}
	
	@Override
	public int getWidth() {
		return this.Width;
	}

	@Override
	public int getHeight() {
		return this.Height ;
	}

	@Override
	public boolean[][] getBody() {
		return this.body ;
	}

	@Override
	public Point getRotationPoint() {
		return this.rot_point;
	}
	
	@Override
	public PieceType getPieceType() {
		return typ ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pieces_Imp other = (Pieces_Imp) obj;
		if (!Arrays.deepEquals(body, other.body))
			return false;
		if (rot_point == null) {
			if (other.rot_point != null)
				return false;
		} else if (!rot_point.equals(other.rot_point))
			return false;
		if (typ != other.typ)
			return false;
		return true;
	}

	public ArrayList getCW_IRotation() {
		if (this.Height == 4 && this.Width == 1 && rot_point.getRow() == 1 && rot_point.getColumn() == 0){
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true , true }};
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.I) ;
				comp.add(new Point(0,2)) ;		
				return comp ;
			}else if (this.Height == 4 && this.Width == 1 && rot_point.getRow() == 2 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true , true }};
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.I) ;
				comp.add(new Point(0,1)) ;		
				return comp ;
			}else if (this.Height == 1 && this.Width == 4 && rot_point.getRow() == 0 && rot_point.getColumn() == 2) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true },
					new boolean[] { true },
					new boolean[] { true },
					new boolean[] { true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.I) ;
					comp.add(new Point(2,0)) ;		
					return comp ;
			}else if (this.Height == 1 && this.Width == 4 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true },
					new boolean[] { true },
					new boolean[] { true },
					new boolean[] { true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.I) ;
					comp.add(new Point(1,0)) ;		
					return comp ;	
			}else return null ;
	}
	
	public ArrayList getCW_LRotation() {
		if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true },
					new boolean[] { true , false , false }};
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.L) ;
				comp.add(new Point(0,1)) ;		
				return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , false , true },
					new boolean[] { true , true , true }};
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.L) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
		}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { false , true },
					new boolean[] { false , true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.L) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false },
					new boolean[] { true , false },
					new boolean[] { true , true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.L) ;
					comp.add(new Point(1,0)) ;		
					return comp ;
				
		} else return null ;
	}
	
	public ArrayList getCW_TRotation() {
		if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true },
					new boolean[] { true , true },
					new boolean[] { false , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.T) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false },
					new boolean[] { true , true },
					new boolean[] { true , false }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.T) ;
				comp.add(new Point(1,0)) ;		
				return comp ;
		}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true , false },
					new boolean[] { true , true , true }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.T) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true },
					new boolean[] { false , true , false }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.T) ;
					comp.add(new Point(0,1)) ;		
					return comp ;
			} else return null ;
	}
	
	public ArrayList getCW_JRotation() {
		if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , false },
					new boolean[] { true , false }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.J) ;
				comp.add(new Point(1,0)) ;		
				return comp ;
			}else if ( this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true },
					new boolean[] { false , true },
					new boolean[] { true , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.J) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
		}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1 ) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false , false },
					new boolean[] { true , true , true }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.J) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true },
					new boolean[] { false , false , true }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.J) ;
					comp.add(new Point(0,1)) ;		
					return comp ;
			} else return null ;
	}
	
	public ArrayList getCW_SRotation() {
		if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false },
					new boolean[] { true , true },
					new boolean[] { false , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.S) ;
				comp.add(new Point(1,0)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false },
					new boolean[] { true , true },
					new boolean[] { false , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.S) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
		}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true , true },
					new boolean[] { true , true , false }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.S) ;
					comp.add(new Point(0,1)) ;		
					return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true , true },
					new boolean[] { true , true , false }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.S) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}	else return null ;
	}
	
	public ArrayList getCW_ZRotation() {
		if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true },
					new boolean[] { true , true },
					new boolean[] { true , false }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.Z) ;
				comp.add(new Point(1,0)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true },
					new boolean[] { true , true },
					new boolean[] { true , false }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.Z) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
		}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , false },
					new boolean[] { false , true , true }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.Z) ;
					comp.add(new Point(0,1)) ;		
					return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , false },
					new boolean[] { false , true , true }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.Z) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}	else return null ;
	}
	
	public ArrayList getCW_ORotation() {
			if (this.Height == 2 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.O) ;
				comp.add(new Point(1,0)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.O) ;
				comp.add(new Point(0,0)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 2 && rot_point.getRow() == 0 && rot_point.getColumn() == 0){
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.O) ;
					comp.add(new Point(0,1)) ;		
					return comp ;
			}else if (this.Height == 2 && this.Width == 2 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.O) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			} else return null ;
	}
	
	@Override
	public Piece getClockwiseRotation() {
		ArrayList<Object> comp = new ArrayList<Object>() ;
		if (this.typ == Piece.PieceType.L ) {	
			comp = getCW_LRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else if (this.typ == Piece.PieceType.T ) {	
			comp = getCW_TRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point); 
		}else if (this.typ == Piece.PieceType.I ) {	
			comp = getCW_IRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point); 
		}else if (this.typ == Piece.PieceType.S ) {	
			comp = getCW_SRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else if (this.typ == Piece.PieceType.Z ) {	
			comp = getCW_ZRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else if (this.typ == Piece.PieceType.O ) {	
			comp = getCW_ORotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else if (this.typ == Piece.PieceType.J ) {	
			comp = getCW_JRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else return null ;
	}
	
	public ArrayList getACW_IRotation() {
		if (this.Height == 4 && this.Width == 1 && rot_point.getRow() == 1 && rot_point.getColumn() == 0){
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true , true }};
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.I) ;
				comp.add(new Point(0,1)) ;		
				return comp ;
			}else if (this.Height == 4 && this.Width == 1 && rot_point.getRow() == 2 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true , true }};
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.I) ;
				comp.add(new Point(0,2)) ;		
				return comp ;
		}else if (this.Height == 1 && this.Width == 4 && rot_point.getRow() == 0 && rot_point.getColumn() == 2) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true },
					new boolean[] { true },
					new boolean[] { true },
					new boolean[] { true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.I) ;
					comp.add(new Point(1,0)) ;		
					return comp ;
			}else if (this.Height == 1 && this.Width == 4 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true },
					new boolean[] { true },
					new boolean[] { true },
					new boolean[] { true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.I) ;
					comp.add(new Point(2,0)) ;		
					return comp ;
			}	else return null ;
	}
	
	public ArrayList getACW_LRotation() {
		if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , false , true },
					new boolean[] { true , true , true }};
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.L) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true },
					new boolean[] { true , false , false }};
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.L) ;
				comp.add(new Point(0,1)) ;		
				return comp ;
		}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false },
					new boolean[] { true , false },
					new boolean[] { true , true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.L) ;
					comp.add(new Point(1,0)) ;		
					return comp ;
			}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { false , true },
					new boolean[] { false , true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.L) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}else return null ;
	}
	
	public ArrayList getACW_TRotation() {
		if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false },
					new boolean[] { true , true },
					new boolean[] { true , false }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.T) ;
				comp.add(new Point(1,0)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true },
					new boolean[] { true , true },
					new boolean[] { false , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.T) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
		}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true },
					new boolean[] { false , true , false }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.T) ;
					comp.add(new Point(0,1)) ;		
					return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true , false },
					new boolean[] { true , true , true }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.T) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}else return null ;
	}
	
	public ArrayList getACW_JRotation() {
		if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true },
					new boolean[] { false , true },
					new boolean[] { true , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.J) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , false },
					new boolean[] { true , false }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.J) ;
				comp.add(new Point(1,0)) ;		
				return comp ;
		}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , true },
					new boolean[] { false , false , true }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.J) ;
					comp.add(new Point(0,1)) ;		
					return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false , false },
					new boolean[] { true , true , true }	};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.J) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}	else return null ;
	}
	
	public ArrayList getACW_SRotation() {
		if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false },
					new boolean[] { true , true },
					new boolean[] { false , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.S) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , false },
					new boolean[] { true , true },
					new boolean[] { false , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.S) ;
				comp.add(new Point(1,0)) ;		
				return comp ;
		}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true , true },
					new boolean[] { true , true , false }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.S) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true , true },
					new boolean[] { true , true , false }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.S) ;
					comp.add(new Point(0,1)) ;		
					return comp ;
			}	else return null ;
	}
	
	public ArrayList getACW_ZRotation() {
		if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true },
					new boolean[] { true , true },
					new boolean[] { true , false }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.Z) ;
				comp.add(new Point(1,1)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 3 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { false , true },
					new boolean[] { true , true },
					new boolean[] { true , false }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.Z) ;
				comp.add(new Point(1,0)) ;		
				return comp ;
		}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , false },
					new boolean[] { false , true , true }};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.Z) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}else if (this.Height == 3 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true , false },
					new boolean[] { false , true , true }	};
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.Z) ;
					comp.add(new Point(0,1)) ;		
					return comp ;
			}	else return null ;
	}
	
	public ArrayList getACW_ORotation() {
		if (this.Height == 2 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , true }	} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.O) ;
				comp.add(new Point(0,1)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 2 && rot_point.getRow() == 0 && rot_point.getColumn() == 1) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , true }} ;
				ArrayList<Object> comp = new ArrayList<Object>() ; 
				comp.add(new_body) ;
				comp.add(PieceType.O) ;
				comp.add(new Point(0,0)) ;		
				return comp ;
			}else if (this.Height == 2 && this.Width == 2 && rot_point.getRow() == 0 && rot_point.getColumn() == 0){
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , true }} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.O) ;
					comp.add(new Point(1,0)) ;		
					return comp ;
			}else if (this.Height == 2 && this.Width == 2 && rot_point.getRow() == 1 && rot_point.getColumn() == 0) {
				boolean[][] new_body = new boolean[][] {
					new boolean[] { true , true },
					new boolean[] { true , true }	} ;
					ArrayList<Object> comp = new ArrayList<Object>() ; 
					comp.add(new_body) ;
					comp.add(PieceType.O) ;
					comp.add(new Point(1,1)) ;		
					return comp ;
			}	else return null ;
	}

	@Override
	public Piece getCounterClockwiseRotation() {
		ArrayList<Object> comp = new ArrayList<Object>() ;
		if (this.typ == Piece.PieceType.L ) {	
			comp = getACW_LRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else if (this.typ == Piece.PieceType.T ) {	
			comp = getACW_TRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point); 
		}else if (this.typ == Piece.PieceType.I ) {	
			comp = getACW_IRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point); 
		}else if (this.typ == Piece.PieceType.S ) {	
			comp = getACW_SRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else if (this.typ == Piece.PieceType.Z ) {	
			comp = getACW_ZRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else if (this.typ == Piece.PieceType.O ) {	
			comp = getACW_ORotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else if (this.typ == Piece.PieceType.J ) {	
			comp = getACW_JRotation();
		    boolean[][] new_body = (boolean[][]) comp.get(0) ;
			PieceType new_type = (PieceType) comp.get(1) ;
			Point new_point = (Point) comp.get(2) ;
			return new Pieces_Imp (new_body, new_type , new_point);
		}else return null ;
	}

	@Override
	public Piece clone() {
		boolean[][] new_body = null ;
		for (int i = 0 ; i < Height ; i++ ) {
			for (int j = 0 ; j < Width ; j++ ) {
				new_body[i][j] = this.body[i][j] ;
			}
		}
		return new Pieces_Imp (new_body,this.typ,this.rot_point.clone());
	}

}
