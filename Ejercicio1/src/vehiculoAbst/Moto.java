package vehiculoAbst;

class Moto extends Vehiculo {
    private TipoMoto tipo;

    public Moto(int placa, String marca, double velocidadMaxima, TipoMoto tipo) {
        super(placa, marca, velocidadMaxima);
        this.tipo = tipo;
    }
    
    public TipoMoto getTipo() {
        return this.tipo;
    }

    @Override
    public void mover() {
        System.out.println("La moto " + tipo + " zigzaguea entre el tráfico.");
    }

    @Override
    public double calcularPeaje() {
        return 5.0; 
    }
}
