package empleado;

import java.util.GregorianCalendar;

public class Secretaria extends Empleado {

    private String telefonoMovil;
    
    public Secretaria() {
    }

    public Secretaria(String telefonoMovil) {
       super(); 
        this.telefonoMovil = telefonoMovil;
    }
    
    public Secretaria(String telefonoMovil, String nombre, GregorianCalendar inicioTrabajo, GregorianCalendar fechaNacimiento, String titulacion) {
        super(nombre, inicioTrabajo, fechaNacimiento, titulacion);
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }
    
    @Override
    public void calcularSueldo() {
        System.out.println("Resultado del Calculo de Sueldo SECRETARIA");
    }
    
    @Override
    public String toString() {
        return "Secretaria{" + "telefonoMovil=" + telefonoMovil + '}';
    }

}
