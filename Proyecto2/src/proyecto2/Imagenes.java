/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Imagenes implements Serializable {

    private static final long serialVersionUID = 1L;
    private Node inico;
    private Node fin;

    public Imagenes() {
        inico = null;
        fin = null;
    }

    public void addImage(Image image) {
        ImageIcon icon = new ImageIcon(image);
        Node newNode = new Node(icon);

        if (inico == null) {
            inico = newNode;
            fin = newNode;
        } else {
            inico.siguinte = newNode;
            newNode.prev = inico;
           fin = newNode;
        }
    }

    public void serialize(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
