/*
 * Conexao.java
 *
 * Created on 11 de Julho de 2007, 09:56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conf;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Marcos H. Costa
 */
public class Conexao {
    
    private Connection con;
        
    public Conexao() {        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/proj_final", 
                    "root", 
                    "");                        
        }
        catch ( Exception e ){
            System.out.println("Falha na conexão");
            e.printStackTrace();
        }
    }
    
    public Connection getConexao(){
        return con;
    }     
    
}
