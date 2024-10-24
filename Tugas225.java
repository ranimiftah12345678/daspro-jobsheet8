import java.util.Scanner;
    public class Tugas225 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String namaAtlet;
    while (true) {
    System.out.println("SELAMAT DATANG DIPORSENI POLITEKNIK NEGERI MALANG 2024!");
    System.out.println("========================================================");
    System.out.print("Masukkan nama politeknik (Ketik 'exit' untuk selesai) = ");
    String namaPoliteknik = sc.nextLine();
    if(namaPoliteknik.equalsIgnoreCase("exit")) {
    System.out.println("Terima kasih telah menggunakan program ini!");
    break;
    }
    System.out.println("Nama atlet " + namaPoliteknik 
    + " cabor badminton");
    for (int i = 1; i <= 5; i++) {
    System.out.print("Nama atlet ke-" + i + " = ");
    namaAtlet = sc.nextLine();
    }
    System.out.println("Nama atlet " + namaPoliteknik 
    + " cabor tenis meja");
    for (int i = 1; i <= 5; i++) {
    System.out.print("Nama atlet ke-" + i + " = ");
    namaAtlet = sc.nextLine();
    }
    System.out.println("Nama atlet " + namaPoliteknik 
    + " cabor basket");
    for (int i = 1; i <= 5; i++) {
    System.out.print("Nama atlet ke-" + i + " = ");
    namaAtlet = sc.nextLine();
    }
    System.out.println("Nama atlet " + namaPoliteknik 
    + " cabor bola voly");
    for (int i = 1; i <= 5; i++) {
    System.out.print("Nama atlet ke-" + i + " = ");
    namaAtlet = sc.nextLine();
    }
    }
    
    }
    }

