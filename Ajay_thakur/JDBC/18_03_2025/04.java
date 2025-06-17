import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Main {
    public static void main(String[] args) throws SQLException  {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beans", "root", "root");

        PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?)");

        Scanner sc = new Scanner(System.in);

        int id = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        int salary = Integer.parseInt(sc.nextLine());

        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(4, salary);
        pst.executeUpdate();

        System.out.println("done");
    

    }
}
