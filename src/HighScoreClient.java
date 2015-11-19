import java.rmi.*;

public class HighScoreClient {

    public static void main(String[] args)
    {
        try {

            HighScore myHighScore = (HighScore) Naming.lookup("//localhost:2020/HighScore");

            myHighScore.setHighScore("Adele", 100);

            System.out.println(myHighScore.getHighestScore());
        } catch(Exception e) {
            // Zugriff auf Remote-Object fehlgeschlagen
            e.printStackTrace();
        }
    }
}