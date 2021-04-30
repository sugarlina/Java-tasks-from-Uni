import java.util.Scanner;

public class power {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        double number=scanner.nextDouble();
        double power=scanner.nextDouble();
        System.out.println(Math.pow(number, power));

    }
}
