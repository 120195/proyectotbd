/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cajas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jacomess
 */
public class domicilio extends javax.swing.JFrame {

    /**
     * Creates new form domicilio
     */
    public domicilio() {
        initComponents();
        mostrardatos("");
        limpiar();
        
        this.jComboBox2.removeAllItems();
        try {
            Statement st = cn.createStatement();
             ResultSet rs=st.executeQuery("SELECT * FROM cat_cliente");
             while(rs.next()){
                 
                 this.jComboBox2.addItem(rs.getInt("idcat_cliente"));
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(domicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void limpiar(){
        id.setText("");
        cpostal.setText("");
        call.setText("");
        num_ext.setText("");
        num_int.setText("");
        coloni.setText("");
        locali.setText("");
        municipio.setText("");
        df.setText("");
        entreca.setText("");
        callepos.setText("");
        descripcio.setText("");
        tel.setText("");
        id_cliente.setText("");
    }
    
    void mostrardatos(String valor){
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("c.postal");
        modelo.addColumn("calle");
        modelo.addColumn("n.ext");
        modelo.addColumn("n.inter");
        modelo.addColumn("colonia");
        modelo.addColumn("localidad");
        modelo.addColumn("municipio");
        modelo.addColumn("DF");
        modelo.addColumn("entr.calles");
        modelo.addColumn("c.posterior");
        modelo.addColumn("descripcion");
        modelo.addColumn("telefono");
        modelo.addColumn("id_cliente");
        tb_domicili.setModel(modelo);
         String sql="";
        if(valor.equals("")){
            
            sql="SELECT * FROM domicilio";
            
        }
        else{
            
            sql="SELECT * FROM domicilio WHERE id='"+valor+"'";
        }
        String [] datos = new String [14];
        try {
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                datos[10]=rs.getString(11);
                datos[11]=rs.getString(12);
                datos[12]=rs.getString(13);
                datos[13]=rs.getString(14);
                modelo.addRow(datos);
                
            }
            tb_domicili.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(domicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        num_ext = new javax.swing.JTextField();
        num_int = new javax.swing.JTextField();
        coloni = new javax.swing.JTextField();
        locali = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_domicili = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        txtbusca = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cpostal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        call = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        municipio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        df = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        entreca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        callepos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        descripcio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();

        jMenuItem1.setText("modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DOMICILIO");

        jLabel2.setText("NUM EXT");

        jLabel3.setText("NUM INT");

        jLabel4.setText("COLONIA");

        jLabel5.setText("LOCALIDAD");

        num_ext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_extActionPerformed(evt);
            }
        });

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        tb_domicili.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_domicili.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tb_domicili);

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        txtbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscaActionPerformed(evt);
            }
        });

        mostrar.setText("MOSTRAR DATOS");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        actualizar.setText("ACTUALIZAR");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        jLabel7.setText("CODIGO POSTAL");

        jLabel8.setText("CALLE");

        jLabel9.setText("MUN_DEL");

        jLabel10.setText("DISTRITO FEDERAL");

        jLabel11.setText("ENTRE CALLES");

        jLabel12.setText("CALLE POSTERIOR");

        jLabel13.setText("DESCRIPCION");

        descripcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcioActionPerformed(evt);
            }
        });

        jLabel14.setText("TELEFONO");

        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });

        jLabel15.setText("ID CLIENTE");

        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(cpostal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(jLabel12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(locali)
                                    .addComponent(call)
                                    .addComponent(num_ext)
                                    .addComponent(num_int)
                                    .addComponent(coloni)
                                    .addComponent(municipio)
                                    .addComponent(df)
                                    .addComponent(entreca)
                                    .addComponent(callepos)
                                    .addComponent(descripcio)
                                    .addComponent(tel, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(id_cliente)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(actualizar)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(guardar)
                                .addGap(78, 78, 78)
                                .addComponent(mostrar)
                                .addGap(50, 50, 50)
                                .addComponent(buscar)
                                .addGap(33, 33, 33)
                                .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cpostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(call, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(num_int, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(coloni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(locali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(df, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(entreca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(callepos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(descripcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(actualizar)
                    .addComponent(guardar)
                    .addComponent(mostrar)
                    .addComponent(buscar)
                    .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
       
        
        try {
            PreparedStatement psd = cn.prepareStatement("INSERT INTO domicilio (codigo_postal,calle,num_ext,num_int,colonia,localidad,mun_del,distrito_federal,entre_calles,calle_posterior,descripcion,telefono,id_cliente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            psd.setString(1, cpostal.getText());
            psd.setString(2, call.getText());
            psd.setString(3, num_ext.getText());
            psd.setString(4, num_int.getText());
            psd.setString(5, coloni.getText());
            psd.setString(6, locali.getText());
            psd.setString(7, municipio.getText());
            psd.setString(8, df.getText());
            psd.setString(9, entreca.getText());
            psd.setString(10, callepos.getText());
            psd.setString(11, descripcio.getText());
            psd.setString(12, tel.getText());
            psd.setString(13, id_cliente.getText());
           int n= psd.executeUpdate();
           mostrardatos("");
            
           if(n>0){
               JOptionPane.showMessageDialog(null, "registro guardado");
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(domicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        mostrardatos(txtbusca.getText());
    }//GEN-LAST:event_buscarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
        
    }//GEN-LAST:event_mostrarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        try {
            PreparedStatement psd = cn.prepareStatement("UPDATE domicilio SET codigo_postal='"+cpostal.getText()+"',calle='"+call.getText()+"',num_ext='"+num_ext.getText()+"',num_int='"+num_int.getText()+"',colonia='"+coloni.getText()+"',localidad='"+locali.getText()+"',mun_del='"+municipio.getText()+"',distrito_federal='"+df.getText()+"',entre_calles="+entreca.getText()+"',descripcion=',"+descripcio.getText()+"',telefono='"+tel.getText()+"'WHERE id='"+id.getText()+"'");
        psd.executeUpdate();
        mostrardatos("");
        } catch (SQLException ex) {
            Logger.getLogger(domicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fila = tb_domicili.getSelectedRow();
        if(fila>=0){
            
            id.setText(tb_domicili.getValueAt(fila, 0).toString());
            cpostal.setText(tb_domicili.getValueAt(fila, 1).toString());
            call.setText(tb_domicili.getValueAt(fila, 2).toString());
            num_ext.setText(tb_domicili.getValueAt(fila, 3).toString());
            num_int.setText(tb_domicili.getValueAt(fila, 4).toString());
            coloni.setText(tb_domicili.getValueAt(fila, 5).toString());
            locali.setText(tb_domicili.getValueAt(fila, 6).toString());
            municipio.setText(tb_domicili.getValueAt(fila, 7).toString());
            df.setText(tb_domicili.getValueAt(fila, 8).toString());
            entreca.setText(tb_domicili.getValueAt(fila, 9).toString());
            callepos.setText(tb_domicili.getValueAt(fila, 10).toString());
            descripcio.setText(tb_domicili.getValueAt(fila, 11).toString());
            tel.setText(tb_domicili.getValueAt(fila, 12).toString());
            id_cliente.setText(tb_domicili.getValueAt(fila, 13).toString());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         int fila = tb_domicili.getSelectedRow();
         String ciu="";
         ciu=tb_domicili.getValueAt(fila, 0).toString();
        try {
            PreparedStatement psd = cn.prepareStatement("DELETE FROM domicilio WHERE id='"+ciu+"'");
         psd.executeUpdate();
       mostrardatos("");
        
        } catch (SQLException ex) {
            Logger.getLogger(domicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void num_extActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_extActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_extActionPerformed

    private void txtbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscaActionPerformed

    private void descripcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcioActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try {
            // TODO add your handling code here:

            Statement st=cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM cat_cliente WHERE idcat_cliente='"+this.jComboBox2.getSelectedItem()+"'");
             rs.next();
              this.id_cliente.setText(String.valueOf(rs.getInt("idcat_cliente")));
        
        } catch (SQLException ex) {
            Logger.getLogger(domicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(domicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(domicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(domicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(domicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new domicilio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField call;
    private javax.swing.JTextField callepos;
    private javax.swing.JTextField coloni;
    private javax.swing.JTextField cpostal;
    private javax.swing.JTextField descripcio;
    private javax.swing.JTextField df;
    private javax.swing.JTextField entreca;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locali;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField municipio;
    private javax.swing.JTextField num_ext;
    private javax.swing.JTextField num_int;
    private javax.swing.JTable tb_domicili;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField txtbusca;
    // End of variables declaration//GEN-END:variables

conecta cc = new conecta();
Connection cn =  cc.conexion();


}

