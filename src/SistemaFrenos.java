public class SistemaFrenos {
    // Atributos
    private String tipo;
    private boolean tieneABS;
    private String estadoDiscos;

    // Constructor
    public SistemaFrenos(String tipo, boolean tieneABS, String estadoDiscos) {
        this.tipo = tipo;
        this.tieneABS = tieneABS;
        this.estadoDiscos = estadoDiscos;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public String getEstadoDiscos() {
        return estadoDiscos;
    }

    public void setEstadoDiscos(String estadoDiscos) {
        this.estadoDiscos = estadoDiscos;
    }
}