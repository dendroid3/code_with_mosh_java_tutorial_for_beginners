import java.awt.*;
import java.text.NumberFormat;
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
        int firstNumber = 1;
        int secondNumber = 2;

        int additionResult = firstNumber + secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + "=" + additionResult);

        int subtractionResult = firstNumber - secondNumber;
        System.out.println(firstNumber + "-" + secondNumber + "=" + subtractionResult);

        int multiplicationResult = firstNumber * secondNumber;
        System.out.println(firstNumber + "*" + secondNumber + "=" + multiplicationResult);

        float divisionResult = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + "/" + secondNumber + "=" + divisionResult);

        int modulusResult = firstNumber % secondNumber;
        System.out.println(firstNumber + "%" + secondNumber + "=" + modulusResult);

        casting();
    }

    public static void casting() {
        // Basically changing one variable type to another.
        // Implicit casting - Automatic conversion, happens when changing a smaller
        // variable type to a larger type.
        // byte -> short -> int -> long
        // Implicit casting happens when there will be no data loss;

        short x = 3; // two bytes
        int y = x + 5; // two bytes
        // ^ What happened under the hood is that the short was converted to an integer
        System.out.println(x);

        // In explicit casting, one has to specify the data type as such:
        double z = 1.1;
        int z1 = (int) z + 4;
        // ^ The double z is turned into an int by truncating the decimal points
        System.out.println(z1);

        // Note: You cannot cast a string into an integer
        // One should use wrapper types. // .parseSomeDataType
        // Parsing is helpful since most UIs pass parameters as the String type
        String string = "15";
        int newInteger = Integer.parseInt(string);
        System.out.println(newInteger);

        math();
    }

    public static void math() {
        float x = 1.6F;
        float y = x + 5;
        int roundedFloat = Math.round(x);
        System.out.println(x + " rounded off is " + roundedFloat);
        double ceilFloat = Math.ceil(x);
        System.out.println("The ceil of " + x + " is " + ceilFloat);
        double floorNumber = Math.floor(x);
        System.out.println("The floor of " + x + " is " +  floorNumber);
        float maxNumber = Math.max(x, y);
        System.out.println("The maximum number between " + x + " and " + y + " is " + maxNumber);
        double randomNumber = (int) (Math.random()*100);
        System.out.println("We have generated a random number " + randomNumber);

        formatNumbers();
    }

    public static void formatNumbers () {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(2323.45));

        NumberFormat percentage = NumberFormat.getPercentInstance();
        System.out.println(percentage.format(0.4));
    }
}