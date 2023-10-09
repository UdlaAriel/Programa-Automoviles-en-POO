import java.util.Scanner;

public class tipoA {
    //Definicion de varable con texto por default para campos incompletos
    String estandar = "NO ESTA DEFINIDO";
    public  String getTipoAuto(){
        String tipoAuto;
        int opc;
        Scanner lecturaTipoAutomovil = new Scanner (System.in);
        opc = lecturaTipoAutomovil.nextInt(); //Ingreso de datos

        switch (opc){
            case 1: tipoAuto = "CIUDAD"; break;
            case 2: tipoAuto = "SUBCOMPACTO"; break;
            case 3: tipoAuto = "COMPACTO"; break;
            case 4: tipoAuto = "FAMILIAR"; break;
            case 5: tipoAuto = "EJECUTIVO"; break;
            case 6: tipoAuto = "SUV"; break;
            default: tipoAuto = estandar;
        }

        return tipoAuto; //Color retornado a "Main"
    }
}
