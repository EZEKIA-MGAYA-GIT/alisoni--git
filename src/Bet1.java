import java.util.Random;

public class Bet1 {
    Bet1(){//constructures
        Random land=new Random();
        int number=0;
        elison(land,number);//use random and number as an argument instead of use global value
    }
    void elison(Random land,int number){
        number=land.nextInt(6)+2;
        System.out.println(number);
    }
}
