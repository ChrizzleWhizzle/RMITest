import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class HighScoreServer {

    public static void main(String[] args)
    {
        try {
            LocateRegistry.createRegistry(2020);
            Naming.bind("//localhost:2020/HighScore",
                    new HighScoreImpl() );
            System.out.println("finished rmi binding");
        } catch(Exception e) {
            // Registrieren des Remote-Objects fehlgeschlagen
            e.printStackTrace();
        }
    }
}