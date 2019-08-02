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
public class Processador {
    public Registrador[] registradores = new Registrador[8];
    public Decodificador decodificador;
    
    public Processador(){
        for(int i = 0; i < 8; i++){
            this.registradores[i] = new Registrador();
            this.decodificador = new Decodificador(this);
        }
    }
    
    public double[] getValoresRegistradores(){
        double[] valores = new double[8];
        for(int i = 0; i < 8; i++){
            valores[i] = this.registradores[i].getValor();
        }
        return valores;
    }
}
