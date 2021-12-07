package HW6.Q2;
import java.lang.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) {
    DrivingLicenseApplication application = new DrivingLicenseApplication();
        try {
            application.testDriver();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testDriver() throws Exception {
        System.out.println("Enter Drivers Birth date in format MM/DD/YYYY");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String birthday[] = myObj.nextLine().split("/");
        int year = Integer.parseInt(birthday[2]);
        int month = Integer.parseInt(birthday[1]);
        int day = Integer.parseInt(birthday[0]);

        Date dateNow = new Date();
        Date dateOfBirth = new GregorianCalendar(year, month, day).getTime();
        int difference = (int) ChronoUnit.DAYS.between(dateOfBirth.toInstant(), dateNow.toInstant());
        int age = difference / 365;
        if (365 * 16 > difference) {
            throw new Exception("The age of the applicant is " + age + " which is too early to apply for a driving license.");
        }
        System.out.println("The age of the applicant is " + age + " which is OK to apply for a driving license.");
    }
}
