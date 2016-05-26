package modelos;

import java.util.ArrayList;

/**
 * Created by kefala on 17/05/16.
 */
public class TrianguloEnFnDePunto {
    private PuntoEnElPlano puntoA;
    private PuntoEnElPlano puntoB;
    private PuntoEnElPlano puntoC;

    public TrianguloEnFnDePunto(PuntoEnElPlano puntoA) {
        this.puntoA = puntoA;
        this.puntoB = new PuntoEnElPlano(puntoA.getCoordenaX() + 1, puntoA.getCoordenaY() + 1);
        this.puntoC = new PuntoEnElPlano(puntoA.getCoordenaX() - 1, puntoA.getCoordenaY() + 1);
    }

    public PuntoEnElPlano getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoEnElPlano puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoEnElPlano getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoEnElPlano puntoB) {
        this.puntoB = puntoB;
    }

    public PuntoEnElPlano getPuntoC() {
        return puntoC;
    }

    public void setPuntoC(PuntoEnElPlano puntoC) {
        this.puntoC = puntoC;
    }

    public void mostrarse () {
        System.out.printf("Soy un triangulo y mis vertises son ");
        System.out.printf("(" + this.getPuntoA().getCoordenaX() + ", " + this.getPuntoA().getCoordenaY() + ") ");
        System.out.printf("(" + this.getPuntoB().getCoordenaX() + ", " + this.getPuntoB().getCoordenaY() + ") ");
        System.out.printf("(" + this.getPuntoC().getCoordenaX() + ", " + this.getPuntoC().getCoordenaY() + ") ");
        System.out.println("");
    }
}
