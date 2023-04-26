package manejoclases03;

import java.util.Scanner;
import java.util.Locale;

public class Ejecutable05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        Hospital myHospital = new Hospital();

        System.out.println("Ingrese el nombre del hospital");
        String nombre = entrada.nextLine();
        myHospital.establecerNombre(nombre);

        System.out.println("Ingrese el numero de camas del hospital");
        int numeroCamas = entrada.nextInt();
        myHospital.establecerNumeroCamas(numeroCamas);

        System.out.println("Ingrese el presupuesto del hospital");
        double presupuesto = entrada.nextDouble();
        myHospital.establecerPresupuesto(presupuesto);

        // Dar los valores
        System.out.printf("%s - %d - %.2f\n",
                myHospital.obtenerNombre(),
                myHospital.obtenerNumeroCamas(),
                myHospital.obtenerPresupuesto());
    }
}
