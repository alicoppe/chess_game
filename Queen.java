public class Queen extends Piece{
    public Queen (int x, int y, Side side, Board b) {
        super(x, y, side, b);
    }

    @Override
    public boolean canMove(int destX, int destY) {
        if (Math.abs(this.x-destX) == Math.abs(this.y-destY) || (this.x == destX) || (this.y == destY)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♛" : "♕";
    }
}
