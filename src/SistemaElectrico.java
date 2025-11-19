public class SistemaElectrico {
    // Atributos
    private String bateria;
    private boolean lucesFuncionando;
    private boolean sensoresActivos;

    // Constructor
    public SistemaElectrico(String bateria, boolean lucesFuncionando, boolean sensoresActivos) {
        this.bateria = bateria;
        this.lucesFuncionando = lucesFuncionando;
        this.sensoresActivos = sensoresActivos;
    }

    // Getters y Setters
    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public boolean isLucesFuncionando() {
        return lucesFuncionando;
    }

    public void setLucesFuncionando(boolean lucesFuncionando) {
        this.lucesFuncionando = lucesFuncionando;
    }

    public boolean isSensoresActivos() {
        return sensoresActivos;
    }

    public void setSensoresActivos(boolean sensoresActivos) {
        this.sensoresActivos = sensoresActivos;
    }
}