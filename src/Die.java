import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private int faceValue;

    public int roll(){
        return ThreadLocalRandom.current().nextInt(6)+1;
    }

    public int getFaceValue(){
        return faceValue;
    }
}
