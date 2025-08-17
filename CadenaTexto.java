import java.util.Scanner;

public class CadenaTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String textoOriginal = scanner.nextLine();

        String textoInvertido = invertirCadenaManual(textoOriginal);

        System.out.println("Cadena invertida: " + textoInvertido);
    }

    public static String invertirCadenaManual(String cadena) {
        String resultado = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i); 
        }

        return resultado;
    }
}
