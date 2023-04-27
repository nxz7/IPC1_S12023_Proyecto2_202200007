/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;

import java.awt.Image;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author natalia
 */
public class Biblioteca extends javax.swing.JFrame {
public File fichero;
public ArrayList<String> Cat;
Imagenes imagenes = new Imagenes();
public String usuarioAc;




    public Biblioteca() {
        initComponents();
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                model.addRow(new Object[]{categorias.Cat.get(0)});
        /*try {
            imagenes = (Imagenes) Imagenes.deserialize("C:\\\\Users\\\\natalia\\\\Documents\\\\rep\\\\IPC1_S12023_Proyecto2_202200007\\\\Proyecto2\\\\imagenes.ser");
        } catch (Exception e) {
            imagenes = new Imagenes();
        }
         Image image = imagenes.get(currentImageIndex).getImageIcon().getImage();
        ImageIcon icono = new ImageIcon(image.getScaledInstance(mostrarImagen.getWidth(), mostrarImagen.getHeight(), Image.SCALE_DEFAULT));
        mostrarImagen.setIcon(icono);
        if (imagenes != null && imagenes.getFirst() != null) {
    ImageIcon icon = imagenes.getFirst().getImageIcon();
    Image img = icon.getImage().getScaledInstance(mostrarImagen.getWidth(), mostrarImagen.getHeight(), Image.SCALE_DEFAULT);
    icon = new ImageIcon(img);
    mostrarImagen.setIcon(icon);
}*/

    }
    
    
     
    public String getUsuarioAc() {
        return usuarioAc;
    }

    public void setUsuarioAc(String usuarioAc) {
        this.usuarioAc = usuarioAc;
    }
    /*
    
    */

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        categoriaGui = new javax.swing.JTextField();
        agregarGui = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        mostrarImagen = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();
        next = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        ustexto = new javax.swing.JLabel();
        nombreIm = new javax.swing.JLabel();
        eliminarImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 203, 216));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        categoriaGui.setBackground(new java.awt.Color(255, 255, 255));
        categoriaGui.setForeground(new java.awt.Color(51, 0, 153));

        agregarGui.setBackground(new java.awt.Color(255, 255, 255));
        agregarGui.setForeground(new java.awt.Color(51, 204, 0));
        agregarGui.setText("agregar");
        agregarGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarGuiActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setForeground(new java.awt.Color(153, 0, 0));
        eliminar.setText("eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        mostrarImagen.setForeground(new java.awt.Color(222, 216, 232));

        seleccionar.setBackground(new java.awt.Color(255, 255, 255));
        seleccionar.setForeground(new java.awt.Color(204, 204, 0));
        seleccionar.setText("seleccionar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setForeground(new java.awt.Color(153, 0, 51));
        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(255, 255, 255));
        regresar.setForeground(new java.awt.Color(204, 0, 51));
        regresar.setText("<");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        ustexto.setForeground(new java.awt.Color(0, 0, 0));

        nombreIm.setForeground(new java.awt.Color(0, 0, 0));

        eliminarImagen.setBackground(new java.awt.Color(255, 255, 255));
        eliminarImagen.setForeground(new java.awt.Color(204, 0, 0));
        eliminarImagen.setText("eliminar");
        eliminarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoriaGui, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addComponent(mostrarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(agregarGui)
                                .addGap(0, 400, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(regresar)
                                .addGap(46, 46, 46)
                                .addComponent(seleccionar)
                                .addGap(42, 42, 42)
                                .addComponent(eliminarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(next)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(ustexto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombreIm, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ustexto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombreIm, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(categoriaGui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mostrarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regresar)
                            .addComponent(eliminarImagen)
                            .addComponent(seleccionar))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(agregarGui)
                    .addComponent(eliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Inicio inicio = new Inicio();
       inicio.setVisible(true);
       System.out.println("1."+categorias.Cat.get(0));
       System.out.println("3."+categorias.Cat.get(2));
       
    }//GEN-LAST:event_jButton1ActionPerformed

    String nuevaCat;
    Categorias categorias = new Categorias(nuevaCat);
    

    private void agregarGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarGuiActionPerformed
        //System.out.println("USUARIO "+nombreActual);
        String nuevaCat = categoriaGui.getText();
                
                categorias.add(nuevaCat);
                System.out.println("categoria: "+ categorias.get(0) );
                
                
                DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                model.addRow(new Object[]{nuevaCat});
                
                System.out.println("categoria: "+ categorias.get(2) );
                
                if(nuevaCat!= null){
                categorias.Cat.add(nuevaCat);}
    }//GEN-LAST:event_agregarGuiActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
         int Linea = tabla.getSelectedRow();

    if (Linea == -1) {
        return;
    }
    String selectedItem = (String) tabla.getValueAt(Linea, 0);
    
    // BORRARLO DE LA LISTA
    categorias.Cat.remove(selectedItem);
    
    // QUITARLO DE LA TABLA
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
    model.removeRow(Linea);

    }//GEN-LAST:event_eliminarActionPerformed
private int numeroI = 0;

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
 JFileChooser escojerImagen = new JFileChooser(); 
    int eleccion = escojerImagen.showOpenDialog(this); 
    ustexto.setText(usuarioAc);
    if(eleccion == JFileChooser.APPROVE_OPTION) {
        fichero = escojerImagen.getSelectedFile();
        ImageIcon imagen = new ImageIcon(fichero.getPath());
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(mostrarImagen.getWidth(), mostrarImagen.getHeight(), Image.SCALE_DEFAULT));
        mostrarImagen.setIcon(icono);
        nombreIm.setText(fichero.getName());

       
        try {
            Image img = ImageIO.read(fichero);
            imagenes.add(img);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_seleccionarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
                Object imagen = imagenes.getAnterior();
if(imagen != null) {
    ImageIcon icon = new ImageIcon((Image) imagen);
    Image image = icon.getImage().getScaledInstance(mostrarImagen.getWidth(), mostrarImagen.getHeight(), Image.SCALE_DEFAULT);
    mostrarImagen.setIcon(new ImageIcon(image));
    //nombreIm.setText(image.getNam)
} else {
    System.out.println("ESTA ES LA PRIMERA");
}
    }//GEN-LAST:event_regresarActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        Object imagen = imagenes.getNext();
if(imagen != null) {
    ImageIcon icon = new ImageIcon((Image) imagen);
    Image image = icon.getImage().getScaledInstance(mostrarImagen.getWidth(), mostrarImagen.getHeight(), Image.SCALE_DEFAULT);
    mostrarImagen.setIcon(new ImageIcon(image));
} else {
    System.out.println("No hay mas");
}

    }//GEN-LAST:event_nextActionPerformed

    private void eliminarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarImagenActionPerformed
        
        imagenes.EliminarCurrent();
    Object imagen = imagenes.getNext();
    if(imagen != null) {
        ImageIcon icon = new ImageIcon((Image) imagen);
        Image image = icon.getImage().getScaledInstance(mostrarImagen.getWidth(), mostrarImagen.getHeight(), Image.SCALE_DEFAULT);
        mostrarImagen.setIcon(new ImageIcon(image));
    } else {
        mostrarImagen.setIcon(null);
        System.out.println("No hay mas");
    }
        
    }//GEN-LAST:event_eliminarImagenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarGui;
    private javax.swing.JTextField categoriaGui;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminarImagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mostrarImagen;
    private javax.swing.JButton next;
    private javax.swing.JLabel nombreIm;
    private javax.swing.JButton regresar;
    private javax.swing.JButton seleccionar;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel ustexto;
    // End of variables declaration//GEN-END:variables
}
