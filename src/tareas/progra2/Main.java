package tareas.progra2;
import tareas.progra2.Vehiculo;
import tareas.progra2.VehiculoCarro;
import java.io.IOException;
import java.io.*;
import java.lang.NullPointerException;
public class Main {
    public static void main(String[] args) {
     Vehiculo mVehiculos[]= new Vehiculo[3];
     mVehiculos[0] = new Vehiculo("Honda", "civic");
     mVehiculos[1]= new VehiculoCarro(4,"audi","A4");

     for (Vehiculo vehiculo: mVehiculos){
         System.out.println(vehiculo.toString());

     }
    }
}