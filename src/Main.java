public class Main {
    public static void main(String[] args) {

    //Para que la recomendación aleatoria funcione,debe ejecutarse antes el metodo que da los valores a la lista.
        artistas art = new artistas();
        art.darDatosArtistas();
        art.generarLista();

    }
}