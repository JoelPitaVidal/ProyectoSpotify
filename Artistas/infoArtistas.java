import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class infoArtistas extends JFrame {

    artistas art = new artistas();

    final String ARTISTA1 = "Ghostmane";
    final String ARTISTA2 = "Nigth Lovel";
    final String ARTISTA3 = "Snoop Dog";
    final String ARTISTA4 = "Blackpink";
    final String ARTISTA5 = "Cartel de Santa";
    final String ARTISTA6 = "Extremo duro";
    final String ARTISTA7 = "CORPSE";
    final String ARTISTA8 = "Disturbed";
    final String ARTISTA9 = "Eminem";
    final String ARTISTA10 = "Rob Zombie";

    final String INFOARTISTA1 = "La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";


    final String INFOARTISTA2 = "La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";

    final String INFOARTISTA3 = "La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";

    final String INFOARTISTA4 = "La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";

    final String INFOARTISTA5 ="La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";

    final String INFOARTISTA6 = "La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";

    final String INFOARTISTA7 = "La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";

    final String INFOARTISTA8 = "La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";

    final String INFOARTISTA9 ="La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";

    final String INFOARTISTA10 = "La información de Rob Zombie es : " +
            "\nNombre real: Eric Ghoste Whitne" +
            "\nFecha de nacimiento: 15 de abril de 1991" +
            "\nOrigen: Lake Worth, Florida, Estados Unidos" +
            "\nGéneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
            "\nSitio Web: ghostemanemerch.online";


    public JPanel panelDeBusqueda;
    public JTextField buscador;
    public JTextArea mostrarInfo;


    public infoArtistas(){
    }

    public void menuDeBusqueda(){
        setTitle("Damtify");
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