import java.sql.*;

public class DDBB{

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

    try {

        Connection Conexión = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Prueba", "postgres", "123456789");

        PreparedStatement Query = Conexión.prepareStatement("Select Columna1 from 'Prueba1'");
        String Resultado = String.valueOf(Query.getResultSet());
        System.out.println(Resultado);
    }

    catch (java.sql.SQLException Excepción){

        System.out.println("Conexión fallida");
    }

    }

} // Fin de la clase DDBB
