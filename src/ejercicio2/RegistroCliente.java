/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author frail
 */
public class RegistroCliente {
 private int saldo;
private String nombre;
private String idetificacionCliente;

public RegistroCliente(int saldo, String Nombre, String idetificacionCliente) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.idetificacionCliente = idetificacionCliente;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the Nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the idetificacionCliente
     */
    public String getIdetificacionCliente() {
        return idetificacionCliente;
    }

    /**
     * @param idetificacionCliente the idetificacionCliente to set
     */
    public void setIdetificacionCliente(String idetificacionCliente) {
        this.idetificacionCliente = idetificacionCliente;
    }

    
 
   
    
    
    
}
