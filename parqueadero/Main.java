package parqueadero;

public class Main {
    public static void main(String[] args) {
        CalculadoraTarifa calculadora = new CalculadoraTarifa();
        String[] vehiculos = {"moto", "carro", "bicicleta"};
        int minutos = 130;
        for (String vehiculo : vehiculos) {
            System.out.println(calculadora.describir(vehiculo) + " - " + minutos + " min: $" + calculadora.calcular(vehiculo, minutos));
        }
    }
}
