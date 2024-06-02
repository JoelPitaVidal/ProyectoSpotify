package Layout;

import Users.DataBase;

public class Main {

    public static void main(String[] args) {

    //Para que la recomendación aleatoria funcione,debe ejecutarse antes el metodo que da los valores a la lista.
        View layout = new View();

        layout.setVisible(true);

        DataBase.ConexionBaseDeDatos();
        DataBase.Select();

    }

}