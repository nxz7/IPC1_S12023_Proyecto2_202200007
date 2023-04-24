
package proyecto2;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author natalia
 */
public class Imagenes extends EstructuraDeDatos implements Serializable {

    private static final long serialVersionUID = 1L;
    private Node inico;
    private Node fin;
    private int tam=1;

    
    public Imagenes() {
        inico = null;
        fin = null;
    }
@Override
    public void add(Object e) {
        
        ImageIcon icon = (ImageIcon)e;
        Node newNode = new Node(icon);

        if (inico == null) {
            inico = newNode;
            fin = newNode;
        } else {
            inico.siguinte = newNode;
            newNode.prev = inico;
           fin = newNode;
        }
        tam++;
    }
    

    public void serialize(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public Node getFirst() {
    return inico;
}
    public static Serializable deserialize(String fileName) {
        Serializable list = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (Serializable) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    
 public Node get(int i) {
        if (i < 0 || i >= tam) {
            return null;
        }
        Node current = inico;
        for (int j = 0; j < i; j++) {
            current = current.siguinte;
        }
        return current;
    }
    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        return tam;
    }

    

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static class Node implements Serializable {

        private static final long serialVersionUID = 1L;
        private ImageIcon data;
        private Node prev;
        private Node siguinte;

        public Node(ImageIcon data) {
            this.data = data;
            prev = null;
            siguinte = null;
        }

        public ImageIcon getImageIcon() {
            return data;
        }
        
    }
    
}
