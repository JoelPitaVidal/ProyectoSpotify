package Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DataBase extends JFrame{

    public JPanel iniciarsesion;
    public JTextField insertarDatos;
    public JTextArea mostrarDatosUsuario;




    public static void ConexiónBaseDeDatos() {

        // Primero hacemos un "try-catch"
        try {

            Connection Conexión = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Prueba", "postgres", "123456789");

            System.out.println("Conexión correcta");

        }// Fin del try

        catch (java.sql.SQLException Excepción) {

            System.out.println("Conexión fallida");
        }

    } // Fin del método Conexión Base De Datos

    public static void Select() {



    }

    public void RespuestaBotonIncio(){

        setTitle("Damtify");
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(300,600);
        InicioDeSesion();
        EscribirDatos();
        MostrarDatosUsuario();

    }

    public void InicioDeSesion(){

        iniciarsesion=new JPanel();
        iniciarsesion.setBounds(0,0,300,600);
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

        insertarDatos.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                // Verificar si la tecla presionada es Enter
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {

                        Connection Conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Prueba", "postgres", "123456789");
                        PreparedStatement Query = Conexion.prepareStatement("SELECT * FROM public.\"Usuario\"");
                        ResultSet Resultado = Query.executeQuery();
                        if (Resultado.next()) {
                            String NombreBuscado = insertarDatos.getText();
                            String GetNombre = Resultado.getString(1);
                            String GetApellido = Resultado.getString(2);
                            String GetDni = Resultado.getString(3);
                            String GetCorreo = Resultado.getString(4);

                            //PreparedStatement Query = Conexion.prepareStatement("SELECT * FROM public.\"Usuario\" where ?" + (NombreBuscado));

                            if (NombreBuscado.equals(GetNombre)) {

                                mostrarDatosUsuario=new JTextArea();
                                mostrarDatosUsuario.setBounds(0,260,300,300);
                                mostrarDatosUsuario.setOpaque(true);
                                mostrarDatosUsuario.setBackground(Color.pink);
                                mostrarDatosUsuario.setEditable(false);
                                mostrarDatosUsuario.setLayout(null);
                                mostrarDatosUsuario.setVisible(true);
                                iniciarsesion.add(mostrarDatosUsuario);

                                mostrarDatosUsuario.append(GetNombre + "\n" + GetApellido + "\n" + GetDni + "\n" + GetCorreo);
                            }
                        }
                    }

                    catch (java.sql.SQLException Excepcion){

                        System.out.println(Excepcion);
                    }

                }
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });

        iniciarsesion.setVisible(true);
    }

    public void MostrarDatosUsuario(){





    }




} // Fin de la clase DDBB
