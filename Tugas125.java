import java.util.Scanner;

public class Tugas125 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan N = ");
int N = sc.nextInt();

if (N < 3) {
  System.out.println();
}
for(int i = 1; i <= N; i++) {
for(int j = 1; j <= N; j++) {
  if (i == 1 || i == N || j == 1 || j == N) {
System.out.print(N + " ");
} else {
System.out.print(" ");
}
}
System.out.println();
}
}
} 

