/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalPackage;

import Admin.UserForms;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class userDash extends javax.swing.JInternalFrame {

  
    public userDash() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); 
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI(); 
        bi.setNorthPane(null);
    }

  Color navcolor = new Color(116, 105, 182);
Color headcolor = new Color(255,230,230);
Color bodycolor = new Color(225,175,209);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stulist = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subj = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stulist1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stulist2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        stulist.setBackground(new java.awt.Color(255, 204, 204));
        stulist.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        stulist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stulistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stulistMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SUPPLIER");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout stulistLayout = new javax.swing.GroupLayout(stulist);
        stulist.setLayout(stulistLayout);
        stulistLayout.setHorizontalGroup(
            stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
            .addGroup(stulistLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        stulistLayout.setVerticalGroup(
            stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stulistLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(stulist);
        stulist.setBounds(120, 240, 190, 161);

        subj.setBackground(new java.awt.Color(255, 204, 204));
        subj.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        subj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subjMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subjMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("USER");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout subjLayout = new javax.swing.GroupLayout(subj);
        subj.setLayout(subjLayout);
        subjLayout.setHorizontalGroup(
            subjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(54, 54, 54))
        );
        subjLayout.setVerticalGroup(
            subjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel1.add(subj);
        subj.setBounds(340, 40, 180, 160);

        stulist1.setBackground(new java.awt.Color(255, 204, 204));
        stulist1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        stulist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stulist1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stulist1MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NAME");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout stulist1Layout = new javax.swing.GroupLayout(stulist1);
        stulist1.setLayout(stulist1Layout);
        stulist1Layout.setHorizontalGroup(
            stulist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
            .addGroup(stulist1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        stulist1Layout.setVerticalGroup(
            stulist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stulist1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(stulist1);
        stulist1.setBounds(120, 40, 190, 161);

        stulist2.setBackground(new java.awt.Color(255, 204, 204));
        stulist2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        stulist2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stulist2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stulist2MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ORDER");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout stulist2Layout = new javax.swing.GroupLayout(stulist2);
        stulist2.setLayout(stulist2Layout);
        stulist2Layout.setHorizontalGroup(
            stulist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(stulist2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel8)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        stulist2Layout.setVerticalGroup(
            stulist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stulist2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(stulist2);
        stulist2.setBounds(340, 240, 190, 161);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stulistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulistMouseEntered
        stulist.setBackground(navcolor);
    }//GEN-LAST:event_stulistMouseEntered

    private void stulistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulistMouseExited
        stulist.setBackground(headcolor);
    }//GEN-LAST:event_stulistMouseExited

    private void subjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjMouseEntered
        subj .setBackground(navcolor);
    }//GEN-LAST:event_subjMouseEntered

    private void subjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjMouseExited
        subj .setBackground(headcolor);
    }//GEN-LAST:event_subjMouseExited

    private void stulist1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulist1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_stulist1MouseEntered

    private void stulist1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulist1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_stulist1MouseExited

    private void stulist2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulist2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_stulist2MouseEntered

    private void stulist2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulist2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_stulist2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel stulist;
    private javax.swing.JPanel stulist1;
    private javax.swing.JPanel stulist2;
    private javax.swing.JPanel subj;
    // End of variables declaration//GEN-END:variables
}
