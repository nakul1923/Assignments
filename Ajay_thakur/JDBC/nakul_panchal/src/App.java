import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException  {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beans", "root", "root");

        Statement  st = con.createStatement();

        ResultSet rs =  st.executeQuery("select * from emp30");
    
        while(rs.next()){

            System.out.println(rs.getString(2));
        }
    

    }
}
