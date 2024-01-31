
package com.andyg.catalogkyc.gi;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class menuseleccionmodelo extends javax.swing.JPanel {


    public menuseleccionmodelo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonT3 = new javax.swing.JButton();
        buttonX5 = new javax.swing.JButton();
        buttonX5plus = new javax.swing.JButton();

        buttonT3.setText("T3");
        buttonT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonT3ActionPerformed(evt);
            }
        });

        buttonX5.setText("X5");
        buttonX5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonX5ActionPerformed(evt);
            }
        });

        buttonX5plus.setText("X5 PLUS");
        buttonX5plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonX5plusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(buttonT3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(buttonX5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(buttonX5plus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonX5plus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonX5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonT3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonX5plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonX5plusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonX5plusActionPerformed

    private void buttonX5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonX5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonX5ActionPerformed

    private void buttonT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonT3ActionPerformed
        // TODO add your handling code here:
        tipodecabinaT3 seleccioncabina = new tipodecabinaT3();
    
    // Se añade el panel tipodecabinaT3 al JFrame actual que contiene menuseleccionmodelo
    JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
    frame.getContentPane().removeAll(); // Elimina todos los componentes del frame
    frame.getContentPane().add(seleccioncabina); // Agrega el panel tipodecabinaT3 al frame
    frame.pack(); // Ajusta el tamaño del frame según los componentes añadidos// Coloca el frame en el centro de la pantalla
    frame.setVisible(true); // Hac
        
    }//GEN-LAST:event_buttonT3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonT3;
    private javax.swing.JButton buttonX5;
    private javax.swing.JButton buttonX5plus;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
