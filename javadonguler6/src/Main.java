import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number= input.nextInt();
        int i=0,b=0,c;
        int a=number;

        while (a!=0)
        {
          a/=10;
          i++;
          c=a%10;
          b=b+c;
            
             }
        b=b+number%10;
            System.out.println(b);

        }


}
