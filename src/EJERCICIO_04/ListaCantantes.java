/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_04;
import java.util.ArrayList;
//GASPAR PAUCAR WILBER ANDRIHU
/**
 *
 * @author Usuario
 */
public class ListaCantantes {
    //Declaramos e inicializamos el arraylist
    private ArrayList <Cantantes> cantantes = new ArrayList<>();
 
    //Método constructor vacío
    public void ListaCantantes() {
    }
 
    //Método para añadir nombre de cantantes   
    public void anadirCantante(String nombre) {
        cantantes.add(new Cantantes(nombre));
    }
 
    //Método para devolver el listado de cantantes formateado
    public ArrayList <Cantantes> obtenerListadoFormateado() {
        for (int x = 0; x < cantantes.size(); x++) {
            System.out.println("Cantante: " + cantantes.get(x).getNombre());
        }
        return cantantes;
    }
 
    //Método para devolver el listado sin formatear
    public ArrayList <Cantantes> listadoCantantes () {
        for (int x = 0; x < cantantes.size(); x++) {
            System.out.println(cantantes.get(x).getNombre());        
        }
        return cantantes;
    }
}
