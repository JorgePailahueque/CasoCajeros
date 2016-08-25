/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoCajeros;

/**
 *
 * @author diego
 */
public class Cuenta {
    private int numCuenta;
    private int numCliente;
    private String TipoDeCuenta;
    private double Saldo;

    public Cuenta(int numCuenta, int numCliente, String TipoDeCuenta, double Saldo) {
        this.numCuenta = numCuenta;
        this.numCliente = numCliente;
        this.TipoDeCuenta = TipoDeCuenta;
        this.Saldo = Saldo;
    }
    
    public void consultarCuenta(){
    
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getTipoDeCuenta() {
        return TipoDeCuenta;
    }

    public void setTipoDeCuenta(String TipoDeCuenta) {
        this.TipoDeCuenta = TipoDeCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
}
