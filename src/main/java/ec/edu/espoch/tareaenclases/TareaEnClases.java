/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.tareaenclases;

/**
 *
 * @author GIGABYTE
 */
public class TareaEnClases {

    public static void main(String[] args) {
        
        Estudiantes estudianteUno = new Estudiantes();//primer objeto 
        estudianteUno.nombre="Jonathan";
        estudianteUno.identificacion =1711627081;
        System.out.println("nombre"+estudianteUno.nombre);
        System.out.println("identificacion"+estudianteUno.identificacion);
        
         Estudiantes estudianteDos = new Estudiantes();//primer objeto 
        estudianteDos.nombre="FERNANDA";
        estudianteDos.identificacion =1103162119;
        System.out.println("nombre"+estudianteDos.nombre);
        System.out.println("identificacion"+estudianteDos.identificacion);

        
    }
}