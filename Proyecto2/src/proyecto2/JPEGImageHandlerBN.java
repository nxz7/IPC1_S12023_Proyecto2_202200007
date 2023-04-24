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
public class JPEGImageHandlerBN extends ImageHandler {
protected String guardar;
protected String nuevoNombre;
protected String path;
protected BufferedImage imagenByN;


    public JPEGImageHandlerBN(String filename, String filepath) {
        super(filename, filepath);
        int indiceInicial = super.getFileName().lastIndexOf("-") + 1;
        int indiceFinal = super.getFileName().lastIndexOf(".");
        this.nuevoNombre = filename.substring(indiceInicial, indiceFinal);
        this.guardar = "C:\\Users\\natalia\\Documents\\rep\\IPC1_S12023_Proyecto2_202200007\\Proyecto2\\temporal\\";
    }
    
    public void ByN(BufferedImage imagen) {
    int width = imagen.getWidth();
    int height = imagen.getHeight();

    BufferedImage imagenByN = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    for (int i = 0; i < width; i++) {
        for (int j = 0; j < height; j++) {
            int p = imagen.getRGB(i, j);

            int r = (p >> 16) & 0xff;
            int g = (p >> 8) & 0xff;
            int b = p & 0xff;

            int avg = (r + g + b) / 3;
            int bw = (avg << 16) | (avg << 8) | avg;

            imagenByN.setRGB(i, j, bw);
        }
    }

    try {
        path = guardar + "ByN-" + nuevoNombre + ".jpeg";
        ImageIO.write(imagenByN, "JPEG", new File(path));
    } catch (IOException e) {
        System.err.println("ERROR: " + e.getMessage());
    }
}



    @Override
    public void readFile() throws Exception {
        File archivo = new File(this.handledFilePath);
       imagenByN = ImageIO.read(archivo);;
    }
    

    @Override
    public void generateFiles() throws Exception {
        ByN(imagenByN);
    
    }
        
    
}
