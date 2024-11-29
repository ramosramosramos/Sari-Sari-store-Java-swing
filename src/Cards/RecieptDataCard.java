
package Cards;


public class RecieptDataCard extends javax.swing.JPanel {

 
    public RecieptDataCard(String name,String price,String tax) {
        initComponents();
        name_label.setText(name);
        price_label.setText(price);
        tax_label.setText(tax);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        tax_label = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 30));

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 20));
        jPanel4.setLayout(new java.awt.GridLayout());

        name_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setText("Item name");
        jPanel4.add(name_label);

        price_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_label.setText("Total price");
        jPanel4.add(price_label);

        tax_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tax_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tax_label.setText("Total tax");
        jPanel4.add(tax_label);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel tax_label;
    // End of variables declaration//GEN-END:variables
}
