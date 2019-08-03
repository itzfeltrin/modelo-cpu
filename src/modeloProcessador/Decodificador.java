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
public class Decodificador {
    private Processador proc;
    private String aDecodificar; 
    private String operacao; 
    private String operando1; 
    private String operando2;
    
    public Decodificador(Processador proc){
        this.proc = proc;
        this.aDecodificar = null;
        this.operacao = null;
        this.operando1 = null;
        this.operando2 = null;
    }
    
    public void decodificar(String frase) throws Exception{
        this.aDecodificar = frase;
        this.aDecodificar = this.aDecodificar.replaceAll(", ", " ");
        String[] split = this.aDecodificar.split(" ");
        if(split[1].charAt(0) != 'r' && split[1].charAt(0) != 'R'){
            throw new Exception("Comando inválido!");
        }
        else {
            if(split[0].toUpperCase().equals("MOV")){
                mover(split[1], split[2]);
            }
            else if(split[0].toUpperCase().equals("ADD")){
                somar(split[1], split[2]);
            }        
            else if(split[0].toUpperCase().equals("SUB")){
                subtrair(split[1], split[2]);
            }
        }
    }
    
    public void mover(String operando1, String operando2){        
        int index1 = Integer.parseInt(Character.toString(operando1.charAt(1)));        
        operando2 = operando2.replaceAll("#", "");        
        this.proc.registradores[index1].setValor(Double.parseDouble(operando2));
        this.proc.registradores[index1].setUsed();
    }
    
    public void somar(String operando1, String operando2) throws Exception{        
        int index1 = Integer.parseInt(Character.toString(operando1.charAt(1)));
        if(operando2.charAt(0) == 'R' || operando2.charAt(0) == 'r'){
            int index2 = Integer.parseInt(Character.toString(operando2.charAt(1)));
            this.proc.registradores[index1].setValor((Double) this.proc.registradores[index1].getValor() + (Double) this.proc.registradores[index2].getValor());
        }
        else {
            operando2 = operando2.replaceAll("#", "");
            this.proc.registradores[index1].setValor((Double) this.proc.registradores[index1].getValor() + Double.parseDouble(operando2));
        }
    }
    
    public void subtrair(String operando1, String operando2) throws Exception{        
        int index1 = Integer.parseInt(Character.toString(operando1.charAt(1)));
        int index2 = Integer.parseInt(Character.toString(operando2.charAt(1)));
        this.proc.registradores[index1].setValor((Double) this.proc.registradores[index1].getValor() - (Double) this.proc.registradores[index2].getValor());
    }
}
