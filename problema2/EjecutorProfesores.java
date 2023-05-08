/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.problema2;

/**
 *
 * @author SALA I
 */
public class EjecutorProfesores {
    public static void main(String[] args) {
        // Crear dos objetos de Profesores con diferentes valores de nombre, apellido, sueldo y cedula.
        Profesores profesor1 = new Profesores("Juan", "Perez", 5000, "1234567890");
        Profesores profesor2 = new Profesores("Maria", "Gonzalez", 6000, "0987654321");
        
        // Calcular el sueldo total de cada profesor.
        profesor1.calcularSueldo();
        profesor2.calcularSueldo();
        
        // Mostrar los detalles de cada profesor.
        System.out.println(profesor1.toString());
        System.out.println(profesor2.toString());
    }
}
