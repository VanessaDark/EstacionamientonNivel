/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author vanes
 */
public class Auto {
    
    private String placa;
    private String propietario;
    private String hora;
    private String fecha;
    private String tipo;
    private String marca;
    private int modelo;
    private String color;
    private int lugar;
    
    //Constructor membresia
    
    public Auto(String placa, String propietario, String hora, String fecha, String tipo, String marca, int modelo, String color, int lugar) {
        this.placa = placa;
        this.propietario = propietario;
        this.hora = hora;
        this.fecha = fecha;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.lugar = lugar;
    }

    //Constructor Hora/fraccion

    public Auto(String placa, String hora, String fecha, int lugar) {
        this.placa = placa;
        this.hora = hora;
        this.fecha = fecha;
        this.lugar = lugar;
    }
    
    
    //Getters and setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
}
