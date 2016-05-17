package helpers;

import modelos.Carta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 17/05/16.
 */
public class Cartas {

    public static void listar() {
        int i = 0;
        System.out.println("Sarasa");
        List<Carta> listaCartas = Cartas.dummieMazo();


        for (Carta carta : listaCartas) {
            carta.mostrarse();
        }

    }


    public static List<Carta> dummieMazo(){
        List<Carta> ret = new ArrayList<>();

        Carta toAppend = new Carta("1", "madera");
        ret.add(toAppend);

        return ret;
    }
}
