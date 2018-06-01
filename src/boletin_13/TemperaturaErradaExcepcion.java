/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_13;

/**
 *
 * @author Marcos
 */
public class TemperaturaErradaExcepcion extends Exception {
    
    public TemperaturaErradaExcepcion(){
        
        super("La temperatura no puede ser mayor a 80ºC");
    }
}
