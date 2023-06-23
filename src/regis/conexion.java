
package regis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 


public class conexion {
    
    public static Connection getConexion(){
        
      String url="jdbc:sqlserver://localhost:1433;"
              +"database=proffi;"
              +"user=sa;"
              +"password=123456Pc;"
              +"loginTimeout=30;";
    try{
        Connection con = DriverManager.getConnection(url);
        return con;
    }catch(SQLException ex){
        System.out.println(ex.toString());
        return null;
    }         
        
    }
}
