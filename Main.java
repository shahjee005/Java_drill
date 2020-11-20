import java.util.Scanner;

/**
 * Mian
 */
// public class Main {
// public static void main(String[] args) {
// int studentAge = 15;
// double studentGPA = 3.45;
// String studenFirstName = "John";
// String studenLastName = "Doe";
// char studentFirstInitial = "J";
// char studentLaststInitial = "D";
// boolean hasPerfectAttendance = true;

// System.out.println(studentAge);
// System.out.println(studentGPA);
// System.out.println(studenFirstName);
// System.out.println(studenLastName);
// System.out.println(hasPerfectAttendance);
// System.out.println(studenFirstName + " " + studenLastName + "has a GPA of" +
// studentGPA);
// System.out.println("What do you want to update it to?");

// System.out.println("Pick a number between 1 and 10");
// Scanner scanner = new Scanner(System.in);
// int inputtedNum = scanner.nextInt();
// if (inputtedNum < 5) {
// System.out.println("Enjoy the good luck a friend brings you");
// } else {
// System.out.println("Your shoe section will make you so happy today ");

// }
// studentGPA = input.nextDouble();
// System.out.println(studenFirstName + " " + studenLastName + "now has a GPA
// of" + studentGPA);

// While Loop

// Scanner input = new Scanner(System.in);
// boolean isOnRepeat = true;

// while (isOnRepeat) {
// System.out.println("Playing curent song");
// System.out.println("Would you like to off this song of repeat ? if so ,
// answer yes");
// String userinput = input.next();
// if (userinput.equals("yes")) {
// isOnRepeat = false;

// }

// }

// System.out.println("playing next song");
// System.out.println("What is the current temperature outsie";);

public class Main {
    public static void main(String[] args) {
        String question = "What is the current temperature outsie?";
        String choiceOne = "-7C";
        String choiceTwo = "-5C";
        String choiceThree = "-8C";
        String correectAnswer = choiceTwo;

        System.out.println(question);
        System.out
                .println("Choose one of the folowing options:" + choiceOne + "," + choiceTwo + "," + choiceThree + ".");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        // String userinput = input.next();
        if (correectAnswer.equals(input)) {
            System.out.println("congradulations!! Your answer is correct :-)");
        } else {
            System.out.println("You are incorrect !!The correct answer is " + correectAnswer);

        }

    }
}
