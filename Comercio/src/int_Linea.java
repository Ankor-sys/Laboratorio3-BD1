
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sucely Alvarez
 */
public class int_Linea extends javax.swing.JInternalFrame {

    /**
     * Creates new form int_Rol
     */
    public int_Linea() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Matenimiento Línea");
        setVisible(true);

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Stock");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnLimpiar)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into linea values(?,?,?)");

            pst.setString(1, txtID.getText().trim());
            pst.setString(2, txtNombre.getText());
            pst.setString(3, txtStatus.getText());
            
            //bitacora_guardar();

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtID.setText("");
            txtNombre.setText("");
            txtStatus.setText("");
            txtBuscado.setText("");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en registro", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtBuscado.getText().trim();

            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("update linea set nombre = ?, stock = ? where id_linea =" + ID);

            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtStatus.getText());
            
            pst.executeUpdate();
            
            //bitacora_modificar();
            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText("");
            txtStatus.setText("");
            txtID.setText("");
            txtID.setEnabled(true);
            txtBuscado.setText("");
            
            btnIngresar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Modificacion","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("delete from linea where id_linea = ?");

            pst.setString(1, txtBuscado.getText().trim());
            pst.executeUpdate();
            
            
            //bitacora_eliminar();
            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText("");
            txtID.setText("");
            txtID.setEnabled(true);
            txtStatus.setText("");
            
            btnIngresar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Eliminacion","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from linea where id_linea =?");
            pst.setString(1, txtBuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtID.setText(rs.getString("id_linea"));
                txtID.setEnabled(false);
                txtNombre.setText(rs.getString("nombre"));
                txtStatus.setText(rs.getString("stock"));
                txtBuscado.setText("");

                
                
                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnIngresar.setEnabled(false);
                

            } else {
                JOptionPane.showMessageDialog(null, "Linea no registrada.");
            }

        }catch (Exception e){

        }
        //bitacora_busqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtID.setEnabled(true);
        txtNombre.setText("");
        txtStatus.setText("");
        txtBuscado.setText("");
        
        btnIngresar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBuscado;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
