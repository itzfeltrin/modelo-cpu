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
public class SREG {
    private boolean[] valores;
    
    public SREG() {
        this.valores = new boolean[4];
        for(boolean obj : this.valores) {
            obj = false;
        }
    }
    
    public void changeValue(int index) {
        this.valores[index] = !this.valores[index];
    }
    
    public Integer[] getValues() {
        Integer[] result = new Integer[4];
        for(int i = 0; i < this.valores.length; i++) { 
            result[i] = (this.valores[i] ? 1 : 0);
        }
        return result;
    }
}
