/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacion.pkg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Especialidad {
    
    private String nombre;
    private  ArrayList<Doctor> doctores = new ArrayList<Doctor>();
    
    public Especialidad (String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public void estadoEspecialidad(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("\nDoctores adscritos:\n"+getDoctores());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDoctores(){
        String lista = "";
        for (int i=0; i< doctores.size();i++){
            Object doc = doctores.get(i);
            lista = lista +"\n"+ doc;
        }
        return lista;
    }
    public void setDoctor(Doctor doctor){
        doctores.add(doctor);
    }
    
    

}
