package modelos;

/**
 * Created by kefala on 17/05/16.
 */
public class Carta {
    private String numero;
    private String categoria;

    public Carta(String numero, String categoria) {
        this.numero = numero;
        this.categoria = categoria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarse() {
        System.out.print("Soy la carta ");
        System.out.print(this.numero);
        System.out.print(" con palo ");
        System.out.println(this.categoria);
    }

}
