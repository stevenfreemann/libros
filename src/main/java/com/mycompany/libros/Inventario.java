/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libros;

/**
 * Esta clase realizara las consultas, modificaciones en la base de datos dependiendo la informacion que 
 * requiera el cliente
 * @author Wilson Steven Rodriguez
 * @version 1.0
 */
public class Inventario {
   
    
    private String[] libros;
    private String[] factura;
   
    
    
    /**
    * Este metodo realiza una consulta a BD para mostrar el libro deseado 
    * @param libro recibe el nombre del libro para traer la informacion
    * @return trae el  libro buscado 
    */
    private String[] muestraLibro (String libro){
    
      return libros;
    }
    /**
     * Este metodo realiza una consulta a BD y trae todo el contenido del inventario
     * @return me va a retornar un array con todos los libros 
     */
    private String[] muestraStock(){
        
    return libros;
    }
    /**
     * Este metodo suma en BD el numero de vendidos por libro y resta en el inventario
     * @param libro recibe el nombre del libro vendido
     */
    
    private void vendidos(String libro){
    
        
    }
    /**
     * Este metodo Realiza una Busqueda en BD y devuelve los libros donde queden menos de 10 unidades
     * @return retorna un array con el titutlo de los libros 
     */
    private String[] menorDiez(){
        
    return libros;    
    } 
    /**
     * Este metodo devuelve los libros mas vendidos
     * @return devuelve un array con el titulo de los libros
     */
    private String[] masVendido(){
        
     return libros;   
    }
    /**
     * Este metodo realiza la consulta en BD de los libros menos vendidos 
     * @return retorna un array  con los titulos de los libros
     */
    
    private String[] menosVendido(){
     
     return libros;
    }
    /**
     * Este metodo elimina un libro en el inventario
     * @param libro recibe el nombre del libro a eliminar
     */
    private void eliminaLibro(String libro){
        
    }
    /**
     * Este metodo modifica algun libro del inventario
     * @param libro recibe el titulo del libro a modificar
     */
    private void modificaLibro(String libro){
        
    }
    /**
     * Este metodo sacara la factura del libro vendido
     * @param libro recibe el nombre del libro que se vendio
     * @return retorna un array de con los datos del libro vendido y su precio
     */
    private String[] factura(String libro){
        
        return factura;
    }

}