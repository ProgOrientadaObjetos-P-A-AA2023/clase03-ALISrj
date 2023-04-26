/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import paquete01.Hospital;
import paquete03.Clinica;

/**
 *
 * @author reroes
 */
public class Ejecutable02 {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        hospital.establecerNombre("Isidro Ayora");
        hospital.establecerNumeroCamas(100);
        hospital.establecerPresupuesto(5603.43);
        
        System.out.printf("Isidro AyoraHospital\n%s - %d - %.2f\n", hospital.obtenerNombre(),
                hospital.obtenerNumeroCamas(), hospital.obtenerPresupuesto());
        
        Clinica clinica = new Clinica();
        
        clinica.establecerNombre("San Agustín");
        clinica.establecerNumeroCamas(50);
        clinica.establecerPresupuesto(2603.43);
        
        System.out.printf("Clinica\n%s - %d - %.2f\n", clinica.obtenerNombre(),
                clinica.obtenerNumeroCamas(), clinica.obtenerPresupuesto());
        
        
        
    }
}
