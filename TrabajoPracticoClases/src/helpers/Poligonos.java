package helpers;

import modelos.PuntoEnElPlano;
import modelos.SegmentoEnFnDePunto;
import modelos.TrianguloEnFnDePunto;

import java.util.ArrayList;

/**
 * Created by kefala on 25/05/16.
 */
public class Poligonos {

    public static void mostrarAlgunosPoligonos () {
        ArrayList<SegmentoEnFnDePunto> listaDeSegmentos = Poligonos.obtenerSegmentos();
        ArrayList<TrianguloEnFnDePunto> listaDeTriangulos = Poligonos.obtenerTriagulos();

        for (SegmentoEnFnDePunto segmento : listaDeSegmentos) {
            segmento.mostrarse();
        }

        for (TrianguloEnFnDePunto triangulo : listaDeTriangulos) {
            triangulo.mostrarse();
        }
    }

    public static ArrayList<SegmentoEnFnDePunto> obtenerSegmentos () {
        ArrayList<SegmentoEnFnDePunto> ret = new ArrayList<>();

        PuntoEnElPlano puntoA = new PuntoEnElPlano(1, 0);
        PuntoEnElPlano puntoB = new PuntoEnElPlano(0, 0);
        PuntoEnElPlano puntoC = new PuntoEnElPlano(3, 1);


        SegmentoEnFnDePunto toAppend = new SegmentoEnFnDePunto(puntoA);
        SegmentoEnFnDePunto toAppend2 = new SegmentoEnFnDePunto(puntoB);
        SegmentoEnFnDePunto toAppend3 = new SegmentoEnFnDePunto(puntoC);
        ret.add(toAppend);
        ret.add(toAppend2);
        ret.add(toAppend3);
        return ret;
    }

    public static ArrayList<TrianguloEnFnDePunto> obtenerTriagulos () {
        ArrayList<TrianguloEnFnDePunto> ret = new ArrayList<>();

        PuntoEnElPlano puntoA = new PuntoEnElPlano(1, 0);
        PuntoEnElPlano puntoB = new PuntoEnElPlano(0, 0);
        PuntoEnElPlano puntoC = new PuntoEnElPlano(3, 1);


        TrianguloEnFnDePunto toAppend = new TrianguloEnFnDePunto(puntoA);
        TrianguloEnFnDePunto toAppend2 = new TrianguloEnFnDePunto(puntoB);
        TrianguloEnFnDePunto toAppend3 = new TrianguloEnFnDePunto(puntoC);
        ret.add(toAppend);
        ret.add(toAppend2);
        ret.add(toAppend3);
        return ret;
    }
}
