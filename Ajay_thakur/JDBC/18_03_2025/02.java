import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Main {
    public static void main(String[] args) throws SQLException  {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beans", "root", "root");

        Statement  st = con.createStatement();

        Scanner sc = new Scanner(System.in);

        int id = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        int salary = Integer.parseInt(sc.nextLine());

        String query = String.format("insert into employee(id,name,salary) values(%d,'%s',%d)",id,name,salary);
        st.executeUpdate(query);

        System.out.println("done");
    

    }
}
