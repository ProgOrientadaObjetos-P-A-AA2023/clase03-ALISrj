package manejoclases02;

public class Ejecutable {

    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();

        // Se asigna valores particulares al objeto
//        hospital.nombre = "Isidro Ayora";
        hospital.establecerNombre("BBVA");
//        hospital.numeroCamas = 100;
        hospital.establecerNumeroCamas(100);
//        hospital.presupuesto = 560340.43;
        hospital.establecerPresupuesto(12938790.2);

        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.obtenerNombre(),
                hospital.obtenerCamas(), hospital.obtenerPresupuesto());
    }
}
