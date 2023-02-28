/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mongocrud;

/**
 *
 * @author Cristian Leyva
 */
public class Mongocrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coneccion conexion = new Coneccion();
         
        conexion.insertar("jugar futbol");
        conexion.insertar("jugar Beisbol");
        conexion.Mostrar();
        
        conexion.Actualizar("jugar futbol", "jugar tenis");
        conexion.Mostrar();
        conexion.eliminar("jugar Beisbol");
        conexion.Mostrar();
    }
    
}
