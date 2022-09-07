import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um texto: ");
        String texto = in.nextLine();

        boolean x = palindromo(texto);
        if(x){
            System.out.println("É um palindromo!");
        } else {
            System.out.println("Não é um palindromo!");
        }
    }
    public static boolean palindromo (String texto){
        String inverso = inverter(texto);
        return inverso.equalsIgnoreCase(texto);
    }
    public static String inverter(String texto){
        String inverso = "";
        for (int i = texto.length()-1; i>=0;i--){
            inverso +=texto.charAt(i);
        } return inverso;
    }
}
