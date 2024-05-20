import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class LayoutFinal extends JFrame{

    public JPanel panelVentana;
    public JButton arribaIzquierda;
    public JPanel arribaIzquierdaDebajo;
    public JPanel menuDeReproduccion;
    public JPanel menuDeReproduccion2;
    public JPanel menuDeReproduccion3;
    public JPanel menuDeReproduccion4;
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


    private Clip audioClip;

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

                menuDeReproduccion =new JPanel();
                menuDeReproduccion.setBounds(230,15,140,200);
                panelVentana.add(menuDeReproduccion);
                menuDeReproduccion.setBackground(Color.pink);
                menuDeReproduccion.setLayout(null);

                botonCerrar1 = new JButton("Fin \nreproducción");
                botonCerrar1.setBounds(230,245,140,50);
                panelVentana.add(botonCerrar1);
                botonCerrar1.setBackground(Color.pink);
                botonCerrar1.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(15,20,50,50);
                menuDeReproduccion.add(botonplay);
                botonplay.setBackground(Color.pink);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(15,120,50,50);
                menuDeReproduccion.add(botonpause);
                botonpause.setBackground(Color.pink);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(75,20,50,50);
                menuDeReproduccion.add(botonrepetir);
                botonrepetir.setBackground(Color.pink);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(75,120,50,50);
                menuDeReproduccion.add(añadirAlista);
                añadirAlista.setBackground(Color.pink);
                añadirAlista.setIcon(añadirLista);

                botonCerrar1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelVentana.remove(menuDeReproduccion);
                        panelVentana.remove(botonCerrar1);
                        panelVentana.revalidate();
                        panelVentana.repaint();
                 }
              });
                botonplay.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {

                            File audioFile = new File("src/sounds/Rob Zombie - Dragula.wav");
                            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
                            audioClip.open(audioStream);
                            audioClip = AudioSystem.getClip();
                            if (audioClip != null && audioClip.isOpen()) {
                                audioClip.start();
                                System.out.println("El audio Funciona");
                            }

                        }

                        catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                            ex.printStackTrace();
                            System.out.println("El audio no funcionna");
                        }
                    }
                });

                // Acción para pausar la reproducción
                botonpause.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (audioClip != null && audioClip.isRunning()) {
                            audioClip.stop();
                        }
                    }
                });
            }
        });
    }
    public void menuDeReproduccion2(){
        recomendaciones2.addActionListener(new ActionListener() {
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

                menuDeReproduccion2 =new JPanel();
                menuDeReproduccion2.setBounds(230,15,140,200);
                panelVentana.add(menuDeReproduccion2);
                menuDeReproduccion2.setBackground(Color.pink);
                menuDeReproduccion2.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(15,20,50,50);
                menuDeReproduccion2.add(botonplay);
                botonplay.setBackground(Color.pink);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(15,120,50,50);
                menuDeReproduccion2.add(botonpause);
                botonpause.setBackground(Color.pink);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(75,20,50,50);
                menuDeReproduccion2.add(botonrepetir);
                botonrepetir.setBackground(Color.pink);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(75,120,50,50);
                menuDeReproduccion2.add(añadirAlista);
                añadirAlista.setBackground(Color.pink);
                añadirAlista.setIcon(añadirLista);

                botonCerrar2 =new JButton("Fin \nreproducción");
                botonCerrar2.setBounds(230,245,140,50);
                panelVentana.add(botonCerrar2);
                botonCerrar2.setBackground(Color.pink);
                botonCerrar2.setLayout(null);

                botonCerrar2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelVentana.remove(menuDeReproduccion2);
                        panelVentana.remove(botonCerrar2);
                        panelVentana.revalidate();
                        panelVentana.repaint();
                    }
                });

            }
        });

    }

    public void menuDeReproduccion3(){
        recomendaciones3.addActionListener(new ActionListener() {
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

                menuDeReproduccion3 =new JPanel();
                menuDeReproduccion3.setBounds(230,15,140,200);
                panelVentana.add(menuDeReproduccion3);
                menuDeReproduccion3.setBackground(Color.pink);
                menuDeReproduccion3.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(15,20,50,50);
                menuDeReproduccion3.add(botonplay);
                botonplay.setBackground(Color.pink);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(15,120,50,50);
                menuDeReproduccion3.add(botonpause);
                botonpause.setBackground(Color.pink);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(75,20,50,50);
                menuDeReproduccion3.add(botonrepetir);
                botonrepetir.setBackground(Color.pink);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(75,120,50,50);
                menuDeReproduccion3.add(añadirAlista);
                añadirAlista.setBackground(Color.pink);
                añadirAlista.setIcon(añadirLista);

                botonCerrar3 =new JButton("Fin \nreproducción");
                botonCerrar3.setBounds(230,245,140,50);
                panelVentana.add(botonCerrar3);
                botonCerrar3.setBackground(Color.pink);
                botonCerrar3.setLayout(null);

                botonCerrar3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelVentana.remove(menuDeReproduccion3);
                        panelVentana.remove(botonCerrar3);
                        panelVentana.revalidate();
                        panelVentana.repaint();
                    }
                });

            }
        });

    }

    public void menuDeReproduccion4(){
        recomendaciones4.addActionListener(new ActionListener() {
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

                menuDeReproduccion4 =new JPanel();
                menuDeReproduccion4.setBounds(230,15,140,200);
                panelVentana.add(menuDeReproduccion4);
                menuDeReproduccion4.setBackground(Color.pink);
                menuDeReproduccion4.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(15,20,50,50);
                menuDeReproduccion4.add(botonplay);
                botonplay.setBackground(Color.pink);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(15,120,50,50);
                menuDeReproduccion4.add(botonpause);
                botonpause.setBackground(Color.pink);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(75,20,50,50);
                menuDeReproduccion4.add(botonrepetir);
                botonrepetir.setBackground(Color.pink);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(75,120,50,50);
                menuDeReproduccion4.add(añadirAlista);
                añadirAlista.setBackground(Color.pink);
                añadirAlista.setIcon(añadirLista);

                botonCerrar4 =new JButton("Fin \nreproducción");
                botonCerrar4.setBounds(230,245,140,50);
                panelVentana.add(botonCerrar4);
                botonCerrar4.setBackground(Color.pink);
                botonCerrar4.setLayout(null);

                botonCerrar4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelVentana.remove(menuDeReproduccion4);
                        panelVentana.remove(botonCerrar4);
                        panelVentana.revalidate();
                        panelVentana.repaint();
                    }
                });
            }
        });

    }

}
