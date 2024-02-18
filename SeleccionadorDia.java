import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class SeleccionadorDia {

    public int diaScanner;
    ArrayList<String> diasSemana = new ArrayList<>
            (Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));


    public String obtenerNumeroDia(){
        boolean validar = false;
        Scanner scanner = new Scanner(System.in);

        while (validar == false) {
            System.out.println("Ingrese un número del 1 al 7, donde:\n " +
                    "Lunes = 1 \n " +
                    "Martes = 2 \n " +
                    "Miercoles = 3 \n " +
                    "Jueves = 4 \n " +
                    "Viernes = 5 \n " +
                    "Sabado = 6 \n " +
                    "Domingo = 7");
            this.diaScanner = scanner.nextInt();
            if (this.diaScanner < 1 || this.diaScanner > 7) {
                System.out.println("El numero ingresado no está dentro del rango de 1 a 7.");
            } else validar = true;
        }
        scanner.close();
        return diasSemana.get(this.diaScanner - 1); //-1 para coincidir con el index del array.
    }

    //método que compara el día ingresado +1 con el index del array correspondiente.
    public String obtenerDiaSiguiente(String diaActual) {
        int diaManana = (diasSemana.indexOf(diaActual) + 1) % diasSemana.size(); //modulo para evitar que el index
        // sea mayor a la cantidad del tamano del array.
        return diasSemana.get(diaManana);
    }
}