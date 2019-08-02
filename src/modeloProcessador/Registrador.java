/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloProcessador;

/**
 *
 * @author itzfeltrin
 */
public class Registrador {
    private double valor;
    
    Registrador(){
        this.valor = 0.00;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
}
