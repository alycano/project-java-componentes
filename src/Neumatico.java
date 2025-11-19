public class Neumatico {
    // Atributos
    private String marca;
    private String tamano;
    private double presion;

    // Constructor
    public Neumatico(String marca, String tamano, double presion) {
        this.marca = marca;
        this.tamano = tamano;
        this.presion = presion;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
}