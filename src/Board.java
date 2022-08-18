public class Board {
    private static int nameSquare = 40;
    private  Square[] squares ;

    public Board(int numSquare){
        squares = new Square[numSquare] ;
        for (int i = 0; i < numSquare; i++) {
            squares[i] = new Square("/ /"+i);
        }
    }

    public Square getStartSquare(){
        return squares[0];
    }

    public Square getSquares(Square oldLoc, int fvTot) {
        int oldLocate = Integer.parseInt(oldLoc.getName());
        int newLocate = oldLocate + fvTot;
        if (newLocate > nameSquare-1) {
            newLocate = Math.abs(newLocate-nameSquare);
        }
        return newLocate;
    }
}
