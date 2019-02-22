/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libros;

/**
 * Esta clase es la encargada de realizar la venta con el cliente arrojando una factura
 * @author wilson steven rodriguez
 * @version 1.0
 */
public class Ventas {
  private String nombreCliente;
  private String cedulaCliente;
  private Integer cantidad;
  private String [] factura;
  private String libro;
  /**
   * Me inicializa las variables necesarias para arrojar la factura
   * @param nombreCliente 
   * @param cedulaCliente
   * @param cantidad la cantidad de unidades que va a comprar de cada libro
   */
    public Ventas(String nombreCliente, String cedulaCliente, Integer cantidad) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.cantidad = cantidad;
    }
    /**
     * este metodo es el que se va a ejecutar cuando se realize la compra del cliente
     * @param nombreCliente
     * @param cedulaCliente
     * @param cantidad la cantidad de libros que va a comprar
     * @param tituloLibro se ingresa el libro que se va a comprar
     * @return me va a retornar la factura con la informacion del libro y el total a pagar
     */
    
    public String[] compraLibro(String tituloLibro,String nombreCliente, String cedulaCliente, String cantidad){
    return factura;
    }
     /**
     * Este metodo Realiza una Busqueda en BD y devuelve una alerta si el libro tiene menos de diez
     * @return retorna un aviso si quedan menos de diez unidades de ese libró 
     */
    public String menorDiez(){
    
    return libro;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
  
  
  
}
