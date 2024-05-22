import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class LayoutFinal extends JFrame{

    public JPanel panelReproductorGeneral;
    public JButton arribaIzquierda;
    public JPanel arribaIzquierdaDebajo;
    public JPanel menuDeRobZombie;
    public JPanel reproductorExtemoduro;
    public JPanel reproductorCancionEminem;
    public JPanel reproductorCancionGhostmane;
    public JButton cerrarPanelZombie;
    public JButton botonCerrarExtremoduro;
    public JButton cerrarCancionEminem;
    public JButton cerrarCancionGhostmane;
    public JTextArea listaDeCanciones;
    public JButton botonDeBusqueda;
    public JButton cancionRobZombie;
    public JButton cancionExtremoduro;
    public JButton cancionEminem;
    public JButton cancionGhostmane;

//1 = reproduciendo
//2 = audio parado
    int status;
    Clip clip;

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

        panelReproductorGeneral =new JPanel();
        panelReproductorGeneral.setBounds(0,0,800,600);
        this.getContentPane().add(panelReproductorGeneral);
        panelReproductorGeneral.setVisible(true);
        panelReproductorGeneral.setBackground(Color.black);
        panelReproductorGeneral.setLayout(null);

        arribaIzquierda=new JButton("iniciar sesión de usuario");
        arribaIzquierda.setLayout(null);
        arribaIzquierda.setBounds(0,0,220,100);
        panelReproductorGeneral.add(arribaIzquierda);
        arribaIzquierda.setBackground(Color.pink);

        arribaIzquierdaDebajo=new JPanel();
        arribaIzquierdaDebajo.setBounds(0,105,220,700);
        panelReproductorGeneral.add(arribaIzquierdaDebajo);
        arribaIzquierdaDebajo.setBackground(Color.pink);
        arribaIzquierdaDebajo.setLayout(null);


        botonDeBusqueda =new JButton("Buscar canciones o artistas");
        botonDeBusqueda.setLayout(null);
        panelReproductorGeneral.add(botonDeBusqueda);
        botonDeBusqueda.setBounds(420,460,300,50);
        botonDeBusqueda.setBackground(Color.pink);


        cancionRobZombie =new JButton("Rob Zombie");
        cancionRobZombie.setBounds(580,0,200,200);
        cancionRobZombie.setOpaque(true);
        panelReproductorGeneral.add(cancionRobZombie);
        ImageIcon robzombie = new ImageIcon("src/Imagenes/robzombie.jpg");
        cancionRobZombie.setIcon(robzombie);

        cancionExtremoduro =new JButton("Rob Zombie");
        cancionExtremoduro.setBounds(580,200,200,200);
        cancionExtremoduro.setOpaque(true);
        panelReproductorGeneral.add(cancionExtremoduro);
        ImageIcon extremoDuro = new ImageIcon("src/Imagenes/extremoDuro.jpg");
        cancionExtremoduro.setIcon(extremoDuro);

        cancionEminem =new JButton("Rob Zombie");
        cancionEminem.setBounds(380,0,200,200);
        cancionEminem.setOpaque(true);
        panelReproductorGeneral.add(cancionEminem);
        ImageIcon eminem = new ImageIcon("src/Imagenes/eminem.jpg");
        cancionEminem.setIcon(eminem);

        cancionGhostmane =new JButton("Rob Zombie");
        cancionGhostmane.setBounds(380,200,200,200);
        cancionGhostmane.setOpaque(true);
        panelReproductorGeneral.add(cancionGhostmane);
        ImageIcon ghostmane = new ImageIcon("src/Imagenes/ghostmane.jpg");
        cancionGhostmane.setIcon(ghostmane);

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
        cancionRobZombie.addActionListener(new ActionListener() {
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

                menuDeRobZombie =new JPanel();
                menuDeRobZombie.setBounds(230,15,140,200);
                panelReproductorGeneral.add(menuDeRobZombie);
                menuDeRobZombie.setBackground(Color.pink);
                menuDeRobZombie.setLayout(null);

                cerrarPanelZombie = new JButton("Fin \nreproducción");
                cerrarPanelZombie.setBounds(230,245,140,50);
                panelReproductorGeneral.add(cerrarPanelZombie);
                cerrarPanelZombie.setBackground(Color.pink);
                cerrarPanelZombie.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(15,20,50,50);
                menuDeRobZombie.add(botonplay);
                botonplay.setBackground(Color.pink);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(15,120,50,50);
                menuDeRobZombie.add(botonpause);
                botonpause.setBackground(Color.pink);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(75,20,50,50);
                menuDeRobZombie.add(botonrepetir);
                botonrepetir.setBackground(Color.pink);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(75,120,50,50);
                menuDeRobZombie.add(añadirAlista);
                añadirAlista.setBackground(Color.pink);
                añadirAlista.setIcon(añadirLista);

                cerrarPanelZombie.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelReproductorGeneral.remove(menuDeRobZombie);
                        panelReproductorGeneral.remove(cerrarPanelZombie);
                        panelReproductorGeneral.revalidate();
                        panelReproductorGeneral.repaint();
                 }
              });




                botonplay.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // estado actual del clip
                        AudioInputStream audioInputStream;
                        String filePath= "src/sounds/Rob Zombie - Dragula.wav";
                        // create AudioInputStream object
                        try {
                            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
                            // create clip reference
                            clip = AudioSystem.getClip();

                            // open audioInputStream to the clip
                            clip.open(audioInputStream);

                            clip.start();
                            status=1;
                        }
                        catch (UnsupportedAudioFileException ex) {

                            throw new RuntimeException(ex);

                        }
                        catch (IOException ex) {

                            throw new RuntimeException(ex);

                        } catch (LineUnavailableException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });

                // Acción para pausar la reproducción
                botonpause.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        AudioInputStream audioInputStream;
                        String filePath= "src/sounds/Rob Zombie - Dragula.wav";
                        if (status==1){
                            clip.stop();
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });
                //activar la repetición en bucle de la cancion
                botonrepetir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clip.loop(Clip.LOOP_CONTINUOUSLY);
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });

            }
        });
    }
    public void menuDeReproduccion2(){
        cancionExtremoduro.addActionListener(new ActionListener() {
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

                reproductorExtemoduro =new JPanel();
                reproductorExtemoduro.setBounds(230,15,140,200);
                panelReproductorGeneral.add(reproductorExtemoduro);
                reproductorExtemoduro.setBackground(Color.pink);
                reproductorExtemoduro.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(15,20,50,50);
                reproductorExtemoduro.add(botonplay);
                botonplay.setBackground(Color.pink);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(15,120,50,50);
                reproductorExtemoduro.add(botonpause);
                botonpause.setBackground(Color.pink);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(75,20,50,50);
                reproductorExtemoduro.add(botonrepetir);
                botonrepetir.setBackground(Color.pink);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(75,120,50,50);
                reproductorExtemoduro.add(añadirAlista);
                añadirAlista.setBackground(Color.pink);
                añadirAlista.setIcon(añadirLista);

                botonCerrarExtremoduro =new JButton("Fin \nreproducción");
                botonCerrarExtremoduro.setBounds(230,245,140,50);
                panelReproductorGeneral.add(botonCerrarExtremoduro);
                botonCerrarExtremoduro.setBackground(Color.pink);
                botonCerrarExtremoduro.setLayout(null);

                botonCerrarExtremoduro.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelReproductorGeneral.remove(reproductorExtemoduro);
                        panelReproductorGeneral.remove(botonCerrarExtremoduro);
                        panelReproductorGeneral.revalidate();
                        panelReproductorGeneral.repaint();
                    }
                });


                botonplay.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // estado actual del clip
                        AudioInputStream audioInputStream;
                        String filePath= "src/sounds/La vereda de la puerta de atrás.wav";
                        // create AudioInputStream object
                        try {
                            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
                            // create clip reference
                            clip = AudioSystem.getClip();
                            // open audioInputStream to the clip
                            clip.open(audioInputStream);

                            clip.loop(Clip.LOOP_CONTINUOUSLY);

                            clip.start();
                            status=1;
                        }
                        catch (UnsupportedAudioFileException ex) {
                            throw new RuntimeException(ex);
                        }
                        catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } catch (LineUnavailableException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                botonpause.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clip.stop();
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });

            }
        });

    }

    public void menuDeReproduccion3(){
        cancionEminem.addActionListener(new ActionListener() {
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

                reproductorCancionEminem =new JPanel();
                reproductorCancionEminem.setBounds(230,15,140,200);
                panelReproductorGeneral.add(reproductorCancionEminem);
                reproductorCancionEminem.setBackground(Color.pink);
                reproductorCancionEminem.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(15,20,50,50);
                reproductorCancionEminem.add(botonplay);
                botonplay.setBackground(Color.pink);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(15,120,50,50);
                reproductorCancionEminem.add(botonpause);
                botonpause.setBackground(Color.pink);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(75,20,50,50);
                reproductorCancionEminem.add(botonrepetir);
                botonrepetir.setBackground(Color.pink);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(75,120,50,50);
                reproductorCancionEminem.add(añadirAlista);
                añadirAlista.setBackground(Color.pink);
                añadirAlista.setIcon(añadirLista);

                cerrarCancionEminem =new JButton("Fin \nreproducción");
                cerrarCancionEminem.setBounds(230,245,140,50);
                panelReproductorGeneral.add(cerrarCancionEminem);
                cerrarCancionEminem.setBackground(Color.pink);
                cerrarCancionEminem.setLayout(null);

                cerrarCancionEminem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelReproductorGeneral.remove(reproductorCancionEminem);
                        panelReproductorGeneral.remove(cerrarCancionEminem);
                        panelReproductorGeneral.revalidate();
                        panelReproductorGeneral.repaint();
                    }
                });

                botonplay.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // estado actual del clip
                        AudioInputStream audioInputStream;
                        String filePath= "src/sounds/Without Me.wav";
                        // create AudioInputStream object
                        try {
                            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
                            // create clip reference
                            clip = AudioSystem.getClip();

                            // open audioInputStream to the clip
                            clip.open(audioInputStream);

                            clip.loop(Clip.LOOP_CONTINUOUSLY);

                            clip.start();
                            status=1;
                        }
                        catch (UnsupportedAudioFileException ex) {
                            throw new RuntimeException(ex);
                        }
                        catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } catch (LineUnavailableException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                botonpause.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clip.stop();
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });

            }
        });

    }

    public void menuDeReproduccion4(){
        cancionGhostmane.addActionListener(new ActionListener() {
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

                reproductorCancionGhostmane =new JPanel();
                reproductorCancionGhostmane.setBounds(230,15,140,200);
                panelReproductorGeneral.add(reproductorCancionGhostmane);
                reproductorCancionGhostmane.setBackground(Color.pink);
                reproductorCancionGhostmane.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(15,20,50,50);
                reproductorCancionGhostmane.add(botonplay);
                botonplay.setBackground(Color.pink);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(15,120,50,50);
                reproductorCancionGhostmane.add(botonpause);
                botonpause.setBackground(Color.pink);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(75,20,50,50);
                reproductorCancionGhostmane.add(botonrepetir);
                botonrepetir.setBackground(Color.pink);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(75,120,50,50);
                reproductorCancionGhostmane.add(añadirAlista);
                añadirAlista.setBackground(Color.pink);
                añadirAlista.setIcon(añadirLista);

                cerrarCancionGhostmane =new JButton("Fin \nreproducción");
                cerrarCancionGhostmane.setBounds(230,245,140,50);
                panelReproductorGeneral.add(cerrarCancionGhostmane);
                cerrarCancionGhostmane.setBackground(Color.pink);
                cerrarCancionGhostmane.setLayout(null);

                cerrarCancionGhostmane.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelReproductorGeneral.remove(reproductorCancionGhostmane);
                        panelReproductorGeneral.remove(cerrarCancionGhostmane);
                        panelReproductorGeneral.revalidate();
                        panelReproductorGeneral.repaint();
                    }
                });

                botonplay.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // estado actual del clip
                        AudioInputStream audioInputStream;
                        String filePath= "src/sounds/GHOSTEMANE - Andromeda [Official Video].wav";
                        // create AudioInputStream object
                        try {
                            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
                            // create clip reference
                            clip = AudioSystem.getClip();

                            // open audioInputStream to the clip
                            clip.open(audioInputStream);

                            clip.loop(Clip.LOOP_CONTINUOUSLY);

                            clip.start();
                            status=1;
                        }
                        catch (UnsupportedAudioFileException ex) {
                            throw new RuntimeException(ex);
                        }
                        catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } catch (LineUnavailableException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                botonpause.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clip.stop();
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });

            }
        });

    }

}
