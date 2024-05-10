import javax.swing.*;
import java.awt.*;

public class infoArtistas extends JFrame{

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
    public JTextField artistaAbuscar;

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
    }

    public void panelParaBuscador(){

        panelDeBusqueda=new JPanel();
        panelDeBusqueda.setBounds(0,0,800,600);

        this.getContentPane().add(panelDeBusqueda);
        panelDeBusqueda.setVisible(true);

        panelDeBusqueda.setBackground(Color.black);
        panelDeBusqueda.setLayout(null);

        add(panelDeBusqueda);

    }

    public void buscador(){

        buscador=new JTextField();
        buscador.setBounds(260,0,300,50);

        this.getContentPane().add(buscador);
        buscador.setVisible(true);

        buscador.setBackground(Color.pink);
        buscador.setLayout(null);

        panelDeBusqueda.add(buscador);

        artistaAbuscar=buscador;

    }

    public void mostrarResultado(){





        mostrarInfo=new JLabel();
        mostrarInfo.setBounds(260,0,300,50);

        this.getContentPane().add(mostrarInfo);
        mostrarInfo.setVisible(true);

        mostrarInfo.setBackground(Color.pink);
        mostrarInfo.setLayout(null);

        panelDeBusqueda.add(mostrarInfo);
    }

}
