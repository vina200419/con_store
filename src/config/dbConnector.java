
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class dbConnector {
//dbConnector code
private Connection connect;
public dbConnector(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/constore", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }



//Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            java.sql.Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
        



//Function to save data

public boolean insertData(String sql){
try{
PreparedStatement pst = connect.prepareStatement(sql);
 pst.executeUpdate();
System.out.println("Inserted Successfully!");
pst.close();
return true;
}catch(SQLException ex){
System.out.println("Connection Error: "+ex);
return false;
}
}
//Function to update data
public void updateData(String sql){
try{
PreparedStatement pst = connect.prepareStatement(sql);
int rowsUpdated = pst.executeUpdate();
if(rowsUpdated > 0){
JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
}else{
System.out.println("Data Update Failed!");
}
pst.close();
}catch(SQLException ex){
System.out.println("Connection Error: "+ex);
}
}


} 