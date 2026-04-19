package vehiculoAbst;

class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(int placa, String marca, double velocidadMaxima, int numeroPuertas) {
        super(placa, marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mover() {
        System.out.println("El auto de marca " + marca + " se desplaza por la carretera.");
    }

    @Override
    public double calcularPeaje() {
        return 10.0; 
    }
}
