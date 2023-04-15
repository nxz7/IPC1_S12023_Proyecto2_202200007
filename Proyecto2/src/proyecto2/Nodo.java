/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.io.Serializable;

/**
 *
 * @author natalia
 */
public class Nodo implements Serializable {
    Usuario dato;
    Nodo siguiente;
    
    public Usuario getUsuario(){
    return dato;
    }
    
    
    public void setDato(Usuario dato){
    this.dato = dato;
    }
}


