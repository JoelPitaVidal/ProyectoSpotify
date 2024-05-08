import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutFinal extends JFrame{

    public JPanel panelVentana;
    public JPanel arribaIzquierda;
    public JPanel arribaIzquierdaDebajo;
    public JTextArea listaDeCanciones;
    canciones can = new canciones();

    public LayoutFinal(){

        setTitle("Damtify");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setSize(800,600);
        crearPaneles();
        crearTextArea();
    }

    public void crearPaneles(){

        panelVentana=new JPanel();
        panelVentana.setBounds(0,0,800,600);
        this.getContentPane().add(panelVentana);
        panelVentana.setVisible(true);
        panelVentana.setBackground(Color.black);
        panelVentana.setLayout(null);

        arribaIzquierda=new JPanel();
        arribaIzquierda.setBounds(0,0,160,100);
        panelVentana.add(arribaIzquierda);
        arribaIzquierda.setBackground(Color.pink);

        arribaIzquierdaDebajo=new JPanel();
        arribaIzquierdaDebajo.setBounds(0,105,160,700);
        panelVentana.add(arribaIzquierdaDebajo);
        arribaIzquierdaDebajo.setBackground(Color.pink);
        arribaIzquierdaDebajo.setLayout(null);

    }

    public void crearTextArea(){

        listaDeCanciones=new JTextArea(can.getDatosCanciones());
        listaDeCanciones.setBounds(0,0,160,700);
        listaDeCanciones.setOpaque(false);
        listaDeCanciones.setEditable(false);
        arribaIzquierdaDebajo.add(listaDeCanciones);

    }

}
