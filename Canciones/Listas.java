import java.util.HashMap;
import java.util.Random;

public class Listas extends artistas{


    //La clave del HashMap es el nombre de la canción, el elemento asociado el nombre del Artista
        HashMap<String, String> datosCanciones = new HashMap<String, String>();
        HashMap<String, String> datosCanciones2 = new HashMap<String, String>();
        HashMap<String, String> datosCanciones3 = new HashMap<String, String>();
        HashMap<String, String> guardarArtistas;
        artistas arCan = new artistas();
        CancionesAleatorias CanAl = new CancionesAleatorias();


    public HashMap<String, String> darDatosCanciones(){
            // Se obtienen los datos de los artistas
            arCan.darDatosArtistas();

            //Se obtienen los nombres de las canciones
            // Se obtiene un artista aleatorio del primer conjunto de datos de artistas
            String artistaAleatorio = arCan.asociarAartista();
            String artistaAleatorio2 = arCan.getAsociarArtistas2();
            String artistaAleatorio3 = arCan.getAsociarArtistas3();

            CanAl.ejecutarMetodos();

                // Se recorren las claves (nombres de las canciones) del HashMap de datos de artistas
                CanAl.darNombreCanciones();
                CanAl.getAsociarCancion1();
                CanAl.getAsociarCancion2();
                CanAl.getAsociarCancion3();
                CanAl.getAsociarCancion4();
                CanAl.getAsociarCancion5();
                CanAl.getAsociarCancion6();
                CanAl.getAsociarCancion7();
                CanAl.getAsociarCancion8();
                CanAl.getAsociarCancion9();
                CanAl.getAsociarCancion10();
                CanAl.getAsociarCancion11();
                CanAl.getAsociarCancion12();
                CanAl.getAsociarCancion13();
                CanAl.getAsociarCancion14();
                CanAl.getAsociarCancion15();

                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones.put(CanAl.getAsociarCancion1(), artistaAleatorio);
                datosCanciones.put(CanAl.getAsociarCancion2(), artistaAleatorio);
                datosCanciones.put(CanAl.getAsociarCancion3(), artistaAleatorio);
                datosCanciones.put(CanAl.getAsociarCancion4(), artistaAleatorio);
                datosCanciones.put(CanAl.getAsociarCancion5(), artistaAleatorio);

                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones2.put(CanAl.getAsociarCancion6(), artistaAleatorio2);
                datosCanciones2.put(CanAl.getAsociarCancion7(), artistaAleatorio2);
                datosCanciones2.put(CanAl.getAsociarCancion8(), artistaAleatorio2);
                datosCanciones2.put(CanAl.getAsociarCancion9(), artistaAleatorio2);
                datosCanciones2.put(CanAl.getAsociarCancion10(), artistaAleatorio2);

                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones3.put(CanAl.getAsociarCancion11(), artistaAleatorio3);
                datosCanciones3.put(CanAl.getAsociarCancion12(), artistaAleatorio3);
                datosCanciones3.put(CanAl.getAsociarCancion13(), artistaAleatorio3);
                datosCanciones3.put(CanAl.getAsociarCancion14(), artistaAleatorio3);
                datosCanciones3.put(CanAl.getAsociarCancion15(), artistaAleatorio3);

            return datosCanciones;
        }

    public String getDatosCanciones() {
        darDatosCanciones();
        String devolverLista="";
        devolverLista =
        "Lista aleatoria :\n "
        + datosCanciones
        + "\n"
        + "\nLista aleatoria 2:\n "
        + datosCanciones2
        + "\n"
        + "\nLista aleatoria 3 :\n "
        + datosCanciones3
        + "\n";
        return devolverLista;
    }
}
