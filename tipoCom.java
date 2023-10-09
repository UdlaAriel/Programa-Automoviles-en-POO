import java.util.Scanner;
public class tipoCom {
    //Definicion de varable con texto por default para campos incompletos
    String estandar = "NO ESTA DEFINIDO";
    public String getTipoCombustible(){
        String tipoCombustible;
        int opc;

        Scanner lecturaTipoCombustible = new Scanner (System.in);
        opc = lecturaTipoCombustible.nextInt(); //Ingreso de datos

        switch (opc){
            case 1: tipoCombustible = "GASOLINA"; break;
            case 2: tipoCombustible = "BIOETANOL"; break;
            case 3: tipoCombustible = "DIESEL"; break;
            case 4: tipoCombustible = "BIODIESEL"; break;
            case 5: tipoCombustible = "GAS_NATURAL"; break;
            default: tipoCombustible = estandar;
        }

        return tipoCombustible;
    }

}
