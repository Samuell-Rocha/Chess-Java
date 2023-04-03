package chess;

import boardgame.Position;

public class ChessPosition {
	int column;
	int row;
	
	
	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	protected Position toPosition() {
		return null;
		
	}
	
	protected ChessPosition fromPosition(Position position) {
		this.column = position.getColumn();
		this.row = position.getRow();
		return null;
	}
}
