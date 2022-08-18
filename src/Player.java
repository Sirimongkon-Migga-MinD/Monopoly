public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;

    Player(String name, Die[] dice, Board board){
        this.name = name;
        this.dice = dice;
        this.board = board;

        this.piece = new Piece();
    }

    public void takeTurn(){
        int faceValue = 0;
        for(int i = 0; i < dice.length; i++){
            dice[i].roll();

            faceValue += dice[i].getFaceValue();
        }

        Square oldLoc = this.piece.getLocate();
        Square newLoc = this.board.getSquares(oldLoc, faceValue);
        this.piece.setLocate(newLoc);

        System.out.printf("\nsum of dices = %d\n",faceValue);
        System.out.printf("old Location = %s => new Location = %s\n",oldLoc.getName(),piece.getLocate().getName());
        System.out.println("");
    }

    public String getName()  {return name;}
}
