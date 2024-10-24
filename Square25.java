import java.util.Scanner;

public class Square25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai N= ");
        
        int N = sc.nextInt();
        for(int iOuther=1; iOuther<=N; iOuther++){
        for(int i=1; i<=N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
