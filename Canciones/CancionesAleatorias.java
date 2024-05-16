import java.util.Random;
import java.util.ArrayList;



public class CancionesAleatorias {
    String cancion1="";
    String cancion2="";
    String cancion3="";
    String cancion4="";
    String cancion5="";
    String cancion6="";
    String cancion7="";
    String cancion8="";
    String cancion9="";
    String cancion10="";
    String cancion11="";
    String cancion12="";
    String cancion13="";
    String cancion14="";
    String cancion15="";

    ArrayList <String> canciones = new ArrayList<>();

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

    public void darNombreCanciones(){
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
        canciones.add("\nBohemian Rapsody");
        canciones.add("\nErupt");
        canciones.add("\nBeliver");
        canciones.add("\nGood morning Vietnam");
    }

    Random rand = new Random();

    public String getAsociarCancion1(){
        int indiceAleatorio = rand.nextInt(canciones.size());
        String elementoAleatorio = canciones.get(indiceAleatorio);
        elementoAleatorio=cancion1;
        return cancion1;
    }
    public String getAsociarCancion2(){
        int indiceAleatorio2 = rand.nextInt(canciones.size());
        String elementoAleatorio2 = canciones.get(indiceAleatorio2);
        elementoAleatorio2=cancion2;
        return cancion2;
    }
    public String getAsociarCancion3(){
        int indiceAleatorio3 = rand.nextInt(canciones.size());
        String elementoAleatorio3 = canciones.get(indiceAleatorio3);
        elementoAleatorio3 =cancion3;
        return cancion3;
    }
    public String getAsociarCancion4(){
        int indiceAleatorio4 = rand.nextInt(canciones.size());
        String elementoAleatorio4 = canciones.get(indiceAleatorio4);
        elementoAleatorio4=cancion4;
        return cancion4;
    }
    public String getAsociarCancion5(){
        int indiceAleatorio5 = rand.nextInt(canciones.size());
        String elementoAleatorio5 = canciones.get(indiceAleatorio5);
        elementoAleatorio5=cancion5;
        return cancion5;
    }
    public String getAsociarCancion6(){
        int indiceAleatorio6 = rand.nextInt(canciones.size());
        String elementoAleatorio6 = canciones.get(indiceAleatorio6);
        elementoAleatorio6=cancion6;
        return cancion6;
    }
    public String getAsociarCancion7(){
        int indiceAleatorio7 = rand.nextInt(canciones.size());
        String elementoAleatorio7 = canciones.get(indiceAleatorio7);
        elementoAleatorio7=cancion7;
        return cancion7;
    }
    public String getAsociarCancion8(){
        int indiceAleatorio8 = rand.nextInt(canciones.size());
        String elementoAleatorio8 = canciones.get(indiceAleatorio8);
        elementoAleatorio8 =cancion8;
        return cancion8;
    }
    public String getAsociarCancion9(){
        int indiceAleatorio9 = rand.nextInt(canciones.size());
        String elementoAleatorio9 = canciones.get(indiceAleatorio9);
        elementoAleatorio9=cancion9;
        return cancion9;
    }
    public String getAsociarCancion10(){
        int indiceAleatorio10 = rand.nextInt(canciones.size());
        String elementoAleatorio10 = canciones.get(indiceAleatorio10);
        elementoAleatorio10=cancion10;
        return cancion10;
    }
    public String getAsociarCancion11(){
        int indiceAleatorio11 = rand.nextInt(canciones.size());
        String elementoAleatorio11 = canciones.get(indiceAleatorio11);
        elementoAleatorio11=cancion11;
        return cancion11;
    }
    public String getAsociarCancion12(){
        int indiceAleatorio12 = rand.nextInt(canciones.size());
        String elementoAleatorio12 = canciones.get(indiceAleatorio12);
        elementoAleatorio12=cancion12;
        return cancion12;
    }
    public String getAsociarCancion13(){
        int indiceAleatorio13 = rand.nextInt(canciones.size());
        String elementoAleatorio13 = canciones.get(indiceAleatorio13);
        elementoAleatorio13 =cancion13;
        return cancion13;
    }
    public String getAsociarCancion14(){
        int indiceAleatorio14 = rand.nextInt(canciones.size());
        String elementoAleatorio14 = canciones.get(indiceAleatorio14);
        elementoAleatorio14=cancion14;
        return cancion14;
    }
    public String getAsociarCancion15(){
        int indiceAleatorio15 = rand.nextInt(canciones.size());
        String elementoAleatorio15 = canciones.get(indiceAleatorio15);
        elementoAleatorio15=cancion15;
        return  cancion15;
    }
}
