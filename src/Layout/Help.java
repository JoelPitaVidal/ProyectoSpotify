package Layout;

import javax.swing.*;
import java.awt.*;

public class Help extends JFrame{
    public JPanel panelDeAyuda;
    public JTextArea pestañaDeAyuda;
    //información a mostrar en el canal de ayuda
    final  String INFORMACIONCLAVE=" \n   Panel de Ayuda:     " +
                                   "\nEn el siguiente panel se explican los" +
                                   "\nbasicos del funcionamiento del prográma" +
                                   "\nen la parte superior derecha hay cuatro" +
                                   "\nbotones con cuatro artistas,cada uno   " +
                                   "\nhace aparecer un menú con un reproductor" +
                                   "\nen el centro de la pantalla, este consta de" +
                                   "\nbotones de play y pausa,  botones de anterior" +
                                   "\ny siguietne canción, otro para reproducir " +
                                   "\nen bucle la cancion actual y uno para añadir esa" +
                                   "\ncancion a tu lista de canciones, tambien consta de" +
                                   "\nun boton de cerrar, que cierra el reproductor pero " +
                                   "\nno la cancion,asique si quieres parar la cancion " +
                                   "\ny luego cerrar el menu,debes darle al boton de" +
                                   "\npausa antes. El boton de buscar canciones" +
                                   "\nabre una pestaña con un buscador en " +
                                   "\nla parte superior en el que escribir el" +
                                   "\nnombre del artista y una pestaña debajo" +
                                   "\nque muestra la información, el boton de " +
                                   "\ncancion aleatoria lo que hace es abrir uno" +
                                   "\nde los reproductores aleatoriamente y darle" +
                                   "\nal play para que inicie, no se recomienda" +
                                   "\ndarle una segunda vez sin darle al pause" +
                                   "\n el botón de inicio de sesion abre un panel" +
                                   "\ncon un JTextField en el que ingresar sus datos" +
                                   "\ny un JTextArea en el que se muestran estos." +
                                   "\npor último el panel de la izquierda muestra" +
                                   "\ntres listas aleatoriamente escogidas con " +
                                   "\ndiferentes canciones y artistas.";
//configurar panel de ayuda
    public void respuestaBotonAyuda(){

        setTitle("Damtify Layout.Help");
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(300,600);
        PanelDeAyuda();
        PestañaInformacion();
    }
    public void PanelDeAyuda(){
        panelDeAyuda=new JPanel();
        panelDeAyuda.setBounds(0,0,300,600);
        panelDeAyuda.setVisible(true);
        panelDeAyuda.setBackground(Color.black);
        panelDeAyuda.setLayout(null);
        add(panelDeAyuda);
    }
    //configurar el panel en el que se muestra la información
    public void PestañaInformacion(){

        pestañaDeAyuda=new JTextArea(INFORMACIONCLAVE);
        pestañaDeAyuda.setBounds(0,0,300,600);
        pestañaDeAyuda.setOpaque(true);
        pestañaDeAyuda.setEditable(false);
        pestañaDeAyuda.setBackground(Color.pink);
        pestañaDeAyuda.setLayout(null);
        panelDeAyuda.add(pestañaDeAyuda);
    }
}
