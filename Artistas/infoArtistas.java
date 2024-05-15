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

    final String INFOARTISTA1 = "\"La información de Ghostmane es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online\"";


    final String INFOARTISTA2 = "\"La información de Nigth Lovel es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online";

    final String INFOARTISTA3 = "\"La información de Snoop Dog es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online\"";

    final String INFOARTISTA4 = "\"La información de Blackpink es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online\"";

    final String INFOARTISTA5 = "\"La información de Cartel de Santa es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online\"";

    final String INFOARTISTA6 = "\"La información de Extremo duro es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online\"";

    final String INFOARTISTA7 = "\"La información de CORPSE es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online\"";

    final String INFOARTISTA8 = "\"La información de Disturbed es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online\"";

    final String INFOARTISTA9 = "\"La información de Eminem es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online\"";

    final String INFOARTISTA10 = "\"La información de Rob Zombie es : \\n\" +\n" +
            "                        \"Nombre real: Eric Ghoste Whitney \\n\" +\n" +
            "                        \"Fecha de nacimiento: 15 de abril de 1991 \\n \" +\n" +
            "                        \"Origen: Lake Worth, Florida, Estados Unidos|\\n\" +\n" +
            "                        \"Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal\" +\n" +
            "                        \"Sitio Web: ghostemanemerch.online\"";



    public JPanel panelDeBusqueda;
    public JTextField buscador;
    public JLabel mostrarInfo;


    public infoArtistas(){
    }

    public void menuDeBusqueda(){
        setTitle("Damtify");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(800,600);
        panelParaBuscador();
        buscador();
        mostrarInfo();
    }

    public void panelParaBuscador(){

        panelDeBusqueda=new JPanel();
        panelDeBusqueda.setBounds(0,0,800,600);
        panelDeBusqueda.setVisible(true);
        panelDeBusqueda.setBackground(Color.black);
        panelDeBusqueda.setLayout(null);
        add(panelDeBusqueda);

    }

    public void buscador(){

        buscador=new JTextField();
        buscador.setBounds(260,0,300,50);
        buscador.setVisible(true);
        buscador.setBackground(Color.pink);
        buscador.setLayout(null);
        panelDeBusqueda.add(buscador);

        buscador.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
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
                    }
                }
            }
        });


    }

public void mostrarInfo(){

    mostrarInfo=new JLabel();
    mostrarInfo.setBounds(260,260,300,300);
    mostrarInfo.setOpaque(true);
    mostrarInfo.setBackground(Color.pink);
    mostrarInfo.setLayout(null);
    panelDeBusqueda.add(mostrarInfo);
}



}