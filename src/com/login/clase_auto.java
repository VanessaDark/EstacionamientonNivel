/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

/**
 *
 * @author vanes
 */
public class clase_auto {
    
     //Atributos auto
    private String placa;
    private String tipo;
    private String marca;
    private int modelo;
    private String color;
    private String hora;
    private String fecha;

    //Atributos de usuario
    private String propietario;
    private int telefono;
    private String direccion;
    
    //Atributos del lugar
    private String disponibolidad;
    private int lugar;
    
    //Constructor (pension)
    public clase_auto(String placa, String tipo, String marca, int modelo, String color, String hora, String fecha, String propietario, int telefono, String direccion, String disponibolidad, int lugar) {
        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.hora = hora;
        this.fecha = fecha;
        this.propietario = propietario;
        this.telefono = telefono;
        this.direccion = direccion;
        this.disponibolidad = disponibolidad;
        this.lugar = lugar;
    }
    
    //Constructor (Hora fraccion)

    public clase_auto(String placa, String hora, String fecha, String disponibolidad, int lugar) {
        this.placa = placa;
        this.hora = hora;
        this.fecha = fecha;
        this.disponibolidad = disponibolidad;
        this.lugar = lugar;
    }
    
    
    
    
    
    //Geters and setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDisponibolidad() {
        return disponibolidad;
    }

    public void setDisponibolidad(String disponibolidad) {
        this.disponibolidad = disponibolidad;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }
    
    
    
    
 
  
     
      
    
}
