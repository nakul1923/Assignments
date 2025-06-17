import java.sql.*;

class Main{


    public static final String url="jdbc:mysql://127.0.0.1:3306/beans";

    public static final String username= "root";

    public static final String password= "root";

    public static void main(String[] args) {

       try{

           Class.forName("com.mysql.cj.jdbc.Driver");

       } catch(ClassNotFoundException e){

           System.out.println(e.getMessage());
       }

       try{

           Connection con = DriverManager.getConnection(url,username,password);
           Statement stm = con.createStatement();
           String query = "select * from employee";
           ResultSet rs = stm.executeQuery(query);

           while(rs.next()){


               int id = rs.getInt(1);
               String name = rs.getString(2);
               String department = rs.getString(3);
               double salary = rs.getDouble(4);

               System.out.println("ID: "+id);
               System.out.println("NAME: "+name);
               System.out.println("DEPARTMENT: "+department);
               System.out.println("SALARY: "+salary);
           }
       } catch (SQLException e) {

           System.out.println(e.getMessage());
       }
    }
}