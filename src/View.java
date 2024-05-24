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

public class View extends JFrame{

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

//botones de reproducción de rob zombie e iconos
    ImageIcon play = new ImageIcon("src/iconos/play.png");
    JButton botonplay;
    ImageIcon pause = new ImageIcon("src/iconos/pause.png");
    JButton botonpause;
    ImageIcon repetir = new ImageIcon("src/iconos/repetir.png");
    JButton botonrepetir;
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


    Clip clipRobZombie;
    Clip clipExtremoDuro;
    Clip clipEminem;
    Clip clipGhostmane;

    private Clip audioClip;

    Listas can = new Listas();
    infoArtistas infart = new infoArtistas();
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
            public void actionPerformed(ActionEvent e) {menuDeRobZombie =new JPanel();
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

                botonSiguiente = new JButton();
                botonSiguiente.setBounds(75,70,50,50);
                menuDeRobZombie.add(botonSiguiente);
                botonSiguiente.setBackground(Color.pink);
                botonSiguiente.setIcon(siguiente);

                botonAnterior = new JButton();
                botonAnterior.setBounds(15,70,50,50);
                menuDeRobZombie.add(botonAnterior);
                botonAnterior.setBackground(Color.pink);
                botonAnterior.setIcon(anterior);


                cerrarPanelZombie.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelReproductorGeneral.remove(menuDeRobZombie);
                        panelReproductorGeneral.remove(cerrarPanelZombie);
                        panelReproductorGeneral.revalidate();
                        panelReproductorGeneral.repaint();
                        clipExtremoDuro.stop();
                        clipRobZombie.stop();
                        clipGhostmane.stop();
                        clipEminem.stop();
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
                            cerrarPanelZombie.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            botonCerrarExtremoduro.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarCancionEminem.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarCancionGhostmane.doClick();
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
                            cerrarPanelZombie.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            botonCerrarExtremoduro.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarCancionEminem.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarCancionGhostmane.doClick();
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
                        clipExtremoDuro.stop();
                        clipRobZombie.stop();
                        clipGhostmane.stop();
                        clipEminem.stop();
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
                            cerrarPanelZombie.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            botonCerrarExtremoduro.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarCancionEminem.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarCancionGhostmane.doClick();
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
                            cerrarPanelZombie.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            botonCerrarExtremoduro.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarCancionEminem.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarCancionGhostmane.doClick();
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
                reproductorCancionEminem =new JPanel();
                reproductorCancionEminem.setBounds(230,15,140,200);
                panelReproductorGeneral.add(reproductorCancionEminem);
                reproductorCancionEminem.setBackground(Color.pink);
                reproductorCancionEminem.setLayout(null);

                botonplay3 = new JButton();
                botonplay3.setBounds(15,20,50,50);
                reproductorCancionEminem.add(botonplay3);
                botonplay3.setBackground(Color.pink);
                botonplay3.setIcon(play3);

                botonpause3 = new JButton();
                botonpause3.setBounds(15,120,50,50);
                reproductorCancionEminem.add(botonpause3);
                botonpause3.setBackground(Color.pink);
                botonpause3.setIcon(pause3);

                botonrepetir3 = new JButton();
                botonrepetir3.setBounds(75,20,50,50);
                reproductorCancionEminem.add(botonrepetir3);
                botonrepetir3.setBackground(Color.pink);
                botonrepetir3.setIcon(repetir3);

                añadirAlista3 = new JButton();
                añadirAlista3.setBounds(75,120,50,50);
                reproductorCancionEminem.add(añadirAlista3);
                añadirAlista3.setBackground(Color.pink);
                añadirAlista3.setIcon(añadirLista3);

                botonSiguiente3 = new JButton();
                botonSiguiente3.setBounds(75,70,50,50);
                reproductorCancionEminem.add(botonSiguiente3);
                botonSiguiente3.setBackground(Color.pink);
                botonSiguiente3.setIcon(siguiente3);


                botonAnterior3 = new JButton();
                botonAnterior3.setBounds(15,70,50,50);
                reproductorCancionEminem.add(botonAnterior3);
                botonAnterior3.setBackground(Color.pink);
                botonAnterior3.setIcon(anterior3);


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
                        clipExtremoDuro.stop();
                        clipRobZombie.stop();
                        clipGhostmane.stop();
                        clipEminem.stop();
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
                            cerrarPanelZombie.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            botonCerrarExtremoduro.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarCancionEminem.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarCancionGhostmane.doClick();
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
                            cerrarPanelZombie.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            botonCerrarExtremoduro.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarCancionEminem.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarCancionGhostmane.doClick();
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

                reproductorCancionGhostmane =new JPanel();
                reproductorCancionGhostmane.setBounds(230,15,140,200);
                panelReproductorGeneral.add(reproductorCancionGhostmane);
                reproductorCancionGhostmane.setBackground(Color.pink);
                reproductorCancionGhostmane.setLayout(null);

                botonplay4 = new JButton();
                botonplay4.setBounds(15,20,50,50);
                reproductorCancionGhostmane.add(botonplay4);
                botonplay4.setBackground(Color.pink);
                botonplay4.setIcon(play4);

                botonpause4 = new JButton();
                botonpause4.setBounds(15,120,50,50);
                reproductorCancionGhostmane.add(botonpause4);
                botonpause4.setBackground(Color.pink);
                botonpause4.setIcon(pause4);

                botonrepetir4 = new JButton();
                botonrepetir4.setBounds(75,20,50,50);
                reproductorCancionGhostmane.add(botonrepetir4);
                botonrepetir4.setBackground(Color.pink);
                botonrepetir4.setIcon(repetir4);

                añadirAlista4 = new JButton();
                añadirAlista4.setBounds(75,120,50,50);
                reproductorCancionGhostmane.add(añadirAlista4);
                añadirAlista4.setBackground(Color.pink);
                añadirAlista4.setIcon(añadirLista4);

                botonSiguiente4 = new JButton();
                botonSiguiente4.setBounds(75,70,50,50);
                reproductorCancionGhostmane.add(botonSiguiente4);
                botonSiguiente4.setBackground(Color.pink);
                botonSiguiente4.setIcon(siguiente4);


                botonAnterior4 = new JButton();
                botonAnterior4.setBounds(15,70,50,50);
                reproductorCancionGhostmane.add(botonAnterior4);
                botonAnterior4.setBackground(Color.pink);
                botonAnterior4.setIcon(anterior4);


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
                        clipExtremoDuro.stop();
                        clipRobZombie.stop();
                        clipGhostmane.stop();
                        clipEminem.stop();
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
                            cerrarPanelZombie.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            botonCerrarExtremoduro.doClick();
                            cancionEminem.doClick();
                            botonplay3.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarCancionEminem.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarCancionGhostmane.doClick();
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
                            cerrarPanelZombie.doClick();
                            cancionGhostmane.doClick();
                            botonplay4.doClick();
                        } else if (UltimaCancion==2) {
                            clipExtremoDuro.stop();
                            botonCerrarExtremoduro.doClick();
                            cancionRobZombie.doClick();
                            botonplay.doClick();
                        } else if (UltimaCancion==3) {
                            clipEminem.stop();
                            cerrarCancionEminem.doClick();
                            cancionExtremoduro.doClick();
                            botonplay2.doClick();
                        } else if (UltimaCancion==4) {
                            clipGhostmane.stop();
                            cerrarCancionGhostmane.doClick();
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

}
