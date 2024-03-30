import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & (n-1))==0) { //побитовая конъюнкция
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}