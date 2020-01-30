import java.io.IOException;
import java.util.Scanner;

public class Uri1005 {

    public static void main(String[] args) throws IOException {
        //Init
        Scanner read = new Scanner(System.in);
        //Body
        System.out.println("Informe A primeira variavel:");
        double A = read.nextDouble();
        System.out.println("Informe A segunda variavel:");
        double B = read.nextDouble();

        double MEDIA = ((A*3.5) + (B*7.5)) / 11.0;

        System.out.printf("MEDIA = %.2f %n",MEDIA);
    }

}