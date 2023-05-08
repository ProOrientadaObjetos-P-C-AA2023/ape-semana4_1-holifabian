/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.problema2.problema3.problema4;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Creamos dos objetos de la clase "Cheques"
        Cheques cheque1 = new Cheques("Juan Perez", "Banco Nacional", 1000.0);
        Cheques cheque2 = new Cheques("Maria Lopez", "Banco Popular", 2000.0);
        
        // Calculamos la comisión de cada cheque
        cheque1.calcularComision();
        cheque2.calcularComision();
        
        // Imprimimos la información de cada cheque, incluyendo la comisión
        System.out.println(cheque1.toString());
        System.out.println(cheque2.toString());
    }
}
