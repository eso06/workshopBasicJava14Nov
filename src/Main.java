//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Biodata{ //ini class
    String nama;
    String hobi;
    int umur;

    Biodata(String nama, String hobi, int umur){
        this.nama = nama; //ini constructor
        this.hobi = hobi;
        this.umur = umur;

    }
    public static int test(){
        return 100;
    }

    public static void coba(int a){
        if (a==7)
            System.out.println("ok testcoba");
    }

     void menyapa(){//ini fungsi
        System.out.println("Halo saya " + nama);
    }

}

public class Main {
    public static void main (String [] args) {
        Biodata dataSaya = new Biodata ("Adi", "mancing",30);
        dataSaya.menyapa();
        System.out.println(dataSaya.hobi);
        System.out.println(dataSaya.test());
    }


        /* String nama ="Petrus";

        System.out.println(nama);
        System.out.println("Nama saya bukan "+nama);
        */
//        int a = 24;
//        int b = 16;
//
//        int kurang = a - b;
//        int kali = a * b;
//
//        System.out.println(a + b);
//        System.out.println(kurang);
//        System.out.println(kali);

        //Operator Logika AND OR NOT

//        System.out.println("OR " + (true || true));
//        System.out.println("OR " + (true || false));
//        System.out.println("OR " + (false || true));
//        System.out.println("OR " + (false || false));
//
//        System.out.println("AND "+ (true && true));
//        System.out.println("AND "+ (true && false));
//        System.out.println("AND "+ (false && true));
//        System.out.println("AND "+ (false && false));
//
//        System.out.println("NOT " + (!false));
//        System.out.println("NOT " + (!true));
//
//        System.out.println(true && !(true || false));
//        boolean makan = true;
//        boolean minum = false;
//
//        boolean aturan = makan || minum;
//        System.out.println(makan && minum);
//        System.out.println(aturan);
    // perbandingan < > = <= >=

//        int a = 30;
//        int b = 31;
//
//        System.out.println("lebih besar 30 dari 31 = " + (a>b));
//        System.out.println("lebih kecil 30 dari 31 = " + (a<b));

//        if else
//        int saldo = 500;
//        int tarik = 600;


//        if (tarik < saldo){
//            System.out.println("Saldo berhasil ditarik, silakan belanja. BELI BELI BELI");
//        }else {
//            System.out.println("Saldo sudah habis. Lanjutkan kerja lagi");
//        }
//        int saldo = 2000;
//        int tarik = 1900;
//
//        if (tarik < saldo){
//            System.out.println("Saldo berhasil ditarik, silakan belanja. BELI BELI BELI");
//        }else if (tarik > 1000 && tarik < saldo){
//            System.out.println("Bangun dari tidurmu. saldomu masi kurang");
//        }else {
//            System.out.println("Saldo anda kurang. ayo kerja lagi");
//        }

        // perulangan

//        int cek = 1;
//        while (cek <= 10){
//            System.out.println("looping");
//
//            cek = cek +1;
//        }
        //kalo case processnya stop manually dari sisi user/conditional, maka pake while

//        for (int i = 1;i<=10;i++){
//            System.out.println("looping gan "+i);
//        }
//kalo case datanya ada index, maka pake for

        //input data
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input namamu : ");
//        String nama = scanner.nextLine();
//
//        System.out.println("Halo "+nama+ "~");
//
//        if (nama.equals("hehehe")){
//            System.out.println("Becanda terus! ");
//        }else {
//            System.out.println("Pa kabar pren?");
//        }
//        scanner.close();

        //study case

//        buat calculator  yang bisa menerima input
//        int a
//        int b
////        char operator
//        while
//            lanjut? y t
//            terima kasih

        //DRY Dont repeat yourself


//    public static void calculate(int number1, int number2, String operation) {
//        //void artinya ga ngembaliin apa2
//        if (operation.equals("+")){
//            System.out.println("Ini dia hasilnya = "+(number1 + number2));
//
//        }else if (operation.equals("-")){
//            System.out.println("Ini dia hasilnya = "+(number1 - number2));
//
//        }
//        else if (operation.equals("/")){
//            System.out.println("Ini dia hasilnya = "+(number1 / number2));
//        }
//        else if (operation.equals("%")){
//            System.out.println("Ini dia hasilnya = "+(number1 % number2));
//
//        }
//        else if (operation.equals("*")){
//            System.out.println("Ini dia hasilnya = "+(number1 * number2));
//
//        }
//        else {
//            System.out.println("Inputanmu salah! Bhay!");
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner1  = new Scanner(System.in);
//        Scanner scanner2  = new Scanner(System.in);
//        boolean kondisi = true ;
//
//        while(kondisi){
//            System.out.println("Input angka 1 : ");
//            int number1 = scanner1.nextInt();
//
//            System.out.println("Input angka 2 : ");
//            int number2 = scanner1.nextInt();
//            //int number2 = Integer.parseInt(scanner.nextLine());
//
//            System.out.println("Input operator : ");
//            String operation = scanner2.nextLine();
//            calculate (number1, number2, operation);
//            kondisi=false;
//
//            }
//            scanner1.close();
//            scanner2.close();
//
//
//
//        }



    }