import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class LayoutFinal extends JFrame{

    public JPanel panelVentana;
    public JButton arribaIzquierda;
    public JPanel arribaIzquierdaDebajo;
    public JPanel menuDeReproducción;
    public JPanel menuDeReproducción2;
    public JPanel menuDeReproducción3;
    public JPanel menuDeReproducción4;
    public JButton botonCerrar1;
    public JButton botonCerrar2;
    public JButton botonCerrar3;
    public JButton botonCerrar4;
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
        menuDeReproduccion();
        menuDeReproduccion2();
        menuDeReproduccion3();
        menuDeReproduccion4();
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
        botonDeBusqueda.setBounds(420,460,300,50);
        botonDeBusqueda.setBackground(Color.pink);


        recomendaciones1 =new JButton("Rob Zombie");
        recomendaciones1.setBounds(580,0,200,200);
        recomendaciones1.setOpaque(true);
        panelVentana.add(recomendaciones1);
        ImageIcon robzombie = new ImageIcon("src/Imagenes/robzombie.jpg");
        recomendaciones1.setIcon(robzombie);

        recomendaciones2 =new JButton("Rob Zombie");
        recomendaciones2.setBounds(580,200,200,200);
        recomendaciones2.setOpaque(true);
        panelVentana.add(recomendaciones2);
        ImageIcon extremoDuro = new ImageIcon("src/Imagenes/extremoDuro.jpg");
        recomendaciones2.setIcon(extremoDuro);

        recomendaciones3 =new JButton("Rob Zombie");
        recomendaciones3.setBounds(380,0,200,200);
        recomendaciones3.setOpaque(true);
        panelVentana.add(recomendaciones3);
        ImageIcon eminem = new ImageIcon("src/Imagenes/eminem.jpg");
        recomendaciones3.setIcon(eminem);

        recomendaciones4 =new JButton("Rob Zombie");
        recomendaciones4.setBounds(380,200,200,200);
        recomendaciones4.setOpaque(true);
        panelVentana.add(recomendaciones4);
        ImageIcon ghostmane = new ImageIcon("src/Imagenes/ghostmane.jpg");
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
    public void menuDeReproduccion(){
        recomendaciones1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ImageIcon play = new ImageIcon("src/iconos/play.png");
                JButton botonplay;
                ImageIcon pause = new ImageIcon("src/iconos/pause.png");
                JButton botonpause;
                ImageIcon repetir = new ImageIcon("src/iconos/repetir.png");
                JButton botonrepetir;
                ImageIcon añadirLista = new ImageIcon("src/iconos/añadirAlista.png");
                JButton añadirAlista;

                menuDeReproducción=new JPanel();
                menuDeReproducción.setBounds(230,15,140,200);
                panelVentana.add(menuDeReproducción);
                menuDeReproducción.setBackground(Color.pink);
                menuDeReproducción.setLayout(null);

                botonCerrar1 = new JButton("Fin \nreproducción");
                botonCerrar1.setBounds(230,245,140,50);
                panelVentana.add(botonCerrar1);
                botonCerrar1.setBackground(Color.pink);
                botonCerrar1.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(20,20,50,50);
                menuDeReproducción.add(botonplay);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(40,20,50,50);
                menuDeReproducción.add(botonpause);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(20,40,50,50);
                menuDeReproducción.add(botonrepetir);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(40,40,50,50);
                menuDeReproducción.add(añadirAlista);
                añadirAlista.setIcon(añadirLista);

                botonCerrar1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });

            }
        });

    }
    public void menuDeReproduccion2(){
        recomendaciones2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuDeReproducción2=new JPanel();
                menuDeReproducción2.setBounds(230,15,140,200);
                panelVentana.add(menuDeReproducción2);
                menuDeReproducción2.setBackground(Color.pink);
                menuDeReproducción2.setLayout(null);

                botonCerrar2 =new JButton("Fin \nreproducción");
                botonCerrar2.setBounds(230,245,140,50);
                panelVentana.add(botonCerrar2);
                botonCerrar2.setBackground(Color.pink);
                botonCerrar2.setLayout(null);
            }
        });

    }

    public void menuDeReproduccion3(){
        recomendaciones3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuDeReproducción3=new JPanel();
                menuDeReproducción3.setBounds(230,15,140,200);
                panelVentana.add(menuDeReproducción3);
                menuDeReproducción3.setBackground(Color.pink);
                menuDeReproducción3.setLayout(null);

                botonCerrar3 =new JButton("Fin \nreproducción");
                botonCerrar3.setBounds(230,245,140,50);
                panelVentana.add(botonCerrar3);
                botonCerrar3.setBackground(Color.pink);
                botonCerrar3.setLayout(null);
            }
        });

    }

    public void menuDeReproduccion4(){
        recomendaciones4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuDeReproducción4=new JPanel();
                menuDeReproducción4.setBounds(230,15,140,200);
                panelVentana.add(menuDeReproducción4);
                menuDeReproducción4.setBackground(Color.pink);
                menuDeReproducción4.setLayout(null);

                botonCerrar4 =new JButton("Fin \nreproducción");
                botonCerrar4.setBounds(230,245,140,50);
                panelVentana.add(botonCerrar4);
                botonCerrar4.setBackground(Color.pink);
                botonCerrar4.setLayout(null);
            }
        });

    }

}
