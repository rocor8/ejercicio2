
package situacion.pkg2;


public class Enfermedad {
    private String nombre;
    private Integer diaini;
    private Integer mesini;
    private Integer anioini;
    private Integer duracion;
    private String tipoenfermedad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiaini(Integer diaini) {
        this.diaini = diaini;
    }

    public void setMesini(Integer mesini) {
        this.mesini = mesini;
    }

    public void setAnioini(Integer anioini) {
        this.anioini = anioini;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setTipoenfermedad(String tipoenfermedad) {
        this.tipoenfermedad = tipoenfermedad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDiaini() {
        return diaini;
    }

    public Integer getMesini() {
        return mesini;
    }

    public Integer getAnioini() {
        return anioini;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getTipoenfermedad() {
        return tipoenfermedad;
    }

    public Enfermedad(String nombre, Integer diaini, Integer mesini, Integer anioini, Integer duracion, String tipoenfermedad) {
        this.nombre = nombre;
        this.diaini = diaini;
        this.mesini = mesini;
        this.anioini = anioini;
        this.duracion = duracion;
        this.tipoenfermedad = tipoenfermedad;
    }
}
