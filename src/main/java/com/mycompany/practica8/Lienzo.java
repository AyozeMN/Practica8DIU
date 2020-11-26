package com.mycompany.practica8;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Ayoze, Nicolás
 */
public class Lienzo extends JPanel {
    protected Mat imgOrigen = null;
    protected Mat imgClon = null;
    protected BufferedImage imgBI = null;

    public BufferedImage getImgBI() {
        return imgBI;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        if (imgBI != null) {
            this.setPreferredSize(new Dimension(imgBI.getWidth(), imgBI.getHeight()));
        }
        super.paintComponent(g);
        g.drawImage(imgBI, 0, 0, null);
        repaint();
    }
    
    public void setMat(Mat imagenRead) {
        if (imagenRead != null) {
            imgOrigen = imagenRead;
            imgBI = (BufferedImage) HighGui.toBufferedImage(imagenRead);
        } else {
            imgOrigen = null;
            imgBI = null;
        }
        
        this.repaint();
    }
    
    public void callUmbralizar(Integer umbral) {
        imgClon = (umbralizar(imgOrigen, umbral));
        imgBI = (BufferedImage) HighGui.toBufferedImage(imgClon);
        
        this.repaint();
    }
    
    private Mat umbralizar(Mat imagen_original, Integer umbral) {
        // crear dos imágenes en niveles de gris con el mismo
        // tamaño que la original
        Mat imagenGris = new Mat(imagen_original.rows(), imagen_original.cols(), CvType.CV_8U);
        Mat imagenUmbralizada = new Mat(imagen_original.rows(), imagen_original.cols(), CvType.CV_8U);
        // convierte a niveles de grises la imagen original
        Imgproc.cvtColor(imagen_original, imagenGris, Imgproc.COLOR_BGR2GRAY);
        // umbraliza la imagen:
        // - píxeles con nivel de gris > umbral se ponen a 1
        // - píxeles con nivel de gris <= umbra se ponen a 0
        Imgproc.threshold(imagenGris, imagenUmbralizada, umbral, 255, Imgproc.THRESH_BINARY);
        // se devuelve la imagen umbralizada
        return imagenUmbralizada;
    }
}
