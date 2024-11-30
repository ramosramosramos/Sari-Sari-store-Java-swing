package Pages;

import Cards.CardItem;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;




public final class Index extends javax.swing.JFrame {
    
    Connection conn = null;
    boolean isCountTotal = false;
    public Index() {
        initComponents();
        otherComponent();
        conn = Database.JavaConnection.getConnection();
        getItems();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maihn = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        total_field = new javax.swing.JTextField();
        sub_field = new javax.swing.JTextField();
        tax_field = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        show_reciept_button = new javax.swing.JButton();
        print_reciept_button = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        reset_button = new javax.swing.JButton();
        total_button = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        reset_button1 = new javax.swing.JButton();
        total_button1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ip_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        time_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mainItemsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        maihn.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1028, 50));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPARIP'S STORE");
        jPanel1.add(jLabel1);

        maihn.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(1028, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        maihn.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(20, 514));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );

        maihn.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(20, 514));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );

        maihn.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setLayout(new java.awt.BorderLayout());

        rightPanel.setBackground(new java.awt.Color(204, 204, 204));
        rightPanel.setPreferredSize(new java.awt.Dimension(300, 514));

        jPanel6.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel6.setLayout(new java.awt.BorderLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        rightPanel.add(jPanel6);

        jPanel8.setPreferredSize(new java.awt.Dimension(300, 140));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tax($):");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sub Total($):");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total($):");

        total_field.setEditable(false);
        total_field.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        total_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_field.setText("0.0");

        sub_field.setEditable(false);
        sub_field.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        sub_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sub_field.setText("0.0");

        tax_field.setEditable(false);
        tax_field.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tax_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tax_field.setText("0.0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sub_field, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tax_field, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(total_field, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tax_field, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(sub_field, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(total_field, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(26, 26, 26)))
        );

        rightPanel.add(jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(300, 50));

        show_reciept_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        show_reciept_button.setText("Show reciept");
        show_reciept_button.setPreferredSize(new java.awt.Dimension(130, 40));
        show_reciept_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_reciept_buttonActionPerformed(evt);
            }
        });
        jPanel9.add(show_reciept_button);

        print_reciept_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        print_reciept_button.setText("Print");
        print_reciept_button.setPreferredSize(new java.awt.Dimension(130, 40));
        print_reciept_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_reciept_buttonActionPerformed(evt);
            }
        });
        jPanel9.add(print_reciept_button);

        rightPanel.add(jPanel9);

        jPanel10.setPreferredSize(new java.awt.Dimension(300, 50));

        reset_button.setBackground(new java.awt.Color(204, 0, 0));
        reset_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        reset_button.setForeground(new java.awt.Color(204, 204, 204));
        reset_button.setText("Reset");
        reset_button.setPreferredSize(new java.awt.Dimension(130, 40));
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(reset_button);

        total_button.setBackground(new java.awt.Color(0, 153, 0));
        total_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        total_button.setForeground(new java.awt.Color(204, 204, 204));
        total_button.setText("Total");
        total_button.setPreferredSize(new java.awt.Dimension(130, 40));
        total_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(total_button);

        rightPanel.add(jPanel10);

        jPanel13.setPreferredSize(new java.awt.Dimension(300, 35));

        reset_button1.setBackground(new java.awt.Color(255, 255, 255));
        reset_button1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        reset_button1.setForeground(new java.awt.Color(51, 51, 51));
        reset_button1.setText("ADD IP");
        reset_button1.setPreferredSize(new java.awt.Dimension(90, 25));
        reset_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_button1ActionPerformed(evt);
            }
        });
        jPanel13.add(reset_button1);

        total_button1.setBackground(new java.awt.Color(255, 255, 255));
        total_button1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        total_button1.setForeground(new java.awt.Color(51, 51, 51));
        total_button1.setText("ADD CUSTOMER's NUMBER");
        total_button1.setPreferredSize(new java.awt.Dimension(170, 25));
        total_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_button1ActionPerformed(evt);
            }
        });
        jPanel13.add(total_button1);

        rightPanel.add(jPanel13);

        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Default Gateway:");
        rightPanel.add(jLabel8);

        ip_label.setText("None");
        rightPanel.add(ip_label);

        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("Customer#");
        rightPanel.add(jLabel9);

        phone_label.setText("None");
        rightPanel.add(phone_label);

        jPanel5.add(rightPanel, java.awt.BorderLayout.LINE_END);

        jPanel7.setPreferredSize(new java.awt.Dimension(988, 30));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel7.add(time_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 102, 30));

        date_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel7.add(date_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 166, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MENU ITEMS");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        jPanel5.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        mainItemsPanel.setLayout(new java.awt.GridLayout(3, 5, 5, 5));
        jPanel5.add(mainItemsPanel, java.awt.BorderLayout.CENTER);

        maihn.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(maihn, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1044, 801));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void show_reciept_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_reciept_buttonActionPerformed
        new Reciept("","").setVisible(true);
    }//GEN-LAST:event_show_reciept_buttonActionPerformed

    private void print_reciept_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_reciept_buttonActionPerformed
        if (ip_label.getText().equals("None")) {
            JOptionPane.showMessageDialog(null, "Canno't print without the ip address please add the ip address ");
            return;
        }
        if (phone_label.getText().equals("None")) {
            JOptionPane.showMessageDialog(null, "Canno't print without the customer's number please add the customer's number first");
            return;
        }
        Pages.Reciept reciept = new Reciept(ip_label.getText(),phone_label.getText());
        reciept.setVisible(true);
        
        Tools.PanelPrinter.getPrintPanel(reciept.main);
    }//GEN-LAST:event_print_reciept_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to rest all items?");
        if (ask == JOptionPane.YES_OPTION) {
            try (PreparedStatement pst = conn.prepareStatement("truncate items")) {
                pst.execute();
                getItems();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void reset_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_button1ActionPerformed
        try {
            String ip = JOptionPane.showInputDialog(null, "Your IP address");
            if (!ip.trim().isEmpty()) {
                ip_label.setText(ip);
            }
        } catch (Exception e) {
            
        }

    }//GEN-LAST:event_reset_button1ActionPerformed

    private void total_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_button1ActionPerformed
        try {
            String phone = JOptionPane.showInputDialog(null, "Customer's phone number");
            if (!phone.trim().isEmpty()) {
                phone_label.setText(phone);
            }
        } catch (Exception e) {
            
        }

    }//GEN-LAST:event_total_button1ActionPerformed

    private void total_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_buttonActionPerformed
    getItemsTaxSubTotal();
    isCountTotal = true;
    }//GEN-LAST:event_total_buttonActionPerformed
    
    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Index().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel ip_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel maihn;
    private javax.swing.JPanel mainItemsPanel;
    private javax.swing.JLabel phone_label;
    private javax.swing.JButton print_reciept_button;
    private javax.swing.JButton reset_button;
    private javax.swing.JButton reset_button1;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton show_reciept_button;
    private javax.swing.JTextField sub_field;
    private javax.swing.JTable table;
    private javax.swing.JTextField tax_field;
    private javax.swing.JLabel time_label;
    private javax.swing.JButton total_button;
    private javax.swing.JButton total_button1;
    private javax.swing.JTextField total_field;
    // End of variables declaration//GEN-END:variables

    public void otherComponent() {
        Tools.Time.setTime(time_label, date_label);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainItemsPanel.add(new CardItem("/image/soap.jpg", "Soap", "50", "2", this));
        mainItemsPanel.add(new CardItem("/image/shampoo.jpg", "Shampo", "20", "1", this));
        mainItemsPanel.add(new CardItem("/image/cream_silk.jpg", "Cream Silk", "10", "1", this));
        mainItemsPanel.add(new CardItem("/image/colgate.jpg", "Colgate", "15", "2", this));
        mainItemsPanel.add(new CardItem("/image/meat_loaf.jpg", "Meat Loaf", "55", "3", this));
        mainItemsPanel.add(new CardItem("/image/century.jpg", "Century Tuna", "65", "5", this));
        mainItemsPanel.add(new CardItem("/image/sardines.jpg", "Sardines", "30", "2", this));
        mainItemsPanel.add(new CardItem("/image/bear_brand.jpg", "Bear Brand", "20", "1", this));
        mainItemsPanel.add(new CardItem("/image/corn_beef.jpg", "Corn Beef", "35", "2", this));
        mainItemsPanel.add(new CardItem("/image/soy_souce.jpg", "Soy sauce", "15", "1", this));
        mainItemsPanel.add(new CardItem("/image/milo.jpg", "Milo", "13", "1", this));
        mainItemsPanel.add(new CardItem("/image/nescafe.jpg", "Nescafe", "25", "1", this));
        mainItemsPanel.add(new CardItem("/image/kopiko.jpg", "Kopiko Blanca", "15", "1", this));
        mainItemsPanel.add(new CardItem("/image/lucky_me.jpg", "Lucky me", "14", "1", this));
        mainItemsPanel.add(new CardItem("/image/pancit _canton.jpg", "Pancit Canton", "23", "2", this));
        mainItemsPanel.repaint();
        mainItemsPanel.revalidate();
    }
    
    public void getItems() {
        try (PreparedStatement pst = conn.prepareStatement("Select id as 'ID',name as 'Name',price as 'Total price',tax as 'Total tax' from items")) {
            ResultSet rs = pst.executeQuery();
            table.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
                
                @Override
                public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                    super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
                    setHorizontalAlignment(JLabel.LEFT);
                    return this;
                }
                
            });
            table.setModel(DbUtils.resultSetToTableModel(rs));
            table.getColumnModel().getColumn(0).setMaxWidth(25);
            table.getColumnModel().getColumn(3).setMaxWidth(70);
            table.getColumnModel().getColumn(2).setMaxWidth(70);
            if(isCountTotal){
                getItemsTaxSubTotal();
            }
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void getItemsTaxSubTotal() {
        try (PreparedStatement pst = conn.prepareStatement("Select "
                + "sum(tax) as 'tax'"
                + ",sum(price) as 'sub'"
                + ",sum(tax+price) as 'total'"
                + " from items")) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String tax = rs.getString("tax");
                String sub = rs.getString("sub");
                String total = rs.getString("total");
                if (sub.trim().equals("")) {
                    tax = "0.0";
                    sub = "0.0";
                    total = "0.0";
                }
                tax_field.setText(tax);
                sub_field.setText(sub);
                total_field.setText(total);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
