import java.util.Random;

public class bet {
    Random Rand;
    int number=0;//global variable
    bet(){
            Rand=new Random();
            tryg();
        }
        void tryg(){
            number=Rand.nextInt(7)+1;
            System.out.println(number);
        }
    }
