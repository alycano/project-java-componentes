public class Main {
    public static void main(String[] args) {

        // Crear objetos principales
        Vehiculo vehiculo = new Vehiculo("Aly128", "Subaru", "Impreza", 2006);
        Motor motor = new Motor("Gasolina", 1800, 120);
        Transmision transmision = new Transmision("Automática", 6, "Delantera");
        Chasis chasis = new Chasis("Monocasco", 4.5, 1.8, 1200);
        Neumatico neumatico = new Neumatico("Michelin", "16\"", 32.0);
        SistemaElectrico se = new SistemaElectrico("12V", true, true);
        SistemaFrenos frenos = new SistemaFrenos("Disco", true, "Buen estado");
        RegistroVehicular rv = new RegistroVehicular("XYZ999", "Juan Pérez", "2023-05-10");
        Mantenimiento mant = new Mantenimiento("2024-10-12", "Cambio de aceite", 150000.0);
        Sensor sensor = new Sensor("Temperatura", 25.3);

        System.out.println("=== Objetos creados correctamente ===");
        System.out.println("Vehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        System.out.println("Motor: " + motor.getTipo() + " - " + motor.getCilindrada() + "cc");
        System.out.println("Transmisión: " + transmision.getTipo());
        System.out.println("Chasis: " + chasis.getTipo());
        System.out.println("Neumático: " + neumatico.getMarca());
        System.out.println("Sensor: " + sensor.getTipo());
    }
}