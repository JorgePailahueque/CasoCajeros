/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoCajeros;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Cliente {
    private int numCliente;
    private int identificacion;
    private String nombre;
    private String direccion;
    private int telefono;
    private ArrayList<Cuenta>cuentas;

    public Cliente(int numCliente, int identificacion, String nombre, String direccion, int telefono) {
        this.numCliente = numCliente;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public void ingresarClave(){
    }
    public void elegirOpciones(){
    }
    public double indicarValorARetirar(){
        return 2935;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
