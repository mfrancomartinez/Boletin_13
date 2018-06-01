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
public class ConversorTermperaturas {
    final float grados = 80;
    float fahrenheit;
    float Rheamur;
    
    
    public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion{
        if (centigrados>grados){
            throw new TemperaturaErradaExcepcion();
        }else{
            fahrenheit = (float)(9.0/(5.0*centigrados)+32.4); 
            System.out.println("La temperatura en fahrenheit es: ");
            return fahrenheit;
        }
    }
    
    public float centigradosARheamur(float centigrados) throws TemperaturaErradaExcepcion{
        if (centigrados>grados){
            throw new TemperaturaErradaExcepcion();
        }else{
            Rheamur = (float)(4.0/5.0*centigrados);
            System.out.println("La temperatura en Rheamur es: ");
            return Rheamur;
        }
    }
    
}
