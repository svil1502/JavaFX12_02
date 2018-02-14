package DB;

import org.firebirdsql.gds.impl.GDSType;
import org.firebirdsql.management.FBManager;

import java.sql.*;



import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FirebirdConnection {
//jdbc:firebirdsql:localhost/3050:/Users/svetlanailina/Desktop/JAVAFX/JavaFX12_02/DB/EXAM.FD




    public static Connection Connector() {

        //String strDatabasePath = "/Users/svetlanailina/Desktop/JAVAFX/JavaFX12_02/EXAM.FDB";

        //String strURL = "jdbc:firebirdsql:localhost/3050:" + strDatabasePath + "?lc_ctype=WIN1251;sql_dialect=3";

        String strURL = "jdbc:firebirdsql:embedded:EXAM.FDB";

        String strUser = "SYSDBA";
        String strPassword = "sysdba";


        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            Connection conn = DriverManager.getConnection(strURL, strUser, strPassword);
            System.out.println("База есть");
            return conn;

        } catch (Exception e) {
            System.out.println("Базы нет");
            return null;
        }
    }

//
//    private static Connection conn;
//
//    public static Connection getConnection(){
//        String strDatabasePath = "/Users/svetlanailina/Desktop/JAVAFX/JavaFX12_02/DB/EXAM.FDB";
//        //String strURL = "jdbc:firebirdsql:localhost/3050:" + strDatabasePath + "?lc_ctype=WIN1251;sql_dialect=3";
//        String strUser = "SYSDBA";
//        String strPassword = "sysdba";
//
//        try {
//            Driver driver = (Driver) Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
//
//            // путь к БД желательно выносить в отдельный файл настроек
//           // String url = "jdbc:sqlite:db\\addressbook.db";
//            //String strURL = "jdbc:firebirdsql:localhost/3050:" + strDatabasePath + "?lc_ctype=WIN1251;sql_dialect=3";
//           String strURL = "jdbc:firebirdsql:localhost/3050:" + strDatabasePath + "?lc_ctype=WIN1251;sql_dialect=3";
//            //String strURL = "jdbc:firebirdsql:db\\EXAM.FDB:" + "?lc_ctype=WIN1251;sql_dialect=3";
//
//            if (conn==null) {
//                conn = DriverManager.getConnection(strURL);
//
//                System.out.println("База есть");
//            }
//
//            return conn;
//
//        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
//            Logger.getLogger(FirebirdConnection.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Базы нет");
//        }
//
//        return null;
//    }
//

}
