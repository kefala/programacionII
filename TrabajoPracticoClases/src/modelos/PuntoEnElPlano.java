package modelos;

/**
 * Created by kefala on 17/05/16.
 */
public class PuntoEnElPlano {
    private int coordenaX;
    private int coordenaY;

    public PuntoEnElPlano(int coordenaX, int coordenaY) {
        this.coordenaX = coordenaX;
        this.coordenaY = coordenaY;
    }

    public int getCoordenaX() {
        return coordenaX;
    }

    public void setCoordenaX(int coordenaX) {
        this.coordenaX = coordenaX;
    }

    public int getCoordenaY() {
        return coordenaY;
    }

    public void setCoordenaY(int coordenaY) {
        this.coordenaY = coordenaY;
    }
}
