public class MGame {
    private int roundCat;
    private Die[] dice;
    private Board board;
    private Player[] players;
    private static int N = 0;

    public MGame(int numOfPlayer) {
        this(numOfPlayer,20);
    }
    public MGame
            (int numOfPlayer,int numRound){
        this(numOfPlayer,numRound,40);
    }
    public MGame(int numOfPlayer, int numRound, int numSquares){
        this(numOfPlayer,numRound,numSquares,2);
    }

    public MGame(int numOfPlayer, int numRound, int numSquares, int numDices){
        dice = new Die[numDices];
        players = new Player[numOfPlayer];
        board = new Board(numSquares);
        initDices();
        N = numRound;
        roundCat = 0;
        createPlayer(numOfPlayer);
    }



    public void createPlayer(int numPlayer){
        for (int i = 0; i < numPlayer; i++) {
            players[i] = new Player("Player : "+(i+1),dice,board);
        }
    }
    public void initDices(){
        int numDices = dice.length;
        for(int i = 0 ; i < numDices ; i++){
            dice[i] = new Die();
        }
    }

    public void playGame(){
        for ( ; roundCat < N ; roundCat++ ){
            System.out.println("Round : " + (roundCat+1));
            playRound();
        }

    }

    private void playRound(){
        int numOfPlayer = players.length;
        for(int i = 0 ; i < numOfPlayer ; i++ ){

            System.out.printf("%s => ",players[i].getName());
            players[i].takeTurn();
        }
        System.out.println();

    }


}
