import java.util.Scanner;

/**
 * Mian
 */
public class Mian {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        String studenFirstName = "John";
        String studenLastName = "Doe";
        // char studentFirstInitial = "J";
        // char studentLaststInitial = "D";
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studenFirstName);
        System.out.println(studenLastName);
        System.out.println(hasPerfectAttendance);
        System.out.println(studenFirstName + " " + studenLastName + "has a GPA of" + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studenFirstName + " " + studenLastName + "now has a GPA of" + studentGPA);
    }
}