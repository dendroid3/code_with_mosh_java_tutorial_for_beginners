import java.util.Scanner;

public class Grades {
    private static class Unit {
        String name;
        int marks;
        char grade;
        Unit(String name, int marks, char grade) {
            this.name = name;
            this.marks = marks;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        // User to enter their name:
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String studentName = userInput.nextLine().trim();

        System.out.print("Enter your course: ");
        String courseName = userInput.nextLine().trim();

        System.out.print("How many units are you taking? ");
        int numberOfUnits = userInput.nextInt();
        userInput.nextLine();

        Unit[] units = getUnitDetails(numberOfUnits, userInput);

        String nameAndCourse = "|\s" + studentName + ":\s" + courseName + " Average: " + calculateAverageMarks(units);
        int nameAndCourseLength = nameAndCourse.trim().length();

        String cardSeparator = "-----------------------------------------------------------------------------------------------------------------------------";

        int cardSeparatorLength = cardSeparator.length();
        int spacesBeforeBoundary = cardSeparatorLength - (nameAndCourseLength) - 1;
        String nameAndCourseLine = nameAndCourse;
        for (int i = 0; i < spacesBeforeBoundary; i++) {
            nameAndCourseLine += "\s";
        }
        nameAndCourseLine += "|";

        String unitsTableHeaderName = "| Unit Name                                                                                       ";
        int unitsTableHeaderNameLength = unitsTableHeaderName.length();
        String unitsTableHeaderMarks = "| Unit Marks ";
        int unitsTableHeaderMarksLength = unitsTableHeaderMarks.length();
        String unitsTableHeaderGrade = "| Unit Grade |";
        int unitsTableHeaderGradeLength = unitsTableHeaderGrade.length();
        String unitsTableHeader = unitsTableHeaderName + unitsTableHeaderMarks + unitsTableHeaderGrade;

        System.out.println("\n\n\n\n\n");
        System.out.println(cardSeparator);
        System.out.println(nameAndCourseLine);
        System.out.println(cardSeparator);
        System.out.println(unitsTableHeader);
        System.out.println(cardSeparator);

        for (Unit unit : units) {
            drawUnitsRow(unitsTableHeaderNameLength, unitsTableHeaderMarksLength, unitsTableHeaderGradeLength, unit);
        }

        System.out.println(cardSeparator);
    }

    public static Unit[] getUnitDetails (int numberOfUnits, Scanner userInput) {
        Unit[] unitDetails = new Unit[numberOfUnits];
        for (int i = 0; i < numberOfUnits; i++) {
            System.out.print("Enter name of unit " + (i + 1) + ": ");
            String unitName = userInput.nextLine();
            System.out.print("Enter marks for " + unitName + ": ");
            int unitMarks = userInput.nextInt();
            userInput.nextLine();
            char unitGrade = determineGrade(unitMarks);

            unitDetails[i] = new Unit(unitName, unitMarks, unitGrade);
        }

        return unitDetails;
    }

    public static char determineGrade (double unitMark) {
        char unitGrade = 'X';
        if (unitMark >= 1 && unitMark <= 40) {
            unitGrade = 'F';
        } else if (unitMark >= 41 && unitMark <= 50) {
            unitGrade = 'D';
        } else if (unitMark >= 50 && unitMark <= 60) {
            unitGrade = 'C';
        }  else if (unitMark >= 60 && unitMark <= 70) {
            unitGrade = 'B';
        }  else if (unitMark >= 71 && unitMark <= 100) {
            unitGrade = 'A';
        }

        return unitGrade;
    }

    public static void drawUnitsRow (int unitsTableHeaderNameLength, int unitsTableHeaderMarksLength, int unitsTableHeaderGradeLength, Unit unitDetails) {
        String unitName = unitDetails.name;
        int unitNameLength = unitName.trim().length();
        String unitNameDisplay = "|\s" + unitName;
        for (int i = 0; i <= ( unitsTableHeaderNameLength - unitNameLength - 3 ) ; i++) {
            unitNameDisplay += "\s";
        }

        String unitMarks = Integer.toString(unitDetails.marks);
        int unitMarksLength = unitMarks.trim().length();
        String unitMarksDisplay = "|\s" + unitMarks;
        for (int i = 0; i <= ( unitsTableHeaderMarksLength - unitMarksLength - 3 ) ; i++) {
            unitMarksDisplay += "\s";
        }

        char unitGrade = unitDetails.grade;
        int unitGradeLength = 1;
        String unitGradeDisplay = "|\s" + unitGrade;
        for (int i = 0; i <=  ( unitsTableHeaderGradeLength - unitGradeLength - 4 ) ; i++) {
            unitGradeDisplay += "\s";
        }

        String unitDetailsRow = unitNameDisplay + unitMarksDisplay + unitGradeDisplay + "|";
        System.out.println(unitDetailsRow);
    }

    public static String calculateAverageMarks (Unit[] unitdetails) {
        double totalMarks = 0;
        for (Unit unit : unitdetails) {
            totalMarks += unit.marks;
        }
        double averageMarks = totalMarks / unitdetails.length;
        char averageGrade = determineGrade(averageMarks);

        return averageMarks + "(" + averageGrade + ")";
    }
}