public class Main {
    public static void main(String[] args) {
        int number = 1;


        boolean isPrime = true;

        if (number<2){
            System.out.println("Geçersiz sayı");
        }

        for (int i = 2 ; i< number; i++){
            if (number %2 == 0){
                isPrime = false;
            }

        }
        if (isPrime){
            System.out.println("Sayı asaldır");


        }
        else
            System.out.println("Asal DEĞİLDİR");
    }
}
