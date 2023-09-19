
import java.util.Random;

public class Password {

    public static <string> void main (String[] args) {

        String[] myNum = {"0","1","2","3","4","5","6","7","8","9"};
        String[] myChar = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v","z"};
        String[] symbols = {"@","#","§","*","+"};

        int totalLength = myNum.length + myChar.length + symbols.length;

        Object[] combinedArray = new Object[totalLength];

        System.arraycopy(myChar, 0, combinedArray, 0, myChar.length);


        System.arraycopy(myNum, 0, combinedArray, myChar.length, myNum.length);


        System.arraycopy(symbols, 0, combinedArray, myChar.length + myNum.length, symbols.length);


        Random random = new Random();



        int numPasswords = 10;
        System.out.println("Password Generata :");
        for (int i = 0; i < numPasswords; i++) {

            int randomIndex = random.nextInt(combinedArray.length);

            System.out.print(combinedArray[randomIndex]);
        }






    }
}
