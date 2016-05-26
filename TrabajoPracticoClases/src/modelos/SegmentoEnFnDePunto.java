package modelos;

/**
 * Created by kefala on 17/05/16.
 */
public class SegmentoEnFnDePunto {
    private PuntoEnElPlano puntoA;
    private PuntoEnElPlano puntoB;

    public SegmentoEnFnDePunto(PuntoEnElPlano puntoA) {
        this.puntoA = puntoA;
        this.puntoB = new PuntoEnElPlano(puntoA.getCoordenaX() + 1, puntoA.getCoordenaY() + 1);
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

    public void mostrarse () {
        System.out.print("Soy un segmento que voy desde el punto (");
        System.out.print(this.getPuntoA().getCoordenaX());
        System.out.print(", ");
        System.out.print(this.getPuntoA().getCoordenaY());
        System.out.print(") y termino en (");
        System.out.print(this.getPuntoB().getCoordenaX());
        System.out.print(", ");
        System.out.print(this.getPuntoB().getCoordenaY());
        System.out.print(")");
        System.out.println("");
    }
}
