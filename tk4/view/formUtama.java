package tk4;

import javax.swing.JOptionPane;

/**
 *
 * @author dwicd
 */
public class formUtama extends javax.swing.JFrame {

    /**
     * Creates new form formUtama
     */
    public formUtama() {
        initComponents();
        this.setTitle("Halaman Utama Penilaian Mahasiswa");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItem_close = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuItem_tambahdata = new javax.swing.JMenuItem();
        menuItem_tampilkandata = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setPreferredSize(new java.awt.Dimension(650, 450));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jMenu1.setText("Main Menu");

        menuItem_close.setText("Close");
        menuItem_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_closeActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_close);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Data Nilai Mahasiswa");

        menuItem_tambahdata.setText("Tambah Data");
        menuItem_tambahdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_tambahdataActionPerformed(evt);
            }
        });
        jMenu3.add(menuItem_tambahdata);

        menuItem_tampilkandata.setText("Tampilkan Data");
        menuItem_tampilkandata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_tampilkandataActionPerformed(evt);
            }
        });
        jMenu3.add(menuItem_tampilkandata);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void menuItem_closeActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        int pilih = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Keluar Aplikasi?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(pilih == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.getRootFrame();
        }
    }                                              

    private void menuItem_tambahdataActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
        desktopPane.removeAll();
        formInputNilai input = new formInputNilai();
        input.setVisible(true);
        desktopPane.add(input);
        menuItem_tambahdata.setEnabled(rootPaneCheckingEnabled);
    }                                                   

    private void menuItem_tampilkandataActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
        desktopPane.removeAll();
        formTabelNilai tabel = new formTabelNilai();
        tabel.setVisible(true);
        desktopPane.add(tabel);
        menuItem_tambahdata.setEnabled(rootPaneCheckingEnabled);
    }                                                      

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
            java.util.logging.Logger.getLogger(formUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItem_close;
    private javax.swing.JMenuItem menuItem_tambahdata;
    private javax.swing.JMenuItem menuItem_tampilkandata;
    // End of variables declaration                   
}
