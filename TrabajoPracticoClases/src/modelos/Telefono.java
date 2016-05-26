package modelos;

/**
 * Created by kefala on 17/05/16.
 */
public class Telefono {
    private int codArea;
    private int numero;

    public Telefono(int codArea, int numero) {
        this.codArea = codArea;
        this.numero = numero;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
