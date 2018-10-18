/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacion.pkg2;

public class Diagnostico {

    private String observacion;
    private String tipo;
    private String tratamiento;
    
    
    public Diagnostico(){}
    public Diagnostico(String observacion,String tipo,String tratamiento){
        this.observacion = observacion;
        this.tipo = tipo;
        this.tratamiento = tratamiento;        
    }
    @Override
    public String toString(){
        String diagnostico = "\nTipo: "+getTipo()+ "\nObservacion: "+getObservacion()+".\nTratamiento: "+getTratamiento();
        return diagnostico;
    }

    /**
     * @return the observacion
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * @param observacion the observacion to set
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tratamiento
     */
    public String getTratamiento() {
        return tratamiento;
    }

    /**
     * @param tratamiento the tratamiento to set
     */
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
    


    
}
