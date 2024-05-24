import javax.swing.*;
import java.awt.*;

public class IniciarSesion extends JFrame {

    public JPanel iniciarsesion;
    public JTextField insertarDatos;
    public JLabel mostrarDatosUsuario;

    public void InicioDeSesion(){

        iniciarsesion=new JPanel();
        iniciarsesion.setBounds(0,0,300,600);
        iniciarsesion.setVisible(true);
        iniciarsesion.setBackground(Color.black);
        iniciarsesion.setLayout(null);
        add(iniciarsesion);

    }

    public void EscribirDatos(){
        insertarDatos=new JTextField();
        insertarDatos.setBounds(0,0,300,50);
        insertarDatos.setVisible(true);
        insertarDatos.setBackground(Color.pink);
        insertarDatos.setLayout(null);
        iniciarsesion.add(insertarDatos);
    }

    public void MostrarDatosUsuario(){

        mostrarDatosUsuario=new JLabel();
        mostrarDatosUsuario.setBounds(0,260,300,300);
        mostrarDatosUsuario.setOpaque(true);
        mostrarDatosUsuario.setBackground(Color.pink);
        mostrarDatosUsuario.setLayout(null);
        iniciarsesion.add(mostrarDatosUsuario);

    }
}

