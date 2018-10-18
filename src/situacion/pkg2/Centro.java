/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacion.pkg2;

import java.util.ArrayList;

public class Centro {
    private ArrayList<Paciente> pacientes =  new ArrayList<Paciente>();
    private ArrayList<Doctor> doctores =  new ArrayList<Doctor>();
    private ArrayList<Especialidad> especialidades =  new ArrayList<Especialidad>();
    private ArrayList<Diagnostico> diagnosticos =  new ArrayList<Diagnostico>();
    

    /**
     * @return the pacientes
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }


    public void setPacientes(Paciente p) {
        
        pacientes.add(p);
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(Doctor d) {
        doctores.add(d);
    }
    
    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    /**
     * @param Especialidad the pacientes to set
     */
    public void setEspecialidades(Especialidad e) {
        especialidades.add(e);
    } 
    
     /**
     * @return the Diagnostico
     */
    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    /**
     * @param Diagnostico the pacientes to set
     */
    public void setDiagnosticos(Diagnostico d) {
        diagnosticos.add(d);
    }
    
    
    public void verificarDatos(String dni, String nombre, String apellido,String domicilio) throws VerificarDniException, VerficarCampoVacioException{
        
        if(dni.length() == 8 || dni.length() == 7){
            int numero = Integer.parseInt(dni);
            if(numero < 1000000)
                 throw new VerificarDniException();             
        }
        else 
            throw new VerificarDniException();
        
        if(nombre.equals("")||apellido.equals("")||domicilio.equals(""))
                    throw new VerficarCampoVacioException();
                
    }
    
    public void sincronisarInformacion(Paciente paciente, Object doctor, Object especialidad,Object habitacion, int numCama){
        
        for (Doctor doc : this.getDoctores()){
            if(doc.toString().equals(doctor.toString())){
                doc.setPaciente(paciente);
                paciente.setDoctor(doc);
            }
        }
        for (Especialidad esp : this.getEspecialidades()){
            if(esp.toString().equals(especialidad.toString())){
                paciente.setEspecialidad(esp);
            }
        }
    }
    
    public void verificarDni(String dni) throws VerificarDniException{
        
        if(dni.length() == 8 || dni.length() == 7){
            int numero = Integer.parseInt(dni);
            if(numero < 1000000)
                throw new VerificarDniException();                   
        }
        else 
            throw new VerificarDniException();             
    }
    
    public void buscarPaciente(String dni) throws PacienteNoEncontradoException{
        int bandera =0;
        for(Paciente pac : this.getPacientes()){
                    if (pac.getDni().equals(dni)){
                        bandera =1;
                        break;
                }
                }
        if(bandera == 0)
            throw new PacienteNoEncontradoException();      
    }
    
    public void buscarRepetido(String dni) throws  VerificarRepetidosException{
    for(Paciente pac : this.getPacientes()){
        if (pac.getDni().equals(dni)){
            throw new VerificarRepetidosException();
        }
    }
    }
    
}
