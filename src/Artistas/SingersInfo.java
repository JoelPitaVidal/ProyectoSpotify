package Artistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SingersInfo extends JFrame {



    final String ARTISTA1 = "Ghostmane";
    final String ARTISTA2 = "Nigth Lovel";
    final String ARTISTA3 = "Snoop Dog";
    final String ARTISTA4 = "Blackpink";
    final String ARTISTA5 = "Cartel de Santa";
    final String ARTISTA6 = "Extremoduro";
    final String ARTISTA7 = "Corpse Husband";
    final String ARTISTA8 = "Disturbed";
    final String ARTISTA9 = "Eminem";
    final String ARTISTA10 = "Rob Zombie";


    public final String INFOARTISTA1 = "La información de Ghostmane es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida,E.U" +
            "\nGéneros musicales: Dark trap, noise, " +
            "\nhip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";


    public final String INFOARTISTA2 = "La información de Nigth Lovel es : " +
            "\nNombre real: Shermar Cuba Paul" +
            "\nFecha de nacimiento: 29 de Mayo de 1997" +
            "\nOrigen: Ottawa , provincia de Ontario, Canada" +
            "\nGéneros musicales:" +
            "\nHip hoptrapcloud rapgrimePhonk";

    public final String INFOARTISTA3 = "La información de Snoop Dog es : " +
            "\nNombre real: \tCalvin Cordozar Broadus Jr." +
            "\nFecha de nacimiento: 20 de Octubre de 1971" +
            "\nOrigen: Long Beach, Californiaa,E.U" +
            "\nGéneros musicales:Hip hop, West " +
            "\nCoast hip hop, G-funk, gangsta rap, reggae, " +
            "\nR&B contemporáneo, Mafioso rap, " +
            "\nhip hop hardcore, horrorcore y funk" +
            "\nSitio Web: www.snoopdogg.com";

    public final String INFOARTISTA4 = "La información de Blackpink es : " +
            "\nIntegrantes del grupo: Rosé, Jisoo, Jennie y Lissa." +
            "\nOrigen: Corea del Sur, Seúl" +
            "\nEstado: Activo" +
            "\nFecha de inicio: 2016" +
            "\nGéneros musicales: K-popEDMhip hopdance-pop" +
            "\nSitio Web: \tblackpinkofficial.com";

    public final String INFOARTISTA5 ="La información de Cartel de Santa es : " +
            "\nIntegrantes del grupo: Rowán Rabia (Mono), Eduardo Dávalos de Luna (Babo)" +
            "\nOrigen: Santa Catarina, Nuevo León, México" +
            "\nEstado: Activo" +
            "\nFecha de inicio: 2016" +
            "\nGéneros musicales:Hip hop latino, Gangsta Rap, " +
            "\nRap Metal (inicios), Rap rock y Trap latino, Hip House" +
            "\nSitio Web: http://carteldesanta.com/";

    public final String INFOARTISTA6 = "La información de Extremoduro es : " +
            "\nIntegrantes del grupo: Roberto Iniesta" +
            "\nIñaki Antón «Uoho» , José Ignacio Cantera" +
            "\n, Miguel Colino" +
            "\nOrigen: Plasencia, Cáceres, España" +
            "\nEstado: Disuelto desde 2019" +
            "\nFecha de inicio: 1987" +
            "\nGéneros musicales:Hard rock1 Punk rock2 " +
            "\nRock progresivo3" +
            "\nSitio Web:extremoduro.com";

    public final String INFOARTISTA7 = "La información de Corpse Husband es : " +
            "\nNombre real: Desconocido" +
            "\nFecha de nacimiento: 8 de agosto de 1997" +
            "\nOrigen: San Diego,California, E.U" +
            "\nGéneros musicales: Hip-hop/Rap" +
            "\nSitio Web: https://www.youtube.com/@CorpseHusband";

    public final String INFOARTISTA8 = "La información de Disturbed es : " +
            "\nIntegrantes del grupo: David Draima , Dan Donegan ," +
            "\nJohn Moyer, Mike Wengren" +
            "\nOrigen: Chicago, Illinois, E.U" +
            "\nEstado: activo" +
            "\nFecha de inicio: 1994-2011, vuelta 2015-presente" +
            "\nGéneros musicales: tHeavy metal" +
            "\nMetal alternativo Metal Industrial Hard rock Nü metal" +
            "\nSitio Web:www.disturbed1.com";

    public final String INFOARTISTA9 ="La información de Eminem es : " +
            "\nNombre real: Marshall Bruce Mathers III" +
            "\nFecha de nacimiento: 17 de octubre de 1972" +
            "\nOrigen: St. Joseph ,Condado de Buchanan,E.U" +
            "\nGéneros musicales: Hip hop" +
            "\nSitio Web: eminem.com";

    public  final String INFOARTISTA10 = "La información de Rob Zombie es : " +
            "\nNombre real: Robert Bartleh Cummings" +
            "\nFecha de nacimiento: 12 de enero de 1965" +
            "\nOrigen: Haverhill, Massachusetts, E.U" +
            "\nGéneros musicales:Heavy metal, metal alternativo," +
            "\nmetal industrial,groove metal, hard rock, nu metal, " +
            "\nshock rock" +
            "\nSitio Web: robzombie.com";


    public JPanel panelDeBusqueda;
    public JTextField buscador;
    public JTextArea mostrarInfo;


    public SingersInfo(){
    }

    public void menuDeBusqueda(){
        setTitle(" Buscador de Damtify");
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(300,600);
        panelParaBuscador();
        buscador();
        mostrarInfo();
    }

    public void panelParaBuscador(){

        panelDeBusqueda=new JPanel();
        panelDeBusqueda.setBounds(0,0,300,600);
        panelDeBusqueda.setVisible(true);
        panelDeBusqueda.setBackground(Color.black);
        panelDeBusqueda.setLayout(null);
        add(panelDeBusqueda);

    }

    public void buscador(){

        buscador=new JTextField();
        buscador.setBounds(0,0,300,50);
        buscador.setVisible(true);
        buscador.setBackground(Color.pink);
        buscador.setLayout(null);
        panelDeBusqueda.add(buscador);

        buscador.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                // Verificar si la tecla presionada es Enter
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Comparar el contenido del JTextField con las variables ARTISTA1 hasta ARTISTA10
                    String textoBuscado = buscador.getText();
                    if (textoBuscado.equals(ARTISTA1)) {
                        mostrarInfo.setText(INFOARTISTA1);
                    } else if (textoBuscado.equals(ARTISTA2)) {
                        mostrarInfo.setText(INFOARTISTA2);
                    }  else if (textoBuscado.equals(ARTISTA3)) {
                        mostrarInfo.setText(INFOARTISTA3);
                    } else if (textoBuscado.equals(ARTISTA4)) {
                        mostrarInfo.setText(INFOARTISTA4);
                    } else if (textoBuscado.equals(ARTISTA5)) {
                        mostrarInfo.setText(INFOARTISTA5);
                    } else if (textoBuscado.equals(ARTISTA6)) {
                        mostrarInfo.setText(INFOARTISTA6);
                    } else if (textoBuscado.equals(ARTISTA7)) {
                        mostrarInfo.setText(INFOARTISTA7);
                    } else if (textoBuscado.equals(ARTISTA8)) {
                        mostrarInfo.setText(INFOARTISTA8);
                    } else if (textoBuscado.equals(ARTISTA9)) {
                        mostrarInfo.setText(INFOARTISTA9);
                    } else if (textoBuscado.equals(ARTISTA10)) {
                        mostrarInfo.setText(INFOARTISTA10);
                    }else mostrarInfo.setText("Artista desconocido");
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });


    }

public void mostrarInfo(){

    mostrarInfo=new JTextArea();
    mostrarInfo.setBounds(0,260,300,300);
    mostrarInfo.setOpaque(true);
    mostrarInfo.setEditable(false);
    mostrarInfo.setBackground(Color.pink);
    mostrarInfo.setLayout(null);
    panelDeBusqueda.add(mostrarInfo);
}



}