public class RegistroVehicular {
    // Atributos
    private String matricula;
    private String propietario;
    private String fechaRegistro;

    // Constructor
    public RegistroVehicular(String matricula, String propietario, String fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}