import java.util.Scanner;

public class Autos {
    String marca;
    String color;
    String combustible;
    String tipoAutomovil;
    int modelo;
    int motor;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    int velocidadActual;

    public String Imprimir(){

        String informacion = "\nMarca: " + this.marca +
                            "\nModelo: "  + this.modelo +
                            "\nMotor: #" + this.motor +
                            "\nTipo combustible: " + this.combustible +
                            "\nTipo automovil: " + this.tipoAutomovil +
                            "\nNumero de puertas: " + this.numeroPuertas +
                            "\nCantidad de asientos: " + this.cantidadAsientos +
                            "\nVelocidad maxima: " + this.velocidadMaxima + " KM/H" +
                            "\nColor: " + this.color +
                            "\nVelocidad actual: " + this.velocidadActual + " KM/H";
        return informacion;
    }

    public void Descripcion(Autos automovil){

        //Instancia de clases
        tipoColor color = new tipoColor();
        tipoA claseAuto = new tipoA();
        tipoCom claseCombustible = new tipoCom();

        Scanner lecturaMarc = new Scanner (System.in);
        Scanner lecturaModelo = new Scanner (System.in);
        Scanner lecturaMotor = new Scanner (System.in);
        Scanner lecturaPuertas = new Scanner (System.in);
        Scanner lecturaAsientos = new Scanner (System.in);
        Scanner lecturaVMaxima = new Scanner (System.in);
        Scanner lecturaVActual = new Scanner (System.in);

        System.out.print("\nIngrese la MARCA del vehículo: ");
        automovil.marca = lecturaMarc.next();
        System.out.print("Ingrese el MODELO del vehículo (ej. 2018): ");
        automovil.modelo = lecturaModelo.nextInt();
        System.out.print("Ingrese el numero de MOTOR del vehículo: ");
        automovil.motor = lecturaMotor.nextInt();
        System.out.print("Seleccione el tipo de combustible: \n1. GASOLINA\n2. BIOETANOL\n3. DIESEL\n4. BIODIESEL\n5. GAS_NATURAL\nElija el NUMERO correspondiente: ");
        automovil.combustible = claseCombustible.getTipoCombustible();
        System.out.print("Seleccione el tipo de automovil: \n1. CIUDAD\n2. SUBCOMPACTO\n3. COMPACTO\n4. FAMILIAR\n5. EJECUTIVO\n6. SUV\nElija el NUMERO correspondiente: ");
        automovil.tipoAutomovil = claseAuto.getTipoAuto();
        System.out.print("Ingrese el numero de PUERTAS del vehículo: ");
        automovil.numeroPuertas = lecturaPuertas.nextInt();
        System.out.print("Ingrese el numero de ASIENTOS del vehículo: ");
        automovil.cantidadAsientos = lecturaAsientos.nextInt();
        System.out.print("Ingrese la VELOCIDAD ACTUAL del vehículo: ");
        automovil.velocidadActual = lecturaVActual.nextInt();
        System.out.print("Ingrese la VELOCIDAD MAXIMA del vehículo: ");
        automovil.velocidadMaxima = lecturaVMaxima.nextInt();
        System.out.print("Seleccione el COLOR del vehículo: \n1) BLANCO  2) NEGRO  3) ROJO  4) NARANJA\n5) AMARILLO  6) VERDE  7) AZUL  8) VIOLETA\nElija el NUMERO correspondiente: ");
        automovil.color = color.getTipoColor();
    }

}
