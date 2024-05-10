import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.ArrayList;

public class LayoutFinal extends JFrame{

    public JPanel panelVentana;
    public JPanel arribaIzquierda;
    public JPanel arribaIzquierdaDebajo;
    public JTextArea listaDeCanciones;
    public JButton botonDeBusqueda;
    canciones can = new canciones();
    infoArtistas infart = new infoArtistas();
    public LayoutFinal(){

        setTitle("Damtify");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setSize(800,600);
        crearPaneles();
        crearTextArea();
        buscadorDeCanciones();
    }

    public void crearPaneles(){

        panelVentana=new JPanel();
        panelVentana.setBounds(0,0,800,600);
        this.getContentPane().add(panelVentana);
        panelVentana.setVisible(true);
        panelVentana.setBackground(Color.black);
        panelVentana.setLayout(null);

        arribaIzquierda=new JPanel();
        arribaIzquierda.setBounds(0,0,220,100);
        panelVentana.add(arribaIzquierda);
        arribaIzquierda.setBackground(Color.pink);

        arribaIzquierdaDebajo=new JPanel();
        arribaIzquierdaDebajo.setBounds(0,105,220,700);
        panelVentana.add(arribaIzquierdaDebajo);
        arribaIzquierdaDebajo.setBackground(Color.pink);
        arribaIzquierdaDebajo.setLayout(null);


        botonDeBusqueda =new JButton("Buscar canciones o artistas");
        botonDeBusqueda.setLayout(null);
        panelVentana.add(botonDeBusqueda);
        botonDeBusqueda.setBounds(225,517,300,50);
        botonDeBusqueda.setBackground(Color.pink);

    }

    public void crearTextArea(){
        listaDeCanciones=new JTextArea(can.getDatosCanciones());
        listaDeCanciones.setBounds(0,0,220,700);
        listaDeCanciones.setOpaque(false);
        listaDeCanciones.setEditable(false);
        arribaIzquierdaDebajo.add(listaDeCanciones);


    }
    public void buscadorDeCanciones(){
    botonDeBusqueda.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            infart.menuDeBusqueda();
      }
  });
}




}
