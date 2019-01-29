package empleado;

import java.util.GregorianCalendar;

/**
 *
 * @author emendezduran
 */
public class Main {

    public static void main(String[] args) {

        //GregorianCalendar fechaNac = new GregorianCalendar(1990, 10, 5);
        //GregorianCalendar fechaIni = new GregorianCalendar(2012, 10, 5);
        
        Empleado empleado1 = new Empleado("Maria", new GregorianCalendar(1990, 10, 5),new GregorianCalendar(2012, 10, 5), "Administracion Empresarial");
        System.out.println(empleado1.toString());
        empleado1.calcularSueldo();
        
        Secretaria secretaria1 = new Secretaria("660459006","Ana", new GregorianCalendar(1995, 8, 3),new GregorianCalendar(2014, 10, 2),"Secretariado");
        System.out.println(secretaria1.getNombre());
        secretaria1.calcularSueldo();
    }
}
