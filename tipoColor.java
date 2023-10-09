import java.util.Scanner;
public class tipoColor {
    //Definicion de varable con texto por default para campos incompletos
    String estandar = "NO ESTA DEFINIDO";
    public  String getTipoColor(){
        String tipo;
        int opc;

        Scanner lecturaColor = new Scanner (System.in);
        opc = lecturaColor.nextInt(); //Ingreso de datos

        switch (opc){
            case 1: tipo = "BLANCO"; break;
            case 2: tipo = "NEGRO"; break;
            case 3: tipo = "ROJO"; break;
            case 4: tipo = "NARANJA"; break;
            case 5: tipo = "AMARILLO"; break;
            case 6: tipo = "VERDE"; break;
            case 7: tipo = "AZUL"; break;
            case 8: tipo = "VIOLETA"; break;
            default: tipo = estandar;
        }

        return tipo; //Color retornado a "Main"
    }

}
