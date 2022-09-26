package conect;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBD {
            public Connection Connection(){
                Connection con = null;
                try{
                    String url = "jdbc:mysql//localhost:3306//crud?user=root&password=";
                    con = DriverManager.getConnection(url);
            }catch (SQLException erro){
             JOptionPane.showMessageDialog(null,"Connection" + erro.getMessage());
            }
                return con;
    }            
}