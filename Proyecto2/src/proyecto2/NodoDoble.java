/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author natalia
 */
import java.awt.Image;


public class NodoDoble {
    private Image valor;
    
    private NodoDoble next;
    private NodoDoble back;

    public NodoDoble(Image valor, NodoDoble next, NodoDoble back) {
        this.valor = valor;
        this.next = next;
        this.back = back;
    }
    
    public NodoDoble(Image valor, NodoDoble back) {
        this.valor = valor;
        this.next = null;
        this.back = back;
    }
    
    public NodoDoble(Image valor) {
        this.valor = valor;
        this.next = null;
        this.back = null;
    }

    public Image getValor() {
        return valor;
    }

    public void setValor(Image valor) {
        this.valor = valor;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getBack() {
        return back;
    }

    public void setBack(NodoDoble back) {
        this.back = back;
    }
}