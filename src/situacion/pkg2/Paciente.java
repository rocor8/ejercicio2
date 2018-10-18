
package situacion.pkg2;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Paciente extends Persona {
   
    private Doctor doctor;
    private Especialidad especialidad;
    private Calendar fechaDeNaciemiento = Calendar.getInstance();
    
    private Diagnostico diagnostico;
   
    
    private int edad;
    
    public Paciente(){}
    
    public Paciente(String nombre,String apellido,String sexo,String dni,String direccion,int dia, int mes, int ano){
        super(nombre,apellido,sexo,dni,direccion);
        //this.fechaDeNaciemiento = fechaDeNaciemiento;
        fechaDeNaciemiento.set(ano,mes-1,dia);
        edad = this.calcularEdad();
    }
    
    public int calcularEdad(){
        int edad=0;
        Calendar fechaActual = Calendar.getInstance();
        int anoAc = fechaActual.get(Calendar.YEAR);
        int mesAc = fechaActual.get(Calendar.MONTH);
        int diaAc = fechaActual.get(Calendar.DAY_OF_MONTH);
        int anoNac = fechaDeNaciemiento.get(Calendar.YEAR);
        int mesNac = fechaDeNaciemiento.get(Calendar.MONTH);
        int diaNac = fechaDeNaciemiento.get(Calendar.DAY_OF_MONTH);
        if (anoNac <= anoAc){
            if (mesNac <= mesAc){
                if (diaNac <= diaAc)
                    edad = anoAc - anoNac;
                else 
                    edad = anoAc - anoNac -1;
            }else
                edad = anoAc - anoNac -1;
        }else
            System.out.println("Error de Fecha de nacimiento");
        
        
        //System.out.println("Fecha Actual:  " + fechaActual.getTime());
        //System.out.println("Fecha Nacimiento:  " + fechaDeNaciemiento.getTime());
        return edad;
    }
    @Override
    public String toString(){
        String paciente = "Paciente: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad();
        return paciente;
    }

    
    

    /**
     * @return the doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    public String getFechaDeNaciemiento() {
        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato1.format(fechaDeNaciemiento.getTime());
        return fecha;
    }
    
    public void setFechaDeNaciemiento(int dia, int mes, int ano){
        fechaDeNaciemiento.set(ano,mes-1,dia);
    }

    /**
     * @return the diagnostico
     */
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */

    

    
}

