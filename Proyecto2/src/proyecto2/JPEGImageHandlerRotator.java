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
public class JPEGImageHandlerRotator extends ImageHandler {
protected String guardar;
protected String nuevoNombre;
protected String path;
protected BufferedImage horizontal;
    protected BufferedImage vertical;
    
    
    public JPEGImageHandlerRotator(String filename, String filepath) {
        super(filename, filepath);
        int indiceInicial = super.getFileName().lastIndexOf("-") + 1;
        int indiceFinal = super.getFileName().lastIndexOf(".");
        this.nuevoNombre = filename.substring(indiceInicial, indiceFinal);
        this.guardar = "C:\\Users\\natalia\\Documents\\rep\\IPC1_S12023_Proyecto2_202200007\\Proyecto2\\temporal\\";
    }
public void rHorizontal(BufferedImage imagen) {
    int width = imagen.getWidth();
    int height = imagen.getHeight();

    BufferedImage imagenH = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    for (int i = 0; i < width; i++) {
        for (int j = 0; j < height; j++) {
            int p = imagen.getRGB(i, j);
            imagenH.setRGB(width - i - 1, j, p);
        }
    }

    try {
        path = guardar + "Hrotation-" + nuevoNombre + ".jpeg";
        ImageIO.write(imagenH, "JPEG", new File(path));
    } catch (IOException e) {
        System.err.println("ERROR: " + e.getMessage());
    }
}

public void rVertical(BufferedImage imagen) {
    

    int width = imagen.getWidth();
    int height = imagen.getHeight();

    BufferedImage rotatedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    for (int i = 0; i < width; i++) {
        for (int j = 0; j < height; j++) {
            int p = imagen.getRGB(i, j);
            rotatedImage.setRGB(i, height - j - 1, p);
        }
    }

    try {
        path = guardar + "Vrotation-" + nuevoNombre + ".jpeg";
        ImageIO.write(rotatedImage, "JPEG", new File(path));
    } catch (IOException e) {
        System.err.println("ERROR: " + e.getMessage());
    }
}

    @Override
    public void readFile() throws Exception {
        File archivo = new File(this.handledFilePath);
        horizontal = ImageIO.read(archivo);;
        vertical = ImageIO.read(archivo);;
    }

    @Override
    public void generateFiles() throws Exception {
        rHorizontal(horizontal);
        rVertical(vertical);
    }
    
}
