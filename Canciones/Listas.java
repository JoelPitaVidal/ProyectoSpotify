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
            for (String cancion : arCan.datosArtistas1.keySet()) {
                CanAl.darNombreCanciones();
                CanAl.getAsociarCancion1();
                CanAl.getAsociarCancion2();
                CanAl.getAsociarCancion3();
                CanAl.getAsociarCancion4();
                CanAl.getAsociarCancion5();
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones.put(CanAl.cancion1, artistaAleatorio);
                datosCanciones.put(CanAl.cancion2, artistaAleatorio);
                datosCanciones.put(CanAl.cancion3, artistaAleatorio);
                datosCanciones.put(CanAl.cancion4, artistaAleatorio);
                datosCanciones.put(CanAl.cancion5, artistaAleatorio);
            }


            for (String cancion : arCan.datosArtistas2.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones2.put("cancion", artistaAleatorio2);
                datosCanciones2.put("cancion", artistaAleatorio2);
                datosCanciones2.put("cancion", artistaAleatorio2);
                datosCanciones2.put("cancion", artistaAleatorio2);
                datosCanciones2.put("cancion", artistaAleatorio2);
            }


            for (String cancion : arCan.datosArtistas3.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones3.put("cancion", artistaAleatorio3);
                datosCanciones3.put("cancion", artistaAleatorio3);
                datosCanciones3.put("cancion", artistaAleatorio3);
                datosCanciones3.put("cancion", artistaAleatorio3);
                datosCanciones3.put("cancion", artistaAleatorio3);
            }
            return datosCanciones;
        }



    public String getDatosCanciones() {
        darDatosCanciones();
        String devolverLista="";
        devolverLista = "Lista aleatoria :\n " + datosCanciones
        +"\n"
        +"\nLista aleatoria 2:\n "+datosCanciones2
        +"\n"
        +"\nLista aleatoria 3 :\n "+datosCanciones3;
        return devolverLista;
    }
}
