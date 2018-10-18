
package situacion.pkg2;


public class Permanente extends Doctor {

    public Permanente(Integer salariobase, Integer adicional) {
        this.salariobase = salariobase;
        this.adicional = adicional;
    }

    public Permanente(Integer salariobase, Integer adicional, String nombre, String apellido, String sexo, String dni, String direccion, int matricula, Especialidad especialidad) {
        super(nombre, apellido, sexo, dni, direccion, matricula, especialidad);
        this.salariobase = salariobase;
        this.adicional = adicional;
    }

   
    private final Integer salariobase;
    private final Integer adicional;

    public Integer getSalariobase() {
        return salariobase;
    }

    public Integer getAdicional() {
        return adicional;
    }
}
