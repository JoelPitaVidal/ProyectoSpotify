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

    Random rand = new Random();


    public HashMap<String, String> darDatosCanciones(){
            // Se obtienen los datos de los artistas
            arCan.darDatosArtistas();

            //Se obtienen los nombres de las canciones
            // Se obtiene un artista aleatorio del primer conjunto de datos de artistas
            String artistaAleatorio = arCan.asociarAartista();
            String artistaAleatorio2 = arCan.getAsociarArtistas2();
            String artistaAleatorio3 = arCan.getAsociarArtistas3();

            String cancion1 = CanAl.getAsociarCancion1();
            String cancion2 = CanAl.getAsociarCancion2();
            String cancion3 = CanAl.getAsociarCancion3();
            String cancion4 = CanAl.getAsociarCancion4();
            String cancion5 = CanAl.getAsociarCancion5();
            String cancion6 = CanAl.getAsociarCancion6();
            String cancion7 = CanAl.getAsociarCancion7();
            String cancion8 = CanAl.getAsociarCancion8();
            String cancion9 = CanAl.getAsociarCancion9();
            String cancion10 = CanAl.getAsociarCancion10();
            String cancion11 = CanAl.getAsociarCancion11();
            String cancion12 = CanAl.getAsociarCancion12();
            String cancion13 = CanAl.getAsociarCancion13();
            String cancion14 = CanAl.getAsociarCancion14();
            String cancion15 = CanAl.getAsociarCancion15();

            // Se recorren las claves (nombres de las canciones) del HashMap de datos de artistas
            for (String cancion : arCan.datosArtistas1.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones.put(cancion1, artistaAleatorio);
                datosCanciones.put(cancion2, artistaAleatorio);
                datosCanciones.put(cancion3, artistaAleatorio);
                datosCanciones.put(cancion4, artistaAleatorio);
                datosCanciones.put(cancion5, artistaAleatorio);
            }


            for (String cancion : arCan.datosArtistas2.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones2.put(cancion6, artistaAleatorio2);
                datosCanciones2.put(cancion7, artistaAleatorio2);
                datosCanciones2.put(cancion8, artistaAleatorio2);
                datosCanciones2.put(cancion9, artistaAleatorio2);
                datosCanciones2.put(cancion10, artistaAleatorio2);
            }


            for (String cancion : arCan.datosArtistas3.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones3.put(cancion11, artistaAleatorio3);
                datosCanciones3.put(cancion12, artistaAleatorio3);
                datosCanciones3.put(cancion13, artistaAleatorio3);
                datosCanciones3.put(cancion14, artistaAleatorio3);
                datosCanciones3.put(cancion15, artistaAleatorio3);
            }
            return datosCanciones;
        }



    public String getDatosCanciones() {
        darDatosCanciones();
        String devolverLista="";
        devolverLista = "Lista aleatoria :" + datosCanciones
        +"\n"
        +"\nLista aleatoria 2: "+datosCanciones2
        +"\n"
        +"\nLista aleatoria 3 : "+datosCanciones3;
        return devolverLista;
    }
}
