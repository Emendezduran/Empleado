package empleado;

import java.util.GregorianCalendar;

/**
 *
 * @author emendezduran
 */
public class Empleado {

    private String nombre;
    private GregorianCalendar inicioTrabajo;
    private GregorianCalendar fechaNacimiento;
    private String titulacion;

    public Empleado() {
    }

    public Empleado(String nombre, GregorianCalendar inicioTrabajo, GregorianCalendar fechaNacimiento, String titulacion) {
        this.nombre = nombre;
        this.inicioTrabajo = inicioTrabajo;
        this.fechaNacimiento = fechaNacimiento;
        this.titulacion = titulacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getInicioTrabajo() {
        return inicioTrabajo;
    }

    public void setInicioTrabajo(GregorianCalendar inicioTrabajo) {
        this.inicioTrabajo = inicioTrabajo;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Empleado:\n" + "nombre=" + nombre + "\ninicioTrabajo=" + inicioTrabajo.getTime() + "\nfechaNacimiento=" + fechaNacimiento.getTime() + "\ntitulacion=" + titulacion + '}';
    }

    public void calcularSueldo() {
        System.out.println("Resultado del Calculo de Sueldo");
    }

}
