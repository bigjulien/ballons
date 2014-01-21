package algorithmes;

import java.util.Random;

public class Aleatoire {
    public static String randomLetter(){
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'A');
        return Character.toString(c);
    }
    
    public static boolean randomColumn(){
        Random r = new Random();
        boolean i = r.nextBoolean();
        return i;
    }
    
    
}
