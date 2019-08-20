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
public class MemoriaCache {
    private String []valores;
    
    public MemoriaCache(){ 
        this.valores =  new String[4];
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
}

