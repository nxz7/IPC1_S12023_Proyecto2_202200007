/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author natalia
 */
public class JPEGImageHandlerColors extends ImageHandler{

     //protected String prefijo;
    protected String save_file;
    protected String new_name;
    protected String new_path;
    
    protected BufferedImage imagenR;
    protected BufferedImage imagenV;
    protected BufferedImage imagenA;
    protected BufferedImage imagenS;

    public JPEGImageHandlerColors(String filename, String filepath) {
        super(filename, filepath);
        int indiceInicial = super.getFileName().lastIndexOf("-") + 1;
        int indiceFinal = super.getFileName().lastIndexOf(".");
        this.new_name = filename.substring(indiceInicial, indiceFinal);
        this.save_file = "C:\\Users\\natalia\\Documents\\rep\\IPC1_S12023_Proyecto2_202200007\\Proyecto2\\temporal\\";
    }

    public void rojo(BufferedImage imagen) {
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                int p = imagen.getRGB(i, j);
                int a = (p >> 24) & 0xff;
                int red = (p >> 16) & 0xff;
                
                p = (red << 16) | (a << 24);
                imagen.setRGB(i, j, p);
            }
        }
        try {
            new_path = save_file + "red-" + new_name +".jpeg";
            ImageIO.write(imagen, "JPEG", new File(new_path));
        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
    
    public void verde(BufferedImage imagen) {
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                int p = imagen.getRGB(i, j);
                int a = (p >> 24) & 0xff;
                int green = (p >> 8) & 0xff;
                
                p = (a << 24) | (green << 8);
                imagen.setRGB(i, j, p);
            }
        }
        try {
            new_path = save_file + "green-" + new_name + ".jpeg";
            ImageIO.write(imagen, "JPEG", new File(new_path));
        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
    
    public void azul(BufferedImage imagen) {
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                int p = imagen.getRGB(i, j);
                int a = (p >> 24) & 0xff;
                int blue = p & 0xff;
                
                p = (a << 24) | blue;
                imagen.setRGB(i, j, p);
            }
        }
        try {
            new_path = save_file + "blue-" + new_name + ".jpeg";
            ImageIO.write(imagen, "JPEG", new File(new_path));
        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
    
    public void sepia(BufferedImage imagen) {
    for (int i = 0; i < imagen.getWidth(); i++) {
        for (int j = 0; j < imagen.getHeight(); j++) {
            int p = imagen.getRGB(i, j);

            int a = (p >> 24) & 0xff;
            int r = (p >> 16) & 0xff;
            int g = (p >> 8) & 0xff;
            int b = p & 0xff;

            int tr = (int) (0.393 * r + 0.769 * g + 0.189 * b);
            int tg = (int) (0.349 * r + 0.686 * g + 0.168 * b);
            int tb = (int) (0.272 * r + 0.534 * g + 0.131 * b);

            if (tr > 255) {
                r = 255;
            } else {
                r = tr;
            }

            if (tg > 255) {
                g = 255;
            } else {
                g = tg;
            }

            if (tb > 255) {
                b = 255;
            } else {
                b = tb;
            }

            p = (a << 24) | (r << 16) | (g << 8) | b;
            imagen.setRGB(i, j, p);
        }
    }

    try {
        new_path = save_file + "sepia-" + new_name + ".jpeg";
        ImageIO.write(imagen, "JPEG", new File(new_path));
    } catch (IOException e) {
        System.err.println("ERROR: " + e.getMessage());
    }
}


    @Override
    public void readFile() throws Exception {
        File archivo = new File(this.handledFilePath);
        imagenR = ImageIO.read(archivo);;
        imagenV = ImageIO.read(archivo);;
        imagenA = ImageIO.read(archivo);;
        imagenS = ImageIO.read(archivo);;
        
    }

    @Override
    public void generateFiles() throws Exception {
        rojo(imagenR);
        azul(imagenA);
        verde(imagenV);
        sepia(imagenS);
    }

}


