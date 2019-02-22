/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libros;

/**
 *Esta clase es la que se va a comunicar con la parte grafica para recibir la informacion de cada libro
 * @author Wilson Steven Rodriguez
 * @version 1.0
 */
public class Libro {
    private String libro;
    private String version;
    private String editorial;
    private Integer precio;
    private Integer cantidad;
    /**
     * contructor para inicializar las variables de libro y que sean necesarias a la hora de registrar uno nuevo
     * @param libro cadena de texto que obtiene el titulo del libro 
     * @param version recibe en que version del libro esta
     * @param editorial informa que editorial es el libro
     * @param precio recibe el costo que tiene libro
     * @param cantidad recibe el numero de unidades por libro
     */
    public Libro(String libro, String version, String editorial, Integer precio, Integer cantidad) {
        this.libro = libro;
        this.version = version;
        this.editorial = editorial;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    /**
     * metodo para almacenar el libro en la base de datos
     */
   private void almacenaLibro(){
       
   }

   
   public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
   
    
}