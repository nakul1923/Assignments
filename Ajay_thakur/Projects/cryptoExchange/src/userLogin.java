import java.sql.*;
import java.util.Scanner;

public class userLogin {

    private static String url = "jdbc:mysql://127.0.0.1:3306/project";
    private static String user = "root";
    private static String password = "root";

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public static void main(String[] args) throws SQLException {

        System.out.println("Enter 1 to login \nEnter 2 to signUp");

        Scanner sc = new Scanner(System.in);

        Connection con = getConnection();

        int choice = sc.nextInt();
        sc.nextLine();

        if(choice==1){

            System.out.println("Now youre in login page\n");

            System.out.println("Enter phone");
            String phone = sc.nextLine();

            System.out.println("Enter password");
            String password = sc.nextLine();

            String sql = "SELECT * FROM user_details where phone = ? AND password = ?";

            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1,phone);
            pstm.setString(2,password);

            ResultSet rs = pstm.executeQuery();

            if(rs.next()==false){

                System.out.println("Wrong id and password");

            } else{

                System.out.println(rs.getString(2));
            }
        }

        if(choice==2){

            System.out.println("Enter name: ");
            String name = sc.nextLine();

            System.out.println("Enter phone: ");
            String phone = sc.nextLine();

            System.out.println("Enter password: ");
            String password = sc.nextLine();

            String sql = "INSERT INTO user_details(name,phone,password) VALUES(?,?,?)";

            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, name);
            pstm.setString(2,phone);
            pstm.setString(3,password);

            pstm.executeUpdate();

            System.out.println("Data inserted successfully");


        }
    }
}
