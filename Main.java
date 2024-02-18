
public class Main {
    public static void main(String[] args) {
        SeleccionadorDia seleccionadorDia = new SeleccionadorDia();

        String diaIngresado = seleccionadorDia.obtenerNumeroDia();
        String diaManana = seleccionadorDia.obtenerDiaSiguiente(diaIngresado);
        System.out.println("El día siguiente es: " + diaManana);
    }
}