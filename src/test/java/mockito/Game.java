package mockito;

public class Game  {
    GameNumGen gameNumGen;
    String answer;

    public Game(GameNumGen gen) {
        this.gameNumGen = gen;
    }

    public void init(GameLevel gameLevel) {
        this.answer = gameNumGen.generate(gameLevel);
    }
}
