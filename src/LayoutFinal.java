import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class LayoutFinal extends JFrame{

    public JPanel panelVentana;
    public JButton arribaIzquierda;
    public JPanel arribaIzquierdaDebajo;
    public JTextArea listaDeCanciones;
    public JButton botonDeBusqueda;
    public JButton recomendaciones1;
    public JButton recomendaciones2;
    public JButton recomendaciones3;
    public JButton recomendaciones4;


    Listas can = new Listas();
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
        sesionDeUsuario();
    }

    public void crearPaneles(){

        panelVentana=new JPanel();
        panelVentana.setBounds(0,0,800,600);
        this.getContentPane().add(panelVentana);
        panelVentana.setVisible(true);
        panelVentana.setBackground(Color.black);
        panelVentana.setLayout(null);

        arribaIzquierda=new JButton("iniciar sesión de usuario");
        arribaIzquierda.setLayout(null);
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
        botonDeBusqueda.setBounds(420,517,300,50);
        botonDeBusqueda.setBackground(Color.pink);


        recomendaciones1 =new JButton("Rob Zombie");
        recomendaciones1.setBounds(580,0,200,200);
        recomendaciones1.setOpaque(true);
        panelVentana.add(recomendaciones1);
        ImageIcon robzombie = new ImageIcon("src/robzombie.jpg");
        recomendaciones1.setIcon(robzombie);

        recomendaciones2 =new JButton("Rob Zombie");
        recomendaciones2.setBounds(580,200,200,200);
        recomendaciones2.setOpaque(true);
        panelVentana.add(recomendaciones2);
        ImageIcon extremoDuro = new ImageIcon("src/extremoDuro.jpg");
        recomendaciones2.setIcon(extremoDuro);

        recomendaciones3 =new JButton("Rob Zombie");
        recomendaciones3.setBounds(380,0,200,200);
        recomendaciones3.setOpaque(true);
        panelVentana.add(recomendaciones3);
        ImageIcon eminem = new ImageIcon("src/eminem.jpg");
        recomendaciones3.setIcon(eminem);

        recomendaciones4 =new JButton("Rob Zombie");
        recomendaciones4.setBounds(380,200,200,200);
        recomendaciones4.setOpaque(true);
        panelVentana.add(recomendaciones4);
        ImageIcon ghostmane = new ImageIcon("src/ghostmane.jpg");
        recomendaciones4.setIcon(ghostmane);

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


public void sesionDeUsuario(){
        arribaIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
