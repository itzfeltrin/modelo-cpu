/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloProcessador;

import java.util.ArrayList;
import java.util.List;
import modeloMemoria.MP;
import modeloMemoria.MemoriaCache;
import application.TelaMain;

/**
 *
 * @author itzfeltrin
 */
public class Processador {
    public Registrador[] registradores = new Registrador[8];
    public Decodificador decodificador;
    public MP memoriaPrincipal;
    public MemoriaCache cache;
    public SREG sreg;
    public TelaMain tela;
    
    public Processador(TelaMain tela){
        for(int i = 0; i < 8; i++){
            this.registradores[i] = new Registrador();            
        }
        this.decodificador = new Decodificador(this);
        this.memoriaPrincipal = new MP();
        this.cache = new MemoriaCache();
        this.sreg = new SREG();
        this.tela = tela;
    }
    
    public List<Object[]> getValoresRegistradores(){
        List<Object[]> lista = new ArrayList<>();
        for(int i = 0; i < 8; i++) {
            Object []aux = {"R" + i, this.registradores[i].getValor()};
            lista.add(aux);
        }
        return lista;        
    }
}
