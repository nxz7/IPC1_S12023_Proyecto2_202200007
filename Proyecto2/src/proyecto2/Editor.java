
package proyecto2;

import java.awt.Image;

import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


/**
 *
 * @author natalia
 */
public class Editor extends javax.swing.JFrame {
public File fichero;
    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ElegirGui = new javax.swing.JButton();
        JPEGaBMP = new javax.swing.JButton();
        mostrarImagen = new javax.swing.JLabel();
        copiaJPEG = new javax.swing.JButton();
        RVAS = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        ByN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ElegirGui.setBackground(new java.awt.Color(153, 153, 153));
        ElegirGui.setForeground(new java.awt.Color(204, 255, 204));
        ElegirGui.setText("elegir");
        ElegirGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirGuiActionPerformed(evt);
            }
        });

        JPEGaBMP.setBackground(new java.awt.Color(153, 153, 153));
        JPEGaBMP.setForeground(new java.awt.Color(0, 0, 0));
        JPEGaBMP.setText("JPEG a BMP y visceversa");
        JPEGaBMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPEGaBMPActionPerformed(evt);
            }
        });

        copiaJPEG.setBackground(new java.awt.Color(255, 204, 204));
        copiaJPEG.setForeground(new java.awt.Color(0, 0, 0));
        copiaJPEG.setText("copia JPEG");
        copiaJPEG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiaJPEGActionPerformed(evt);
            }
        });

        RVAS.setBackground(new java.awt.Color(51, 102, 255));
        RVAS.setForeground(new java.awt.Color(255, 255, 255));
        RVAS.setText("rojo - verde - azul -sepia");
        RVAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RVASActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(204, 204, 255));
        modificar.setForeground(new java.awt.Color(0, 0, 0));
        modificar.setText("modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        ByN.setBackground(new java.awt.Color(0, 0, 0));
        ByN.setForeground(new java.awt.Color(255, 255, 255));
        ByN.setText("Blanco y Negro");
        ByN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ByNActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPEGaBMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(copiaJPEG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RVAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ByN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(mostrarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ElegirGui, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ElegirGui)
                    .addComponent(jButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(JPEGaBMP)
                        .addGap(18, 18, 18)
                        .addComponent(copiaJPEG)
                        .addGap(18, 18, 18)
                        .addComponent(RVAS)
                        .addGap(18, 18, 18)
                        .addComponent(modificar)
                        .addGap(12, 12, 12)
                        .addComponent(ByN))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(mostrarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void ElegirGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirGuiActionPerformed
JFileChooser escojerImagen = new JFileChooser(); 
        int eleccion = escojerImagen.showOpenDialog(this); 
       
if(eleccion ==JFileChooser.APPROVE_OPTION){
        fichero=escojerImagen.getSelectedFile();
    ImageIcon imagen = new ImageIcon(fichero.getPath());
Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(mostrarImagen.getWidth(), mostrarImagen.getHeight(), Image.SCALE_DEFAULT));
mostrarImagen.setIcon(icono);
}

    }//GEN-LAST:event_ElegirGuiActionPerformed
String uno = "jpg";
    private void JPEGaBMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPEGaBMPActionPerformed
 if(fichero.getName().contains(uno)){
        
        ImageHandler imagen = new JPEGtoBMPImage(fichero.getName(), fichero.getPath());
try {
    JPEGHandler.runHandler(imagen);
         
}catch(Exception e){
    System.out.println("---error-----");
}} else {
 ImageHandler imagen = new BMPtoJPEGImage(fichero.getName(), fichero.getPath());
try {
    JPEGHandler.runHandler(imagen);
         
}catch(Exception e){
    System.out.println("---error-----");
}
 
 }
 
    }//GEN-LAST:event_JPEGaBMPActionPerformed

    private void copiaJPEGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiaJPEGActionPerformed

ImageHandler imagen = new JPEGImageCopy(fichero.getName(), fichero.getPath());
try {
    JPEGHandler.runHandler(imagen);
         
}catch(Exception e){
    System.out.println("---error-----");
}
    }//GEN-LAST:event_copiaJPEGActionPerformed

    private void RVASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RVASActionPerformed
         ImageHandler imagen = new JPEGImageHandlerColors(fichero.getName(), fichero.getPath());

        try {
            JPEGHandler.runHandler(imagen);
        } catch (Exception e) {
            System.err.println("Error RGB: " + e.getMessage());
        }   
    }//GEN-LAST:event_RVASActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        ImageHandler imagen = new JPEGImageHandlerRotator(fichero.getName(), fichero.getPath());

        try {
            JPEGHandler.runHandler(imagen);
        } catch (Exception e) {
            System.err.println("Error RGB: " + e.getMessage());
        }   
    
    }//GEN-LAST:event_modificarActionPerformed

    private void ByNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ByNActionPerformed

               ImageHandler imagen = new JPEGImageHandlerBN(fichero.getName(), fichero.getPath());

        try {
            JPEGHandler.runHandler(imagen);
        } catch (Exception e) {
            System.err.println("Error RGB: " + e.getMessage());
        }
    }//GEN-LAST:event_ByNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       Inicio inicio = new Inicio();
       inicio.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ByN;
    private javax.swing.JButton ElegirGui;
    private javax.swing.JButton JPEGaBMP;
    private javax.swing.JButton RVAS;
    private javax.swing.JButton copiaJPEG;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel mostrarImagen;
    // End of variables declaration//GEN-END:variables
}
