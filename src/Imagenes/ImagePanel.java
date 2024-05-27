package Imagenes;
import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

        ImageIcon imagen;
        String nombre;

        public void paint(Graphics g){

            Dimension tamaño=getSize();
            imagen=new ImageIcon(getClass().getResource(nombre));
            g.drawImage(imagen.getImage(), 0, 0, tamaño.width, tamaño.height, null);
            setOpaque(false);super.paint(g);
        }
    }
