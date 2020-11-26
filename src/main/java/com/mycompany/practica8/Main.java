package com.mycompany.practica8;

import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author Ayoze, Nicolás
 */
public class Main extends javax.swing.JFrame {

    JFileChooser fc = new JFileChooser();
    FileNameExtensionFilter filtroAll = null;
    FileNameExtensionFilter filtroJPEG = null;
    FileNameExtensionFilter filtroPNG = null;
    Mat img;
    BufferedImage imgBI;
    
    public Main() {
        initComponents();
        
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        this.setLocationRelativeTo(null);
        
        /*jDesktopPane.addComponentListener(new ComponentAdapter(){
            @Override
            public void componentResized(ComponentEvent e){
                 
            }
        });*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBarImages = new javax.swing.JMenuBar();
        jMenuFiles = new javax.swing.JMenu();
        jMenuItemOpen = new javax.swing.JMenuItem();
        jMenuItemClose = new javax.swing.JMenuItem();
        jSeparatorFiles = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemThreshold = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Opening Windows (Made By: Ayoze Mesa Núñez & Nicolás Rey Alonso)");
        setMaximumSize(new java.awt.Dimension(1100, 850));
        setPreferredSize(new java.awt.Dimension(1100, 850));

        jDesktopPane.setMaximumSize(new java.awt.Dimension(1024, 768));
        jDesktopPane.setPreferredSize(new java.awt.Dimension(1024, 768));
        jDesktopPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jDesktopPaneComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuFiles.setMnemonic('F');
        jMenuFiles.setText("Files");

        jMenuItemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemOpen.setText("Open");
        jMenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenActionPerformed(evt);
            }
        });
        jMenuFiles.add(jMenuItemOpen);

        jMenuItemClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemClose.setText("Close");
        jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCloseActionPerformed(evt);
            }
        });
        jMenuFiles.add(jMenuItemClose);
        jMenuFiles.add(jSeparatorFiles);

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuFiles.add(jMenuItemExit);

        jMenuBarImages.add(jMenuFiles);

        jMenuEdit.setMnemonic('E');
        jMenuEdit.setText("Edit");

        jMenuItemThreshold.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemThreshold.setText("Threshold");
        jMenuItemThreshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThresholdActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemThreshold);

        jMenuBarImages.add(jMenuEdit);

        jMenuHelp.setMnemonic('H');
        jMenuHelp.setText("Help");

        jMenuItemInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemInfo.setText("How it works");
        jMenuItemInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInfoActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItemInfo);

        jMenuBarImages.add(jMenuHelp);

        setJMenuBar(jMenuBarImages);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenActionPerformed
        fc.removeChoosableFileFilter(fc.getAcceptAllFileFilter());

        filtroAll = new FileNameExtensionFilter("Common Images File Formats (*.png, *.jpg, *.jpeg)", "png", "jpg", "jpeg");
        fc.addChoosableFileFilter(filtroAll);

        filtroPNG = new FileNameExtensionFilter("PNG Images File Format (*.png)", "png");
        fc.addChoosableFileFilter(filtroPNG);

        filtroJPEG = new FileNameExtensionFilter("JPEG Images File Formats (*.jpg, *.jpeg)", "jpg", "jpeg");
        fc.addChoosableFileFilter(filtroJPEG);

        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            JInternalFrame[] vectorWindow = jDesktopPane.getAllFrames();
        
            for(JInternalFrame window : vectorWindow) {
                window.dispose();
            }
            
            File fichero = fc.getSelectedFile();

            img = Imgcodecs.imread(fichero.getAbsolutePath());
            
            imgBI = (BufferedImage) HighGui.toBufferedImage(img);
            
            InternalWindow window = new InternalWindow(imgBI.getWidth(), imgBI.getHeight());
            window.setImg(img);
            window.setTitle(fichero.getName());
            jDesktopPane.add(window);
            
            window.setVisible(true);
        }
        if (res == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Please select a valid File", "File NOT selected", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemOpenActionPerformed

    private void jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCloseActionPerformed
        int res3 = JOptionPane.showConfirmDialog(rootPane, "Do you want to close ALL FILES?", "Close file", JOptionPane.YES_NO_OPTION);

        if (res3 == JOptionPane.YES_OPTION) {
            JInternalFrame[] vectorWindow = jDesktopPane.getAllFrames();
        
            for(JInternalFrame window : vectorWindow) {
                window.dispose();
            }
        }
    }//GEN-LAST:event_jMenuItemCloseActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        int res4 = JOptionPane.showConfirmDialog(rootPane, "Do you want to exit the application", "Exit program", JOptionPane.YES_NO_OPTION);

        if (res4 == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemThresholdActionPerformed
        String umbral = JOptionPane.showInputDialog(rootPane, "Introduce the Thresholding Factor", "Thresholding Factor", JOptionPane.INFORMATION_MESSAGE);
        try {
            Integer res5 = Integer.parseInt(umbral);
            
            InternalWindow window = new InternalWindow(imgBI.getWidth(), imgBI.getHeight());
            window.setImg(img);
            window.umbralCall(res5);
            
            window.setTitle(res5.toString());
            jDesktopPane.add(window);
            
            window.setVisible(true);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Number formar Error, please introduce a real number", "Number Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemThresholdActionPerformed

    private void jMenuItemInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInfoActionPerformed
        JOptionPane.showMessageDialog(rootPane,
            "· Welcome to the Threshold Application"
            + "\n \t - Use the Menu Item 'File' (Alt+F) to: "
            + "\n \t \t + Open an Image File (Ctrl+O)"
            + "\n \t \t + Save the current Image to a File (Ctrl+S)"
            + "\n \t \t + Close the current Image File (Ctrl+X)"
            + "\n \t - Use the Menu Item 'Edit' (Alt+E) to: "
            + "\n \t \t + Modify the Image File inputting the Threshold value (Ctrl+T)"
            + "\n \t * Search for help in the Menu Item 'Help' (Alt+H) to receive functional information",
            "Info Window", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemInfoActionPerformed

    private void jDesktopPaneComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPaneComponentResized
        for (JInternalFrame window : jDesktopPane.getAllFrames()) {
            if ((window.getLocation().x + window.getWidth()) > jDesktopPane.getWidth()) {
                if (jDesktopPane.getWidth() - window.getWidth() > 0) {
                    window.setLocation(new Point((jDesktopPane.getWidth() - window.getWidth())/2, (jDesktopPane.getHeight()- window.getHeight())/2));
                }
            }
            if ((window.getLocation().y + window.getHeight()) > jDesktopPane.getHeight()) {
                if (jDesktopPane.getHeight()- window.getHeight() > 0) {
                    window.setLocation(new Point((jDesktopPane.getWidth() - window.getWidth())/2, (jDesktopPane.getHeight()- window.getHeight())/2));
                }
            }
        }
    }//GEN-LAST:event_jDesktopPaneComponentResized

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuBar jMenuBarImages;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFiles;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemClose;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemInfo;
    private javax.swing.JMenuItem jMenuItemOpen;
    private javax.swing.JMenuItem jMenuItemThreshold;
    private javax.swing.JPopupMenu.Separator jSeparatorFiles;
    // End of variables declaration//GEN-END:variables
}
