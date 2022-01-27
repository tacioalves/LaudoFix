/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.Sol.com.Controller;

import br.Sol.com.DAO.Atualizar_Laudo_DAO;
import br.Sol.com.DAO.Conexao;
import br.Sol.com.model.Informacoes_Laudo;
import br.Sol.com.view.FIX2519_view;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tacio.santos
 */
public class Atualizar_Laudo_Controller {
    
    private FIX2519_view view;
   
    public Atualizar_Laudo_Controller(FIX2519_view view){
        this.view = view;
        
    }
    
   
    
    
    public void validarLaudo() throws SQLException {
       
       String chassi = view.getjTextFieldChassi().getText();
       
       String numeroDetranSGC = view.getjTextFieldNumeroLaudoSGC().getText();
       if(!numeroDetranSGC.matches("[0-9]*")){
             JOptionPane.showMessageDialog(view, "Os dados do Numero Laudo SGC estão incorretos");
             } else{
                 
        
       long  numeroSGC = Long.parseLong(numeroDetranSGC);
      
            
 
   
          
       Informacoes_Laudo dadosLaudo = new Informacoes_Laudo(chassi, 0, numeroSGC);
       
       Connection conexao = new Conexao().getConnection();
       Atualizar_Laudo_DAO autenticacaoLaudo = new  Atualizar_Laudo_DAO(conexao);
        
       boolean existe = autenticacaoLaudo.autenticarLaudo(dadosLaudo);
        
       if (existe){
           
            view.setTruejTextFieldNumeroLaudoSGA();
           
       } else{
            JOptionPane.showMessageDialog(view, "Para os dados em questão não possui registros de laudo sem numero Detran");

       }
                 
     }
      }
         
    
    
    
    public void atualizarLaudo(){
        
        
        String numeroDetranSGA = view.getjTextFieldNumeroLaudoSGA().getText();
        
     
            
            
        String numeroDetranSGC = view.getjTextFieldNumeroLaudoSGC().getText();
        String chassi = view.getjTextFieldChassi().getText();
        long  numeroDetran = Long.parseLong(numeroDetranSGA);
        long  numeroSGC = Long.parseLong(numeroDetranSGC);

   
            
     
        Informacoes_Laudo dadosLaudo = new Informacoes_Laudo(chassi, numeroDetran, numeroSGC);
        
        try{
           Connection conexao = new Conexao().getConnection();
             Atualizar_Laudo_DAO atualizarLaudo = new Atualizar_Laudo_DAO(conexao);
            atualizarLaudo.insert(dadosLaudo);

             JOptionPane.showMessageDialog(null, "Laudo cadastrado com sucesso, consulte no SGC");

         } catch(SQLException ex){
            Logger.getLogger(FIX2519_view.class.getName()).log(Level.SEVERE,null,ex);
  }   
 }
    }
    
    
    
    
    
    

