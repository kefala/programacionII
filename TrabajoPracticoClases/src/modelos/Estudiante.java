package modelos;

/**
 * Created by kefala on 17/05/16.
 */
public class Estudiante {
    private Fecha fechaDeParcial;
    private NumeroRacional notaDeParcial;
    private TelefonoMovil telefono;
    private String nombre;

    public Estudiante(Fecha fechaDeParcial, NumeroRacional notaDeParcial, TelefonoMovil telefono, String nombre) {
        this.fechaDeParcial = fechaDeParcial;
        this.notaDeParcial = notaDeParcial;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public Fecha getFechaDeParcial() {
        return fechaDeParcial;
    }

    public void setFechaDeParcial(Fecha fechaDeParcial) {
        this.fechaDeParcial = fechaDeParcial;
    }

    public NumeroRacional getNotaDeParcial() {
        return notaDeParcial;
    }

    public void setNotaDeParcial(NumeroRacional notaDeParcial) {
        this.notaDeParcial = notaDeParcial;
    }

    public TelefonoMovil getTelefono() {
        return telefono;
    }

    public void setTelefono(TelefonoMovil telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarse () {
        System.out.printf("Soy un estudiante y en el parcial de la fecha " + this.getFechaDeParcial().getFecha().getDay() + "/" + this.getFechaDeParcial().getFecha().getMonth());
        System.out.println(" el alumno " + this.getNombre() + " obtuvo un " + this.getNotaDeParcial().getNumero() + ".");
        System.out.printf("Llamar al alumno al numero " + this.getTelefono().mostrarNumero());
    }
}
