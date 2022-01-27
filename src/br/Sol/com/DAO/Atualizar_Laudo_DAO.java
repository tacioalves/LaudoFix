/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.Sol.com.DAO;


import br.Sol.com.model.Informacoes_Laudo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tacio.santos
 */
public class Atualizar_Laudo_DAO {
    
    private final Connection connection;

    public Atualizar_Laudo_DAO(Connection connection) {
        this.connection = connection;
    }


    public void insert(Informacoes_Laudo informacoes) throws SQLException{
     
     
             Connection conexao = new Conexao().getConnection();
             String sql = "update public.laudo set numero_laudo_detran = '"+informacoes.getNumeroLaudoDetran()+"', status = '1' where numero_laudo = '"+informacoes.getNumeroLaudoSGC()+"'";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.execute();

}
    
     public boolean autenticarLaudo(Informacoes_Laudo laudo) throws SQLException {
              String sql = "select * from public.laudo where chassi = '"+laudo.getChassi()+"' and numero_laudo ='"+laudo.getNumeroLaudoSGC()+"'and status = 4 and numero_laudo_detran is null";
              PreparedStatement statement = connection.prepareStatement(sql);
              statement.execute();
              
              ResultSet resultset = statement.getResultSet();
              return resultset.next();


}

    
    
    
    
    
    
}
