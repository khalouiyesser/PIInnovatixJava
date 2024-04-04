package Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Db {
    static String user = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost:3306/efbaa";
    static Connection connection;
    //static String driver = "com.mysql.cj.jdbc.Driver";
   static Db instance;
   private Db(){
       try{
           connection = DriverManager.getConnection(url,user,password);
           System.out.println("connection établie");
       } catch (SQLException e) {
           System.out.println("pas de connexion avec bd");;
       }
   }
   public static Db getInstance(){
       if (instance == null){
           instance = new Db();
       }
       return instance;
   }
public Connection getConnection(){return connection;}

    public static void main(String[] args) {
        try{
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("connection établie");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
