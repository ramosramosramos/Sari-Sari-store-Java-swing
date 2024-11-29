package Cards;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

public class CardItem extends javax.swing.JPanel {

    String name, price, tax;
    Connection conn = null;
    Pages.Index index;
    public CardItem(String path, String name, String price, String tax,Pages.Index index) {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        Image img = icon.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        image_label.setIcon(new ImageIcon(img));
        name_label.setText(name);
        price_label.setText(price);
        this.name = name;
        this.price = price;
        this.tax = tax;
        this.index = index;
        conn = Database.JavaConnection.getConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spinner = new javax.swing.JSpinner();
        purchase_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(200, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image_label.setText("Image here");
        add(image_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        name_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setText("name here");
        name_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 20));

        price_label.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        price_label.setText("price");
        add(price_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setText("Price: $");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 40, 20));

        spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        add(spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 130, -1));

        purchase_button.setBackground(new java.awt.Color(51, 153, 0));
        purchase_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        purchase_button.setForeground(new java.awt.Color(204, 204, 204));
        purchase_button.setText("Purchase");
        purchase_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchase_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_buttonActionPerformed(evt);
            }
        });
        add(purchase_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 180, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void purchase_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_buttonActionPerformed
        int quantity = (int) spinner.getValue();
        int finalPrice = Integer.valueOf(price)* quantity;
        handlePurchase(name, String.valueOf(finalPrice), tax);
    }//GEN-LAST:event_purchase_buttonActionPerformed

public void handlePurchase(String name, String price, String tax) {
    String selectQuery = "SELECT price, tax FROM items WHERE name = ?";
    String updateQuery = "UPDATE items SET price = ?, tax = ? WHERE name = ?";
    String insertQuery = "INSERT INTO items (name, price, tax) VALUES (?, ?, ?)";

    try (PreparedStatement pstSelect = conn.prepareStatement(selectQuery)) {
        pstSelect.setString(1, name);
        ResultSet resultSet = pstSelect.executeQuery();

        if (resultSet.next()) {
            // Retrieve current price and tax
            double currentPrice = resultSet.getDouble("price");
            double currentTax = resultSet.getDouble("tax");

            // Add new values to the current ones
            double newPrice = currentPrice + Double.parseDouble(price);
            double newTax = currentTax + Double.parseDouble(tax);

            // Update existing item
            try (PreparedStatement pstUpdate = conn.prepareStatement(updateQuery)) {
                pstUpdate.setDouble(1, newPrice);
                pstUpdate.setDouble(2, newTax);
                pstUpdate.setString(3, name);
                pstUpdate.executeUpdate();
                System.out.println("Item updated successfully: " + name);
            }
        } else {
            // Insert new item
            try (PreparedStatement pstInsert = conn.prepareStatement(insertQuery)) {
                pstInsert.setString(1, name);
                pstInsert.setDouble(2, Double.parseDouble(price));
                pstInsert.setDouble(3, Double.parseDouble(tax));
                pstInsert.executeUpdate();
                System.out.println("New item inserted successfully: " + name);
            }
        }

        // Refresh items (assuming index.getItems() is defined elsewhere)
        index.getItems();
        spinner.setValue(1);
    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image_label;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JButton purchase_button;
    private javax.swing.JSpinner spinner;
    // End of variables declaration//GEN-END:variables
}
