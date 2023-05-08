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
public class Cheques {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;
    public Cheques(){}
    public Cheques(String nombreCliente, String nombreBanco, double valorCheque){
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public void setNombreBanco(String nombreBanco){
        this.nombreBanco = nombreBanco;
    }
    public void setValorCheque(double valorCheque){
        this.valorCheque = valorCheque;
    }
    public void calcularComision(){
        this.comision = valorCheque * 0.003;
    }
    public String getNombreCliente(){
        return nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public double getComision() {
        return comision;
    }
    public String toString(){
        return String.format("CHEQUE"
                +"\nNombre del Cliente:%s"
                +"\nNombre del Banco:%s"
                +"\nValor del cheque:%.2f"
                +"\nComision:%.2f"
                , getNombreCliente()
                ,getNombreBanco()
                ,getValorCheque()
                ,getComision());
    }
}