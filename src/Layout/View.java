package Layout;

import Artistas.SingersInfo;
import Canciones.SongsList;
import Users.DataBase;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.File;
import java.io.IOException;

import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class View extends JFrame{

    public JPanel panelReproductorGeneral;
    public JButton botonInicioSesionUsuario;

    public JPanel mostrarListasAleatorias;
    public JTextArea listaDeCanciones;

    public JPanel reproductorRobZombie;
    public JPanel reproductorExtemoduro;
    public JPanel reproductorEminem;
    public JPanel reproductorGhostmane;

    public JButton cerrarReproductorRobZombie;
    public JButton cerrarReproductorExtremoduro;
    public JButton cerrarReproductorEminem;
    public JButton cerrarReproductorGhostmane;

    public JButton cancionRobZombie;
    public JButton cancionExtremoduro;
    public JButton cancionEminem;
    public JButton cancionGhostmane;

    public JButton botonDeBusqueda;

    public JButton reproduccionAleatoria;
    public JButton botonDeAyuda;

//botones de reproducción de rob zombie e iconos
    ImageIcon play = new ImageIcon("src/iconos/play.png");
    JButton botonplay;
    ImageIcon pause = new ImageIcon("src/iconos/pause.png");
    public JButton botonpause;
    ImageIcon repetir = new ImageIcon("src/iconos/repetir.png");
    public JButton botonrepetir;
    ImageIcon añadirLista = new ImageIcon("src/iconos/añadirAlista.png");
    JButton añadirAlista;
    ImageIcon siguiente = new ImageIcon("src/iconos/siquiente.png");
    JButton botonSiguiente;
    ImageIcon anterior = new ImageIcon("src/iconos/anterior.png");
    JButton botonAnterior;
//botones de reproducción extremo duro e iconos
    ImageIcon play2 = new ImageIcon("src/iconos/play.png");
    JButton botonplay2;
    ImageIcon pause2 = new ImageIcon("src/iconos/pause.png");
    JButton botonpause2;
    ImageIcon repetir2 = new ImageIcon("src/iconos/repetir.png");
    JButton botonrepetir2;
    ImageIcon añadirLista2 = new ImageIcon("src/iconos/añadirAlista.png");
    JButton añadirAlista2;
    ImageIcon siguiente2 = new ImageIcon("src/iconos/siquiente.png");
    JButton botonSiguiente2;
    ImageIcon anterior2 = new ImageIcon("src/iconos/anterior.png");
    JButton botonAnterior2;
//botones de reproducción de Eminem e iconos
    ImageIcon play3 = new ImageIcon("src/iconos/play.png");
    JButton botonplay3;
    ImageIcon pause3 = new ImageIcon("src/iconos/pause.png");
    JButton botonpause3;
    ImageIcon repetir3 = new ImageIcon("src/iconos/repetir.png");
    JButton botonrepetir3;
    ImageIcon añadirLista3 = new ImageIcon("src/iconos/añadirAlista.png");
    JButton añadirAlista3;
    ImageIcon siguiente3 = new ImageIcon("src/iconos/siquiente.png");
    JButton botonSiguiente3;
    ImageIcon anterior3 = new ImageIcon("src/iconos/anterior.png");
    JButton botonAnterior3;
//botones de reproducción de Ghostmane e iconos
    ImageIcon play4 = new ImageIcon("src/iconos/play.png");
    JButton botonplay4;
    ImageIcon pause4 = new ImageIcon("src/iconos/pause.png");
    JButton botonpause4;
    ImageIcon repetir4 = new ImageIcon("src/iconos/repetir.png");
    JButton botonrepetir4;
    ImageIcon añadirLista4 = new ImageIcon("src/iconos/añadirAlista.png");
    JButton añadirAlista4;
    ImageIcon siguiente4 = new ImageIcon("src/iconos/siquiente.png");
    JButton botonSiguiente4;
    ImageIcon anterior4 = new ImageIcon("src/iconos/anterior.png");
    JButton botonAnterior4;
//...............................................

    int UltimaCancion = 0;

//variables para indicar la canción siguiente y anterior
    //1:Rob zombie
    //2:Extremo duro
    //3:Eminem
    //4;Ghostmane


    int status;
//1 = reproduciendo
//2 = audio parado


    private Clip clipRobZombie;
    private Clip clipExtremoDuro;
    private Clip clipEminem;
    private Clip clipGhostmane;

    private Clip audioClip;

    SongsList can = new SongsList();
    SingersInfo infart = new SingersInfo();

    public View(){
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
        panelReproductorGeneral.setLayout(null);
        panelReproductorGeneral.setBackground(Color.black);

        botonInicioSesionUsuario =new JButton("iniciar sesión de usuario");
        botonInicioSesionUsuario.setLayout(null);
        botonInicioSesionUsuario.setBounds(0,0,220,100);
        panelReproductorGeneral.add(botonInicioSesionUsuario);
        botonInicioSesionUsuario.setBackground(Color.pink);

        mostrarListasAleatorias =new JPanel();
        mostrarListasAleatorias.setBounds(0,105,220,700);
        panelReproductorGeneral.add(mostrarListasAleatorias);
        mostrarListasAleatorias.setBackground(Color.pink);
        mostrarListasAleatorias.setLayout(null);


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


        botonDeAyuda = new JButton("Ayuda");
        botonDeAyuda.setBounds(230,360,140,50);
        panelReproductorGeneral.add(botonDeAyuda);
        botonDeAyuda.setBackground(Color.pink);
        botonDeAyuda.setLayout(null);

        botonReproduccionRandom();
        HelperButton();
    }

    public void crearTextArea(){
        listaDeCanciones=new JTextArea(can.getDatosCanciones());
        listaDeCanciones.setBounds(0,0,220,700);
        listaDeCanciones.setOpaque(false);
        listaDeCanciones.setEditable(false);
        mostrarListasAleatorias.add(listaDeCanciones);


    }

    public void HelperButton(){
        botonDeAyuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Help hlp = new Help();
                hlp.respuestaBotonAyuda();
            }
        });
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
        botonInicioSesionUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataBase inses =  new DataBase();
                inses.RespuestaBotonIncio();
            }
        });
    }

    public void menuDeReproduccion(){
        cancionRobZombie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproductorRobZombie =new JPanel();
                reproductorRobZombie.setBounds(230,15,140,200);
                panelReproductorGeneral.add(reproductorRobZombie);
                reproductorRobZombie.setBackground(Color.pink);
                reproductorRobZombie.setLayout(null);

                cerrarReproductorRobZombie = new JButton("Fin \nreproducción");
                cerrarReproductorRobZombie.setBounds(230,245,140,50);
                panelReproductorGeneral.add(cerrarReproductorRobZombie);
                cerrarReproductorRobZombie.setBackground(Color.pink);
                cerrarReproductorRobZombie.setLayout(null);

                botonplay = new JButton();
                botonplay.setBounds(15,20,50,50);
                reproductorRobZombie.add(botonplay);
                botonplay.setBackground(Color.pink);
                botonplay.setIcon(play);

                botonpause = new JButton();
                botonpause.setBounds(15,120,50,50);
                reproductorRobZombie.add(botonpause);
                botonpause.setBackground(Color.pink);
                botonpause.setIcon(pause);

                botonrepetir = new JButton();
                botonrepetir.setBounds(75,20,50,50);
                reproductorRobZombie.add(botonrepetir);
                botonrepetir.setBackground(Color.pink);
                botonrepetir.setIcon(repetir);

                añadirAlista = new JButton();
                añadirAlista.setBounds(75,120,50,50);
                reproductorRobZombie.add(añadirAlista);
                añadirAlista.setBackground(Color.pink);
                añadirAlista.setIcon(añadirLista);

                botonSiguiente = new JButton();
                botonSiguiente.setBounds(75,70,50,50);
                reproductorRobZombie.add(botonSiguiente);
                botonSiguiente.setBackground(Color.pink);
                botonSiguiente.setIcon(siguiente);

                botonAnterior = new JButton();
                botonAnterior.setBounds(15,70,50,50);
                reproductorRobZombie.add(botonAnterior);
                botonAnterior.setBackground(Color.pink);
                botonAnterior.setIcon(anterior);

                cerrarReproductorRobZombie.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelReproductorGeneral.remove(reproductorRobZombie);
                        panelReproductorGeneral.remove(cerrarReproductorRobZombie);
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
                            clipRobZombie = AudioSystem.getClip();
                            // open audioInputStream to the clip
                            clipRobZombie.open(audioInputStream);
                            //Iniciar reproducción e igualar las variables a su valor correspondiente
                            clipRobZombie.start();
                            status=1;
                            UltimaCancion=1;
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
                            clipRobZombie.stop();
                            status=0;
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
                            clipRobZombie.loop(Clip.LOOP_CONTINUOUSLY);
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });

                botonSiguiente.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (UltimaCancion==1){
                            clipRobZombie.stop();
                            cerrarReproductorRobZombie.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            cerrarReproductorExtremoduro.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarReproductorEminem.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarReproductorGhostmane.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        } else if (UltimaCancion==0) {
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        }
                    }
                });
                botonAnterior.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (UltimaCancion==1){
                            clipRobZombie.stop();
                            cerrarReproductorRobZombie.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            cerrarReproductorExtremoduro.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarReproductorEminem.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarReproductorGhostmane.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==0) {
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
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


                reproductorExtemoduro =new JPanel();
                reproductorExtemoduro.setBounds(230,15,140,200);
                panelReproductorGeneral.add(reproductorExtemoduro);
                reproductorExtemoduro.setBackground(Color.pink);
                reproductorExtemoduro.setLayout(null);

                botonplay2 = new JButton();
                botonplay2.setBounds(15,20,50,50);
                reproductorExtemoduro.add(botonplay2);
                botonplay2.setBackground(Color.pink);
                botonplay2.setIcon(play2);

                botonpause2 = new JButton();
                botonpause2.setBounds(15,120,50,50);
                reproductorExtemoduro.add(botonpause2);
                botonpause2.setBackground(Color.pink);
                botonpause2.setIcon(pause2);

                botonrepetir2 = new JButton();
                botonrepetir2.setBounds(75,20,50,50);
                reproductorExtemoduro.add(botonrepetir2);
                botonrepetir2.setBackground(Color.pink);
                botonrepetir2.setIcon(repetir2);

                añadirAlista2 = new JButton();
                añadirAlista2.setBounds(75,120,50,50);
                reproductorExtemoduro.add(añadirAlista2);
                añadirAlista2.setBackground(Color.pink);
                añadirAlista2.setIcon(añadirLista2);

                botonSiguiente2 = new JButton();
                botonSiguiente2.setBounds(75,70,50,50);
                reproductorExtemoduro.add(botonSiguiente2);
                botonSiguiente2.setBackground(Color.pink);
                botonSiguiente2.setIcon(siguiente2);


                botonAnterior2 = new JButton();
                botonAnterior2.setBounds(15,70,50,50);
                reproductorExtemoduro.add(botonAnterior2);
                botonAnterior2.setBackground(Color.pink);
                botonAnterior2.setIcon(anterior2);


                cerrarReproductorExtremoduro =new JButton("Fin \nreproducción");
                cerrarReproductorExtremoduro.setBounds(230,245,140,50);
                panelReproductorGeneral.add(cerrarReproductorExtremoduro);
                cerrarReproductorExtremoduro.setBackground(Color.pink);
                cerrarReproductorExtremoduro.setLayout(null);

                cerrarReproductorExtremoduro.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelReproductorGeneral.remove(reproductorExtemoduro);
                        panelReproductorGeneral.remove(cerrarReproductorExtremoduro);
                        panelReproductorGeneral.revalidate();
                        panelReproductorGeneral.repaint();
                    }
                });


                botonplay2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // estado actual del clip
                        AudioInputStream audioInputStream;
                        String filePath= "src/sounds/La vereda de la puerta de atrás.wav";
                        // create AudioInputStream object
                        try {
                            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
                            // create clip reference
                            clipExtremoDuro = AudioSystem.getClip();
                            // open audioInputStream to the clip
                            clipExtremoDuro.open(audioInputStream);

                            clipExtremoDuro.start();
                            status=1;
                            UltimaCancion=2;
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
                botonpause2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clipExtremoDuro.stop();
                            status=0;
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });

                //activar la repetición en bucle de la cancion
                botonrepetir2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clipExtremoDuro.loop(Clip.LOOP_CONTINUOUSLY);
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });
                botonSiguiente2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (UltimaCancion==1){
                            clipRobZombie.stop();
                            cerrarReproductorRobZombie.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            cerrarReproductorExtremoduro.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarReproductorEminem.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarReproductorGhostmane.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        }else if (UltimaCancion==0) {
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                    }
                    }
                });
                botonAnterior2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (UltimaCancion==1){
                            clipRobZombie.stop();
                            cerrarReproductorRobZombie.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            cerrarReproductorExtremoduro.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarReproductorEminem.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarReproductorGhostmane.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==0) {
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
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
                reproductorEminem =new JPanel();
                reproductorEminem.setBounds(230,15,140,200);
                panelReproductorGeneral.add(reproductorEminem);
                reproductorEminem.setBackground(Color.pink);
                reproductorEminem.setLayout(null);

                botonplay3 = new JButton();
                botonplay3.setBounds(15,20,50,50);
                reproductorEminem.add(botonplay3);
                botonplay3.setBackground(Color.pink);
                botonplay3.setIcon(play3);

                botonpause3 = new JButton();
                botonpause3.setBounds(15,120,50,50);
                reproductorEminem.add(botonpause3);
                botonpause3.setBackground(Color.pink);
                botonpause3.setIcon(pause3);

                botonrepetir3 = new JButton();
                botonrepetir3.setBounds(75,20,50,50);
                reproductorEminem.add(botonrepetir3);
                botonrepetir3.setBackground(Color.pink);
                botonrepetir3.setIcon(repetir3);

                añadirAlista3 = new JButton();
                añadirAlista3.setBounds(75,120,50,50);
                reproductorEminem.add(añadirAlista3);
                añadirAlista3.setBackground(Color.pink);
                añadirAlista3.setIcon(añadirLista3);

                botonSiguiente3 = new JButton();
                botonSiguiente3.setBounds(75,70,50,50);
                reproductorEminem.add(botonSiguiente3);
                botonSiguiente3.setBackground(Color.pink);
                botonSiguiente3.setIcon(siguiente3);


                botonAnterior3 = new JButton();
                botonAnterior3.setBounds(15,70,50,50);
                reproductorEminem.add(botonAnterior3);
                botonAnterior3.setBackground(Color.pink);
                botonAnterior3.setIcon(anterior3);


                cerrarReproductorEminem =new JButton("Fin \nreproducción");
                cerrarReproductorEminem.setBounds(230,245,140,50);
                panelReproductorGeneral.add(cerrarReproductorEminem);
                cerrarReproductorEminem.setBackground(Color.pink);
                cerrarReproductorEminem.setLayout(null);

                cerrarReproductorEminem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelReproductorGeneral.remove(reproductorEminem);
                        panelReproductorGeneral.remove(cerrarReproductorEminem);
                        panelReproductorGeneral.revalidate();
                        panelReproductorGeneral.repaint();
                    }
                });

                botonplay3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // estado actual del clip
                        AudioInputStream audioInputStream;
                        String filePath= "src/sounds/Without Me.wav";
                        // create AudioInputStream object
                        try {
                            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
                            // create clip reference
                            clipEminem = AudioSystem.getClip();

                            // open audioInputStream to the clip
                            clipEminem.open(audioInputStream);
                            clipEminem.start();
                            status=1;
                            UltimaCancion=3;
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
                botonpause3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clipEminem.stop();
                            status=0;
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });

                //activar la repetición en bucle de la cancion
                botonrepetir3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clipEminem.loop(Clip.LOOP_CONTINUOUSLY);
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });
                botonSiguiente3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (UltimaCancion==1){
                            clipRobZombie.stop();
                            cerrarReproductorRobZombie.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            cerrarReproductorExtremoduro.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarReproductorEminem.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarReproductorGhostmane.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        }else if (UltimaCancion==0) {
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        }
                    }
                });
                botonAnterior3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (UltimaCancion==1){
                            clipRobZombie.stop();
                            cerrarReproductorRobZombie.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            cerrarReproductorExtremoduro.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarReproductorEminem.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarReproductorGhostmane.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==0) {
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
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

                reproductorGhostmane =new JPanel();
                reproductorGhostmane.setBounds(230,15,140,200);
                panelReproductorGeneral.add(reproductorGhostmane);
                reproductorGhostmane.setBackground(Color.pink);
                reproductorGhostmane.setLayout(null);

                botonplay4 = new JButton();
                botonplay4.setBounds(15,20,50,50);
                reproductorGhostmane.add(botonplay4);
                botonplay4.setBackground(Color.pink);
                botonplay4.setIcon(play4);

                botonpause4 = new JButton();
                botonpause4.setBounds(15,120,50,50);
                reproductorGhostmane.add(botonpause4);
                botonpause4.setBackground(Color.pink);
                botonpause4.setIcon(pause4);

                botonrepetir4 = new JButton();
                botonrepetir4.setBounds(75,20,50,50);
                reproductorGhostmane.add(botonrepetir4);
                botonrepetir4.setBackground(Color.pink);
                botonrepetir4.setIcon(repetir4);

                añadirAlista4 = new JButton();
                añadirAlista4.setBounds(75,120,50,50);
                reproductorGhostmane.add(añadirAlista4);
                añadirAlista4.setBackground(Color.pink);
                añadirAlista4.setIcon(añadirLista4);

                botonSiguiente4 = new JButton();
                botonSiguiente4.setBounds(75,70,50,50);
                reproductorGhostmane.add(botonSiguiente4);
                botonSiguiente4.setBackground(Color.pink);
                botonSiguiente4.setIcon(siguiente4);


                botonAnterior4 = new JButton();
                botonAnterior4.setBounds(15,70,50,50);
                reproductorGhostmane.add(botonAnterior4);
                botonAnterior4.setBackground(Color.pink);
                botonAnterior4.setIcon(anterior4);


                cerrarReproductorGhostmane =new JButton("Fin \nreproducción");
                cerrarReproductorGhostmane.setBounds(230,245,140,50);
                panelReproductorGeneral.add(cerrarReproductorGhostmane);
                cerrarReproductorGhostmane.setBackground(Color.pink);
                cerrarReproductorGhostmane.setLayout(null);

                cerrarReproductorGhostmane.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelReproductorGeneral.remove(reproductorGhostmane);
                        panelReproductorGeneral.remove(cerrarReproductorGhostmane);
                        panelReproductorGeneral.revalidate();
                        panelReproductorGeneral.repaint();
                    }
                });

                botonplay4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // estado actual del clip
                        AudioInputStream audioInputStream;
                        String filePath= "src/sounds/GHOSTEMANE - Andromeda [Official Video].wav";
                        // create AudioInputStream object
                        try {
                            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
                            // create clip reference
                            clipGhostmane = AudioSystem.getClip();

                            // open audioInputStream to the clip
                            clipGhostmane.open(audioInputStream);

                            clipGhostmane.start();
                            status=1;
                            UltimaCancion=4;
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
                botonpause4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clipGhostmane.stop();
                            status=0;
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });
                //activar la repetición en bucle de la cancion
                botonrepetir4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (status==1){
                            clipGhostmane.loop(Clip.LOOP_CONTINUOUSLY);
                        }else{
                            System.out.println("cancion en reproducción");
                        }
                    }
                });
                botonSiguiente4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (UltimaCancion==1){
                            clipRobZombie.stop();
                            cerrarReproductorRobZombie.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            cerrarReproductorExtremoduro.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarReproductorEminem.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarReproductorGhostmane.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        }else if (UltimaCancion==0) {
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        }
                    }
                });
                botonAnterior4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (UltimaCancion==1){
                            clipRobZombie.stop();
                            cerrarReproductorRobZombie.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            cerrarReproductorExtremoduro.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarReproductorEminem.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarReproductorGhostmane.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==0) {
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        }
                    }
                });
            }
        });

    }

    public void botonReproduccionRandom()
    {

        reproduccionAleatoria = new JButton("Canción Aleatoria");
        reproduccionAleatoria.setBounds(230,300,140,50);
        panelReproductorGeneral.add(reproduccionAleatoria);
        reproduccionAleatoria.setBackground(Color.pink);
        reproduccionAleatoria.setLayout(null);

        reproduccionAleatoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Crear una instancia de Random
                Random random = new Random();

                // Generar un número aleatorio entre 1 y 4, ambos incluidos
                int numeroAleatorio = (int) (Math.random()*5);

                // Almacenar el resultado en una variable
                int CancionElejida = numeroAleatorio;

                //Selección de canción
                if(CancionElejida==1){
                    cancionRobZombie.doClick();
                    botonplay.doClick();
                } else if (CancionElejida==2) {
                    cancionExtremoduro.doClick();
                    botonplay2.doClick();
                } else if (CancionElejida==3) {
                    cancionEminem.doClick();
                    botonplay3.doClick();
                }else if (CancionElejida==4)
                    cancionGhostmane.doClick();
                    botonplay4.doClick();
            }
        });
      }

    public JPanel getPanelReproductorGeneral() {
        return panelReproductorGeneral;
    }

    public void setPanelReproductorGeneral(JPanel panelReproductorGeneral) {
        this.panelReproductorGeneral = panelReproductorGeneral;
    }
}

