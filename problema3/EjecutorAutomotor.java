/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.problema2.problema3;

/**
 *
 * @author SALA I
 */
public class EjecutorAutomotor {
    public static void main(String[] args) {
        Automotor automovil1 = new Automotor("123456789", "Toyota", 2010, 15000);
        automovil1.calcularValorMatric();
        System.out.println(automovil1.toString());
        
        Automotor automovil2 = new Automotor();
        automovil2.setCedulaDueno("987654321");
        automovil2.setMarca("Ford");
        automovil2.setAnioFabri(2019);
        automovil2.setValor(25000);
        automovil2.calcularValorMatric();
        System.out.println(automovil2.toString());
    }
}
