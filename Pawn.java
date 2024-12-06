public class Pawn extends Piece{
    public Pawn (int x, int y, Side side, Board b) {
        super(x, y, side, b);
    }

    @Override
    public boolean canMove(int destX, int destY) {
        int start_position = (this.getSide() == Side.BLACK ? 1 : 6);
        int direction = (this.getSide()==Side.BLACK ? 1 : -1);
        if (destY-this.y == 1*direction && destX-this.x==0&&board.get(destX,destY)==null) {
            return true;
        }
        if (board.get(destX,destY)!=null && board.get(destX,destY).getSide() != getSide()){
            if (destY-this.y==1*direction && Math.abs(destX-this.x)==1){
                return true;
            }
        }
        if (y == start_position && destX-this.x==0 && destY-this.y==2*direction){
            // should maybe check if x value is the same
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♟" : "♙";
    }
}
