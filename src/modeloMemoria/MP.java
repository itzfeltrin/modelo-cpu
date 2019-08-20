/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloMemoria;

import java.util.ArrayList;

/**
 *
 * @author itzfeltrin
 */
public class MP {
    public String []valores;
    
    public MP(){ 
        this.valores =  new String[32];
        for(String obj : this.valores) {
            obj = null;
        }
    }
    
    public ArrayList<String[]> getValores(){
        ArrayList<String[]> result = new ArrayList<>();
        for(int i = 0; i < this.valores.length; i++) {
            String []aux = {("00" + i), this.valores[i]};
            result.add(aux);
        }
        return result;
    }
    
    public void addInstrucoes(String[] instrucoes) {
        for(int i = 0; i < instrucoes.length; i++) {
            this.valores[i] = instrucoes[i];
        }        
    }
    
    public int totalIndex() {
        for(int i = 0; i < this.valores.length; i++) {
            if(this.valores[i] == null) {                
                return i;                
            }
        }
        return 0;
    }
}
