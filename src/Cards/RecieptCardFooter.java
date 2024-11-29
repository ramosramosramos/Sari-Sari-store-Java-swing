
package Cards;


public class RecieptCardFooter extends javax.swing.JPanel {

 
    public RecieptCardFooter(String tax,String sub,String grand) {
        initComponents();
        taxt_label.setText(tax);
        sub_label.setText(sub);
        grand_label.setText(grand);
 
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        grand_label = new javax.swing.JLabel();
        taxt_label = new javax.swing.JLabel();
        sub_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grand_label.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        grand_label.setForeground(new java.awt.Color(0, 51, 0));
        grand_label.setText("Grand Total:");
        jPanel1.add(grand_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 80, 28));

        taxt_label.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        taxt_label.setForeground(new java.awt.Color(0, 51, 0));
        taxt_label.setText("Grand tax:");
        jPanel1.add(taxt_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 28));

        sub_label.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        sub_label.setForeground(new java.awt.Color(0, 51, 0));
        sub_label.setText("Sub total :");
        jPanel1.add(sub_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 70, 28));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 0));
        jLabel4.setText("Grand tax:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 66, 28));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 0));
        jLabel5.setText("Sub total :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 66, 28));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 0));
        jLabel6.setText("Grand Total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 70, 28));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 108));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel grand_label;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sub_label;
    private javax.swing.JLabel taxt_label;
    // End of variables declaration//GEN-END:variables
}
