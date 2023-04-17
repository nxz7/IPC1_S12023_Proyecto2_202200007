/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;


import java.util.ArrayList;

public class Categorias extends EstructuraDeDatos {
    public ArrayList<String> Cat;
    
    public Categorias(String nombre) {
        this.nombre = nombre;
        //Cat = new ArrayList<String>();
        Cat = new ArrayList<>();
        Cat.add("General");
    }

    @Override
    public void add(Object e) {
        String nuevaCategoria = (String) e;
        if (!Cat.contains(nuevaCategoria)) {
            Cat.add(nuevaCategoria);
        }
    }

    @Override
    public Object peek() {
        if (Cat.size() > 0) {
            return Cat.get(Cat.size() - 1);
        }
        return null;
    }

    @Override
    public Object find(Object e) {
        String categoria = (String) e;
        if (Cat.contains(categoria)) {
            return categoria;
        }
        return null;
    }

    @Override
    public Object getNext() {
        if (index < Cat.size() - 1) {
            index++;
            return Cat.get(index);
        }
        return null;
    }

    @Override
    public int getSize() {
        return Cat.size();
    }

    @Override
    public Object get(int i) {
        if (i >= 0 && i < Cat.size()) {
            return Cat.get(i);
        }
        return null;
    }

    @Override
    public Object pop() {
        if (Cat.size() > 0) {
            return Cat.remove(Cat.size() - 1);
        }
        return null;
    }

    @Override
    public void delete(Object e) {
        String categoria = (String) e;
        Cat.remove(categoria);
    }
}

