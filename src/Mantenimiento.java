public class Mantenimiento {
    // Atributos
    private String fecha;
    private String descripcion;
    private double costo;

    // Constructor
    public Mantenimiento(String fecha, String descripcion, double costo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}