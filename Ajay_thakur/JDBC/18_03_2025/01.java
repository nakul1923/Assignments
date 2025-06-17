import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class Main {
    public static void main(String[] args) throws SQLException  {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beans", "root", "root");

        Statement  st = con.createStatement();

        ResultSet rs =  st.executeQuery("select * from employee where salary>50000");

        boolean flag = false;
    
        while(rs.next()){

            flag = true;

            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getInt(4));

        }
    

    }
}
