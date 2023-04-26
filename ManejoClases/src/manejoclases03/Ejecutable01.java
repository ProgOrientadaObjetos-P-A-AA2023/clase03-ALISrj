/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class Ejecutable01 {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        // a través de los métodos establecer
        
        // hospital.nombre = "Isidro Ayora";
        String nHospital = "Isidro Ayora";
        hospital.establecerNombre(nHospital);
        
        // hospital.numeroCamas = 100;
        hospital.establecerNumeroCamas(100);
        // hospital.presupuesto = 560340.43;
        hospital.establecerPresupuesto(5603.43);
        
        // Se presenta valores en pantalla, rescatando los valores
        // que se necesita a través de los métodos obtener del
        // objeto hospital
        
        // System.out.printf("%s - %d - %.2f\n", hospital.nombre,
        //         hospital.numeroCamas, hospital.presupuesto);
        
        System.out.printf("%s - %d - %.2f\n", hospital.obtenerNombre(),
                hospital.obtenerNumeroCamas(), hospital.obtenerPresupuesto());
        
        hospital.establecerNumeroCamas(200);
        
        System.out.println("---------------------------------");
        
        System.out.printf("%s - %d - %.2f\n", hospital.obtenerNombre(),
                hospital.obtenerNumeroCamas(), hospital.obtenerPresupuesto());
        
    }
}








