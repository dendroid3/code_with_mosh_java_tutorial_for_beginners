import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        byte age = 30;
        long youtubeViewsCount = 3_234_343_434L;
        float price = 34.43F;
        char letter = 'A';
        boolean isEligible = true;
        Date now= new Date();

        System.out.println("Date today is: " + now.toString());

        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 5;

        System.out.println("Point 1 is " + point1.toString());
        System.out.println("Point 2 is " + point2.toString());

        String message = new String("Hello Sunday");

        System.out.println(message);

        String newMessage = new String("Hello There");
        System.out.println(newMessage);

        boolean endsWith = newMessage.endsWith("e");
        System.out.println(endsWith);

        boolean startsWith = newMessage.startsWith("e");
        System.out.println(startsWith);

        int lengthOfMessage = newMessage.length();
        System.out.println(lengthOfMessage);

        escapeSequences();
    }

    public static void escapeSequences () {
        String quoteMessage = "Hello \"Sire\"";
        System.out.println(quoteMessage);

        String backSlash = "C:\\\\Windows\\User\\Home";
        System.out.println(backSlash);

        String newLine = "Hello\nWorld";
        System.out.println(newLine);

        String tabLine = "Hello\tWorld";
        System.out.println(tabLine);

        arrays();
    }

    public static void arrays () {
        int[] numbers = {4,52,57,23,6,24,0,44,232,45,7,32,45,78,98};

        System.out.println(numbers[2]);

        String allNumbers = Arrays.toString(numbers);
        System.out.println("The numbers in the array are " + allNumbers);

        int numberOfItemsInArray = numbers.length;
        System.out.println(numberOfItemsInArray);

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        multiDimensionalArrays();
    }

    public static void multiDimensionalArrays () {
        int[][][] numbers = new int[2][2][2];
        numbers[0][0][0] = 1;
        numbers[0][1][0] = 2;
        numbers[1][0][0] = 3;
        numbers[1][1][0] = 4;

        System.out.println(Arrays.deepToString(numbers));

        final boolean IMALIVE = true;
        System.out.println(IMALIVE);

        arithmeticExpressions();
    }

    public static void arithmeticExpressions () {

    }
}