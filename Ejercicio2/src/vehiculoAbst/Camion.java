package vehiculoAbst;

class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(int placa, String marca, double velocidadMaxima, double capacidadCarga) {
        super(placa, marca, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mover() {
        System.out.println("El camión transporta " + capacidadCarga + " toneladas lentamente.");
    }

    @Override
    public double calcularPeaje() {
        return 25.0 + (capacidadCarga * 2); // Tarifa basada en el peso
    }
}
