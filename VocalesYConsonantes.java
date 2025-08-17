import java.util.Scanner;

public class VocalesYConsonantes {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero de palabras minusculas ");
        String palabra = sc.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
          char letra = palabra.charAt(i) ;
          
            
           if (letra == 'a'||letra == 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u') {
            vocales++;

           } else {
                  consonantes++;

           }
           
        }

        System.out.println("Numero de vocales: " + vocales);
        System.out.println("Numero de consonates:" + consonantes );
        sc.close();
        
    }
}
