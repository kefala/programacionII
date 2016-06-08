package modelos;

/**
 * Created by kefala on 17/05/16.
 */
public class Carta {
    private String numero;
    private String palo;
    private String type;

    public Carta(String numero, String palo, String type) {
        this.numero = numero;
        this.palo = palo;
        this.type = type;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void mostrarse() {
        System.out.print("Soy la carta ");
        System.out.print(this.numero);
        System.out.print(" con palo ");
        System.out.print(this.palo);
        System.out.print(" y soy una carta de ");
        System.out.println(this.type);
    }

}
