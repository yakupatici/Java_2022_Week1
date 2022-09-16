public class Main {
    public static void main(String[] args) {
        int numberOne=30;
        int numberTwo = 25;
        int numberThree= 90;
        int moreBigger = numberOne;
        if(moreBigger<numberTwo){
            moreBigger=numberTwo;
        } else if (moreBigger<numberThree) {
            moreBigger=numberThree;
        }
        System.out.println(moreBigger);
    }
}
