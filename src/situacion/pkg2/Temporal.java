
package situacion.pkg2;


public class Temporal extends Doctor {

    private final Integer diabaj;
    private final Integer mesbaj;
    private final Integer aniobaj;
    private final Integer horanormal;
    private final Integer horaextra;

    public Temporal(Integer diabaj, Integer mesbaj, Integer aniobaj, Integer horanormal, Integer horaextra) {
        this.diabaj = diabaj;
        this.mesbaj = mesbaj;
        this.aniobaj = aniobaj;
        this.horanormal = horanormal;
        this.horaextra = horaextra;
    }

    public Temporal(Integer diabaj, Integer mesbaj, Integer aniobaj, Integer horanormal, Integer horaextra, String nombre, String apellido, String sexo, String dni, String direccion, int matricula, Especialidad especialidad) {
        super(nombre, apellido, sexo, dni, direccion, matricula, especialidad);
        this.diabaj = diabaj;
        this.mesbaj = mesbaj;
        this.aniobaj = aniobaj;
        this.horanormal = horanormal;
        this.horaextra = horaextra;
    }
    
    
    public Integer getDiabaj() {
        return diabaj;
    }

    public Integer getMesbaj() {
        return mesbaj;
    }

    public Integer getAniobaj() {
        return aniobaj;
    }

    public Integer getHoranormal() {
        return horanormal;
    }

    public Integer getHoraextra() {
        return horaextra;
    }
    

}
