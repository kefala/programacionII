package helpers;

import modelos.CartaDePocker;
import modelos.CartaEspañola;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 17/05/16.
 */
public class Cartas {

    public static void mostrarAlgunarCartas() {
        List<CartaDePocker> listaCartasPocker = Cartas.dummieMazoPocker();
        List<CartaEspañola> listaCartasEspañola = Cartas.dummieMazoEspañola();
        for (CartaDePocker carta : listaCartasPocker) {
            carta.mostrarse();
        }
        for (CartaEspañola carta : listaCartasEspañola) {
            carta.mostrarse();
        }
    }

    public static List<CartaDePocker> dummieMazoPocker(){
        List<CartaDePocker> ret = new ArrayList<>();

        CartaDePocker toAppend = new CartaDePocker("1", "Oro");
        CartaDePocker toAppend2 = new CartaDePocker("2", "Oro");
        CartaDePocker toAppend3 = new CartaDePocker("3", "Oro");
        ret.add(toAppend);
        ret.add(toAppend2);
        ret.add(toAppend3);
        return ret;
    }
    public static List<CartaEspañola> dummieMazoEspañola(){
        List<CartaEspañola> ret = new ArrayList<>();

        CartaEspañola toAppend = new CartaEspañola("1", "Oro");
        CartaEspañola toAppend2 = new CartaEspañola("2", "Oro");
        CartaEspañola toAppend3 = new CartaEspañola("3", "Oro");
        ret.add(toAppend);
        ret.add(toAppend2);
        ret.add(toAppend3);
        return ret;
    }
}
