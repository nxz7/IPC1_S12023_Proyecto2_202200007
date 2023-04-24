/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static proyecto2.Proyecto2.ListaUsuarios;

/**
 *
 * @author natalia
 */
public class Inicio extends javax.swing.JFrame {

    
    //private String usuarioAc; 
    
    public static Lista ListaUsuarios; 
     public static Lista ListaRecuperada;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
         this.ListaUsuarios = Proyecto2.ListaUsuarios;
         this.ListaRecuperada =ListaRecuperada;
         
         try {

           ObjectInputStream recuperar = new ObjectInputStream(
           new FileInputStream("C:\\Users\\natalia\\Documents\\rep\\IPC1_S12023_Proyecto2_202200007\\Proyecto2\\usuarios.dat")
           );
           Lista ListaRecuperada = (Lista) recuperar.readObject();
           recuperar.close();
           System.out.println("Lista recuperada");
           ListaRecuperada.mostrar();
       
       }catch(Exception e){
       System.err.println("Error"+ e.getMessage());
       }
         
         
         
    }
    
    

    /**
     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usuarioGui = new javax.swing.JTextField();
        ingBiblioteca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        editorGui = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(196, 196, 225));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Usuario");

        usuarioGui.setBackground(new java.awt.Color(255, 255, 255));
        usuarioGui.setForeground(new java.awt.Color(0, 0, 0));
        usuarioGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioGuiActionPerformed(evt);
            }
        });

        ingBiblioteca.setBackground(new java.awt.Color(255, 255, 255));
        ingBiblioteca.setForeground(new java.awt.Color(0, 0, 0));
        ingBiblioteca.setText("Ingresar a Biblioteca");
        ingBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBibliotecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuarioGui, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(ingBiblioteca)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usuarioGui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(ingBiblioteca)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENU");

        editorGui.setBackground(new java.awt.Color(255, 255, 255));
        editorGui.setForeground(new java.awt.Color(0, 0, 0));
        editorGui.setText("Ir a editor");
        editorGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorGuiActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ir a convertidor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(editorGui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(editorGui)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void ingBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBibliotecaActionPerformed
        
         String nuevo = usuarioGui.getText();
         
    Usuario nuevoUsuario = new Usuario(nuevo);

    boolean existe = false;
    try {
        ObjectInputStream recuperar = new ObjectInputStream(
            new FileInputStream("C:\\Users\\natalia\\Documents\\rep\\IPC1_S12023_Proyecto2_202200007\\Proyecto2\\usuarios.dat")
        );
        Lista listaRecuperada = (Lista) recuperar.readObject();
        recuperar.close();
        System.out.println("Lista recuperada");
        listaRecuperada.mostrar();
        System.out.println("----------------------");
        for (int i = 0; i < listaRecuperada.getSize(); i++) {
            String nombreUsuario = (String)listaRecuperada.get(i);
            if (nombreUsuario.equals(nuevo)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            listaRecuperada.add(nuevoUsuario);
            System.out.println("Usuario agregado");
            System.out.println("----------------------");
            dispose();
        Biblioteca pi = new Biblioteca();
                     pi.setUsuarioAc(nuevo);
                     System.out.println("usuario"+ pi.getUsuarioAc());
                     pi.setVisible(true);
        } else {
            System.out.println("Usuario ya existe");
            System.out.println("----------------------");
            
            
            dispose();
        Biblioteca pi = new Biblioteca();
                     pi.setUsuarioAc(nuevo);
                     System.out.println("usuario"+ pi.getUsuarioAc());
                     pi.setVisible(true);
        }
        ObjectOutputStream guardar = new ObjectOutputStream(
            new FileOutputStream("C:\\Users\\natalia\\Documents\\rep\\IPC1_S12023_Proyecto2_202200007\\Proyecto2\\usuarios.dat")
        );
        guardar.writeObject(listaRecuperada);
        guardar.close();
    } catch (Exception e) {
        System.err.println("Error" + e.getMessage());
        
        
        
    }
      
    }//GEN-LAST:event_ingBibliotecaActionPerformed

    
    private void editorGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorGuiActionPerformed
        dispose();
        Editor pi = new Editor();
        pi.setVisible(true);
    }//GEN-LAST:event_editorGuiActionPerformed

    private void usuarioGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioGuiActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editorGui;
    private javax.swing.JButton ingBiblioteca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField usuarioGui;
    // End of variables declaration//GEN-END:variables



}
