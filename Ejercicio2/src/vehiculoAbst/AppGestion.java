package vehiculoAbst;

public class AppGestion {

    public static void main(String[] args) {
      
        Vehiculo[] flota = {
            new Auto(123, "Toyota", 180.0, 4),
            new Moto(456, "Yamaha", 150.0, TipoMoto.DEPORTIVA),
            new Camion(789, "Volvo", 100.0, 15.5)
        };

        System.out.println("--- Reporte Detallado de Flota ---");
        
        for (Vehiculo vehiculo : flota) {
            vehiculo.mover();
            
          
            System.out.println("Marca: " + vehiculo.marca);
            System.out.println("Placa: " + vehiculo.placa);
            System.out.println("Velocidad Máxima: " + vehiculo.velocidadMaxima + " km/h");
            
         
            if (vehiculo instanceof Moto) {

                Moto miMoto = (Moto) vehiculo;
               
                System.out.println("Tipo de Moto: " + miMoto.getTipo()); 
            }

            System.out.println("Peaje a pagar: $" + vehiculo.calcularPeaje());
            System.out.println("--------------------------------------");
        }
    }
}
