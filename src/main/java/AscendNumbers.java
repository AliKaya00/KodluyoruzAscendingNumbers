import java.util.Scanner;

public class AscendNumbers {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        a = input.nextInt();
        System.out.println("Please enter number 2: ");
        b = input.nextInt();
        System.out.println("Please enter number 3: ");
        c = input.nextInt();

        if ( a < b && a < c ){
            if ((b<c)){
                System.out.println("a<b<c");
            }else{
                System.out.println(" a< c < b");
            }

        }if ( b <c && b<a ){
            if (c<a){
                System.out.println("b<c<a");

            }else{
                System.out.println("b<a<c");
            }
        }if ((c<a && c < b)){
            if (a<b){
                System.out.println("c<a<b");

            }else {
                System.out.println("c<b<a");
            }
        }


    }

}
