import java.io.IOException;
import java.util.Scanner;

public class Uri1007 {

    public static void main(String[] args) throws IOException {
        //Init
        Scanner read = new Scanner(System.in);
        //Body
        int A, B, C, D, DIFERENCA;

        A = read.nextInt();
        B = read.nextInt();
        C = read.nextInt();
        D = read.nextInt();

        DIFERENCA = ((A*B)-(C*D));

        System.out.println("DIFERENCA = "+DIFERENCA);
    }

}