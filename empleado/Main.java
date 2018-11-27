package empleado;

import java.util.GregorianCalendar;

/**
 *
 * @author emendezduran
 */
public class Main {

    public static void main(String[] args) {

        GregorianCalendar fechaNac = new GregorianCalendar(1990, 10, 5);
        GregorianCalendar fechaIni = new GregorianCalendar(2012, 10, 5);
        Empleado secret1 = new Empleado("Maria", fechaNac, fechaIni, "Administracion Empresarial");
        System.out.println(secret1.toString());
        secret1.calcularSueldo();
    }
}
