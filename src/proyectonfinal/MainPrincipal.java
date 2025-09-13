/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectonfinal;

import Conexion.CreateConection;
import java.sql.SQLException;
//librerian para manipular datos
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author Dell1
 */
public class MainPrincipal {
    public static void main(String[] args) throws SQLException {
        CreateConection conexionPostgres = new CreateConection();
        Connection con = conexionPostgres.getConection();
        try {
            Statement smt = con.createStatement();
        String qry = "insert into public.cliente (nombre,apellido,limite_credito)" +
           "values ('pedro','pedrito',1000)";
        int filasInsertadas = smt.executeUpdate(qry);
            System.out.println("Total de Registros "
                    + "insertados"+filasInsertadas);
            smt.close();     
        } catch (SQLException e){
            e.getMessage();
        }
    }
    
}
