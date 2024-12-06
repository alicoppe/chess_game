public class Rook extends Piece{

    public Rook(int x, int y, Side side, Board b) {
        super(x, y, side, b);
    }

    @Override
    public boolean canMove(int destX, int destY) {
        if (this.x == destX || this.y == destY) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♜" : "♖";
    }
}

