/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class GoogleMaps extends javax.swing.JPanel{

    public GoogleMaps() {
        JFrame maps = new JFrame("Google Maps");
        try {
        String latitude = "35.834992";
        String longitude = "10.612480";
        String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
        + latitude
        + ","
        + longitude
        + "&zoom=14&size=612x612&scale=2&maptype=roadmap";
        String destinationFile = "image.jpg";
        URL url = new URL(imageUrl);
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destinationFile);
        byte[] b = new byte[2048];
        int length;
        while ((length = is.read(b)) != -1) {
        os.write(b, 0, length);
        }
        is.close();
        os.close();
        } catch (IOException e) {
        e.printStackTrace();
        System.exit(1);
        }
        ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg")).getImage().getScaledInstance(630, 600, java.awt.Image.SCALE_SMOOTH));
        maps.add(new JLabel(imageIcon));
        maps.setVisible(true);
        maps.setSize(630,600);
    }
}
