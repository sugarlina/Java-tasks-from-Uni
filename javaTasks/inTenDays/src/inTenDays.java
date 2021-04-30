import java.util.Scanner;

public class inTenDays {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();
        int inTenDays=(day+10)%7;
        System.out.println(inTenDays);





    }

}
