/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author SALA I
 */
public class EjecutorEstudiante {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Lenin", 10, 10, 10);
        estudiante1.calcularPromedio(0);
        System.out.println(estudiante1);
    }
}
