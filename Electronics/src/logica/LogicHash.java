package logica;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class LogicHash {
    Scanner in = new Scanner(System.in);
    
    ArrayList<LogicHash> objetos = new ArrayList();
    public int id;
    public String nombre;
    public String color;
    public int cantidad;
    
    public LogicHash(){
    }
    
    public LogicHash(int id, String nombre, String color, int cantidad){
        this.id = id;
        this.nombre = nombre;
        this.color = color; //modificar para que se lean dependiendo de los parametros desde la interfaz G
        this.cantidad = cantidad;
    }
    
    //Metodos
    public void crear(int id, String nombre, String color, int cantidad ){
        objetos.add(new LogicHash(id,nombre,color,cantidad));
    }

    public ArrayList<LogicHash> getObjetos() {
        return objetos;
    }
    
    //Metodos que leen los atributos y retornan el dato
    public void leerId(){
        for(LogicHash elem : objetos){
            System.out.println("Id " + elem.getId());
        }
    }
    
    public void leerNombre(){
        for(LogicHash elem : objetos){
            System.out.println("Nombre " + elem.getNombre());
        }
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getCantidad() {
        return cantidad;
    }
}
