/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Forensic extends javax.swing.JFrame {
    /**
     * Creates new form SaranForensic
     */
    public Forensic() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        Heading = new javax.swing.JLabel();
        OUTLINE = new javax.swing.JPanel();
        I1 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        i4 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        BO1 = new javax.swing.JTextField();
        BO2 = new javax.swing.JTextField();
        BO3 = new javax.swing.JTextField();
        BO4 = new javax.swing.JTextField();
        calculatebtn = new javax.swing.JButton();
        Finalout = new javax.swing.JLabel();
        AAAAA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        Heading.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 153, 153));
        Heading.setText("Forensics Death Calculation");

        OUTLINE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        I1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        I1.setText("Enter Body Temperature               :");

        i2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        i2.setText("Enter Room Temperatre                :");

        i4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        i4.setText("The Given Hours Temperature     :");

        i3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        i3.setText("How many Hours after you See    :      ");

        BO1.setToolTipText("");

        calculatebtn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        calculatebtn.setText("Calculate");
        calculatebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calculatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebtnActionPerformed(evt);
            }
        });

        Finalout.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        Finalout.setText("Exact time of Death(hrs): ");

        javax.swing.GroupLayout OUTLINELayout = new javax.swing.GroupLayout(OUTLINE);
        OUTLINE.setLayout(OUTLINELayout);
        OUTLINELayout.setHorizontalGroup(
            OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OUTLINELayout.createSequentialGroup()
                .addGroup(OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OUTLINELayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(OUTLINELayout.createSequentialGroup()
                                .addComponent(Finalout, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(AAAAA, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addGroup(OUTLINELayout.createSequentialGroup()
                                .addGroup(OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(i4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(i3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(i2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(I1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BO1)
                                    .addComponent(BO2)
                                    .addComponent(BO3)
                                    .addComponent(BO4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))))
                    .addGroup(OUTLINELayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(calculatebtn)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        OUTLINELayout.setVerticalGroup(
            OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OUTLINELayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(I1)
                    .addComponent(BO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i2)
                    .addComponent(BO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i3)
                    .addComponent(BO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i4)
                    .addComponent(BO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(calculatebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OUTLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Finalout)
                    .addComponent(AAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OUTLINE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Heading)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OUTLINE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calculatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebtnActionPerformed
        
        float a,b,c,d,CCC,CCCC,CCCCC,l1,l2,l3,l4;
        a=Float.parseFloat(BO1.getText());
        b=Float.parseFloat(BO2.getText());
        c=Float.parseFloat(BO3.getText());
        d=Float.parseFloat(BO4.getText());
        CCC = (float)(a-b);//  C
        CCCC=(float)((98.6-b)/CCC);//   UPP
        CCCCC=(float)((d-b)/CCC);//       E
        l1=(float)(c*(Math.log(CCCCC)));//L1
        l2=(float)(Math.log(CCCC));//LL
        l3=(float)(l2/l1);//            LLL
        l4=(int)(-1*(l3));
        AAAAA.setText(String.valueOf(l4));    
      
    }//GEN-LAST:event_calculatebtnActionPerformed

/**
  
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author CSE STUDENTS
 */

    
         /**
  
     * @param args the command line arguments
    
         System.out.println("Hours= " +l4);
    
   })

        
        * */
        
     
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forensic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forensic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forensic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forensic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Forensic().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AAAAA;
    private javax.swing.JTextField BO1;
    private javax.swing.JTextField BO2;
    private javax.swing.JTextField BO3;
    private javax.swing.JTextField BO4;
    javax.swing.JLabel Finalout;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel I1;
    private javax.swing.JPanel OUTLINE;
    private javax.swing.JButton calculatebtn;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel i4;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
