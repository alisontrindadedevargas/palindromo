import java.util.Scanner;

public class palindromoNovo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um texto: ");
        String texto = in.nextLine();
        StringBuilder text = new StringBuilder(texto);
        String textoNovo = text.reverse().toString();

        System.out.println(textoNovo);

        if (textoNovo.equalsIgnoreCase(texto)){
            System.out.println("palindromo");
        }else{
            System.out.println("não");
        }
    }
}
