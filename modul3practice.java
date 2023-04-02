package codelab;
import java.util.Scanner;

public class modul3practice extends converter  {
    public double value;
    Scanner input =  new Scanner(System.in);

    public double getValue() {
        return value;
    }

    public void setValue(double value, String params) {
        
        switch(params){
            case "1" -> {
                this.value = setValuetoM(value);
            }
            case "2" -> {
                this.value = setValuetoCM(value);
            } 
            case "3" -> {
                this.value = setValuetoFeet(value);
            }
            case "4" -> {
                this.value = setValuetoMiles(value);
            }
             
            
        
    }}
    
    
    public static void main(String[] args) {
        modul3practice mod = new modul3practice();
        Scanner input = new Scanner(System.in);
        String pilihbg = null;
        int jalan = 0;
       
        System.out.println("Yard converter to M, CM, Feet, Miles");
        System.out.println("1. Yard to M");
        System.out.println("2. Yard to CM");
        System.out.println("3. Yard to Feet");
        System.out.println("4. Yard to Miles");
        do{
        
        System.out.print("Masukkan pilihan: ");
        pilihbg = input.next();
        if(pilihbg.equals("1")||pilihbg.equals("2")||pilihbg.equals("3")||pilihbg.equals("4")){
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt() ;
        mod.setValue(angka, pilihbg);
        System.out.println("Hasil: " + mod.getValue() );
        System.out.print("Ingin mengulang?(1/0): ");
        jalan = input.nextInt();
        if(jalan!=1){
            System.out.println("Terimakasih telah menggunakan aplikasi kami");
            break;
        }
        } else {
            System.out.println("Fitur tidak  tersedia");
        }
        }while(jalan==1);
        
    }
}