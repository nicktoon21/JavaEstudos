import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //Body
        int a,b;
        float c;

        //Init
        Scanner read = new Scanner(System.in);

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextFloat();

        System.out.printf("NUMBER = %d\n",a );
        System.out.printf("SALARY = U$ %.2f\n ", b * c);
    }

}