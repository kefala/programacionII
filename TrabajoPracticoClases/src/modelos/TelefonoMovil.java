package modelos;

/**
 * Created by kefala on 17/05/16.
 */
public class TelefonoMovil extends Telefono {

    public TelefonoMovil(int codArea, int numero) {
        super(codArea, numero);
    }

    public String mostrarNumero () {
        String ret = this.getCodArea() + " 15 " + this.getNumero();
        return ret;
    }
}
