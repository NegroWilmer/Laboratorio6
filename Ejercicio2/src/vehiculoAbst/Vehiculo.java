package vehiculoAbst;

public abstract class Vehiculo {
    protected int placa;
    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(int placa, String marca, double velocidadMaxima) {
        this.placa = placa;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void mover();
    public abstract double calcularPeaje();
}
