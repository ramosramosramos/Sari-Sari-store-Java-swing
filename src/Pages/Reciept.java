package Pages;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class Reciept extends javax.swing.JFrame {

    Connection conn = null;
    String stotal;

    public Reciept(String ip, String phone) {
        initComponents();
        conn = Database.JavaConnection.getConnection();
        fetch();
        if (!ip.isEmpty()) {
            Tools.IP.Send(ip, phone, "Thank you for purchasing in Reparips store.A total of $" + stotal, true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dataPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        time_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        main.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reparip Store");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        main.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel3.setLayout(new java.awt.GridLayout());

        time_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_label.setText("time here");
        jPanel3.add(time_label);

        date_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_label.setText("time here");
        jPanel3.add(date_label);

        dataPanel.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel4.setLayout(new java.awt.GridLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Item name");
        jPanel4.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total price");
        jPanel4.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total tax");
        jPanel4.add(jLabel4);

        dataPanel.add(jPanel4);

        main.add(dataPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(416, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Reciept("", "").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dataPanel;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel main;
    private javax.swing.JLabel time_label;
    // End of variables declaration//GEN-END:variables
public void fetch() {
        try (PreparedStatement pst = conn.prepareStatement("Select * from items")) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String price = rs.getString("price");
                String tax = rs.getString("tax");
                dataPanel.add(new Cards.RecieptDataCard(name, price, tax));
            }

            dataPanel.repaint();
            dataPanel.revalidate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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

                stotal = total;
                dataPanel.add(new Cards.RecieptCardFooter(tax, sub, total));
                dataPanel.repaint();
                dataPanel.revalidate();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String time = Tools.Date.getDate("h:mm:ss aa");
        String date = Tools.Date.getDate("EEEE, dd-MM-yyyy");
        time_label.setText(time);
        date_label.setText(date);

    }
}
