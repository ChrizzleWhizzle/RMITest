import java.rmi.RemoteException;
import java.rmi.server.*;


public class HighScoreImpl
        extends UnicastRemoteObject
        implements HighScore
{
    private String name;
    private int score;

    public HighScoreImpl()
            throws RemoteException
    {
    }

    public void setHighScore(String name, int highScore)
            throws RemoteException
    {
        // setze highscore
        this.name = name;
        this.score = highScore;
        System.out.println("New Highscore added: " + name + "(" + highScore + ")");
    }

    public int getHighestScore()
            throws RemoteException
    {
        int        HighestScore=this.score;
        // get highest score from list
        return(HighestScore);
    }
}