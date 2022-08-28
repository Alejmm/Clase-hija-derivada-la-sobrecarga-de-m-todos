package tareas.progra2;
import tareas.progra2.Vehiculo;
import tareas.progra2.Main;

import java.beans.BeanProperty;
import java.lang.NullPointerException;
public class VehiculoCarro extends Vehiculo{
    public int cantRuedas;

    public VehiculoCarro(int cantRuedas, String marca, String modelo) {
        super(marca, modelo);
        this.cantRuedas = cantRuedas;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    @Override
    public String toString() {
        return "VehiculoCarro{" +
                "cantRuedas=" + cantRuedas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }




}
