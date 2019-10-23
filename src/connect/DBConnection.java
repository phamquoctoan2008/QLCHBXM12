package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	 // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
    static final String DB_URL = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=QuanLyCuaHangBanXeMay";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "sapassword";
   
    static Connection conn ;

    public DBConnection() {
        try{
           //STEP 2: Register JDBC driver
           Class.forName(JDBC_DRIVER);

           //STEP 3: Open a connection
           System.out.println("Connecting to a selected database...");
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           System.out.println("Connected database successfully...");
        } catch (SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public static Connection getConn(){
        return conn;
    }
    
    
//     public static void main(String args[]) {
//         new DBConnection().getConn();
//     }
}
