/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.Sol.com.model;

import java.math.BigInteger;

/**
 *
 * @author tacio.santos
 */
public class Informacoes_Laudo {
    
    long numeroLaudoDetran;
    long numeroLaudoSGC;
    String chassi;
    
    
    public Informacoes_Laudo(String chassi,long numeroLaudoDetran, long numeroLaudoSGC){
        this.numeroLaudoDetran = numeroLaudoDetran;
        this.numeroLaudoSGC = numeroLaudoSGC;
        this.chassi = chassi;
       
    }

    public long getNumeroLaudoSGC() {
        return numeroLaudoSGC;
    }

    public void setNumeroLaudoSGC(long numeroLaudoSGC) {
        this.numeroLaudoSGC = numeroLaudoSGC;
    }
    

    public long getNumeroLaudoDetran() {
        return numeroLaudoDetran;
    }

    public void setNumeroLaudoDetran(long numeroLaudoDetran) {
        this.numeroLaudoDetran = numeroLaudoDetran;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    
    
    
    
    
}
