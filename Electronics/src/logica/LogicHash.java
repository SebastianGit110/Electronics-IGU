package logica;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class LogicHash {
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
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "id = " + id + ", nombre = " + nombre + ", color = " + color + ", cantidad = " + cantidad;
    }
    
    
    
}
