import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion 
{

    private static final String URL = "jdbc:mysql://localhost:3306/projet_agricole";

    private static final String USER = "ndee_fatou";

    private static final String PASSWORD = "mot_de_passe";

    public static Connection getConnection() throws SQLException 
    {

        return DriverManager.getConnection
        (
                URL,
                USER,
                PASSWORD
        );
    }
}
