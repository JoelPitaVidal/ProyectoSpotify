public class Main {

    public static void main(String[] args) {

    //Para que la recomendación aleatoria funcione,debe ejecutarse antes el metodo que da los valores a la lista.
        LayoutFinal lbhd = new LayoutFinal();

        lbhd.setVisible(true);

        DDBB.ConexiónBaseDeDatos();
        DDBB.Select();

    }

}