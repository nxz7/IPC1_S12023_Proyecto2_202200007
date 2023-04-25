/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author natalia
 */
public class ImagenesUsuarios extends ImageHandler {

    
    protected byte[] filebytes;
    
    protected String copyname;

    
    public ImagenesUsuarios(String filename, String filepath) {
     super(filename, filepath);
        int indiceInicial = super.getFileName().lastIndexOf("-") + 1;
        int indiceFinal = super.getFileName().lastIndexOf(".");        
        this.copyname = "usuario-" + filename.substring(indiceInicial, indiceFinal);
    }

    // leerlo pasarlo a BMP con el BmpHandler copy y luego copia de esa en jpeg
    @Override
    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream(this.handledFilePath);
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.handledFileName);

    }

    
    @Override
    public void generateFiles() throws Exception {
        
        String temporal = "C:\\Users\\natalia\\Documents\\rep\\IPC1_S12023_Proyecto2_202200007\\Proyecto2\\categorias\\";
        
        FileOutputStream output = new FileOutputStream( temporal +copyname + ".jpeg");
        output.write(filebytes);
        output.close();
           
    }
}