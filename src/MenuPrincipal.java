import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    artistas art = new artistas();
    canciones can = new canciones();
    public MenuPrincipal(){
//Configuramos el titulo del Layout y el cierre del mismo
        setTitle("Bienvenido al Instagrám de DAM1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
//Configuramos JPanel y establecemos FlowLayout como su gestor de layout
        JPanel panel = new JPanel(new FlowLayout());
//Botones
        JButton GenerarListaDeArtista = new JButton("Generar una lista de canciones de un artista");
        JButton ListaDeCancionesAleatorias = new JButton("Lista de canciones aleatorias");
// Añadir los botones al panel
        panel.add(GenerarListaDeArtista);
        panel.add(ListaDeCancionesAleatorias);
// Añadir el panel al JFrame
        add(panel);
//Configuramos las acciónes de los botones
        GenerarListaDeArtista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                art.generarLista();
            }
        });
        ListaDeCancionesAleatorias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                can.darDatosCanciones();
            }
        });
// Ajustar el tamaño del JFrame y hacerlo visible
        setSize(441, 147);
        setVisible(true);
    }

}
