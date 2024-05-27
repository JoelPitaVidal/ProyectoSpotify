package Canciones;

import java.util.Random;
import java.util.ArrayList;

public class RandomSongs {

    Random rand = new Random();
    ArrayList<String> canciones = new ArrayList<>();

    public RandomSongs() {
        darNombreCanciones();
    }

    public void darNombreCanciones() {
        canciones.add("\nMiss you!");
        canciones.add("\nLive sucks so we fuck");
        canciones.add("\nSmoke weed everyday");
        canciones.add("\nShutdown");
        canciones.add("\nHotDemonBitchesNearYou");
        canciones.add("\nEl perro verde");
        canciones.add("\nLa puerta de atras");
        canciones.add("\nLa primera");
        canciones.add("\nPreaty Savage");
        canciones.add("\nPlease dont go");
        canciones.add("\nLa camisa negra");
        canciones.add("\nBohemian Rhapsody");
        canciones.add("\nErupt");
        canciones.add("\nBeliever");
        canciones.add("\nGood morning Vietnam");
    }

    public String getAsociarCancion() {
        int indiceAleatorio = rand.nextInt(canciones.size());
        return canciones.get(indiceAleatorio);
    }

    public String getAsociarCancion1() {
        return getAsociarCancion();
    }

    public String getAsociarCancion2() {
        return getAsociarCancion();
    }

    public String getAsociarCancion3() {
        return getAsociarCancion();
    }

    public String getAsociarCancion4() {
        return getAsociarCancion();
    }

    public String getAsociarCancion5() {
        return getAsociarCancion();
    }

    public String getAsociarCancion6() {
        return getAsociarCancion();
    }

    public String getAsociarCancion7() {
        return getAsociarCancion();
    }

    public String getAsociarCancion8() {
        return getAsociarCancion();
    }

    public String getAsociarCancion9() {
        return getAsociarCancion();
    }

    public String getAsociarCancion10() {
        return getAsociarCancion();
    }

    public String getAsociarCancion11() {
        return getAsociarCancion();
    }

    public String getAsociarCancion12() {
        return getAsociarCancion();
    }

    public String getAsociarCancion13() {
        return getAsociarCancion();
    }

    public String getAsociarCancion14() {
        return getAsociarCancion();
    }

    public String getAsociarCancion15() {
        return getAsociarCancion();
    }

public void ejecutarMetodos(){
        darNombreCanciones();
        getAsociarCancion1();
        getAsociarCancion2();
        getAsociarCancion3();
        getAsociarCancion4();
        getAsociarCancion5();
        getAsociarCancion6();
        getAsociarCancion7();
        getAsociarCancion8();
        getAsociarCancion9();
        getAsociarCancion10();
        getAsociarCancion11();
        getAsociarCancion12();
        getAsociarCancion13();
        getAsociarCancion14();
        getAsociarCancion15();
    }

}
