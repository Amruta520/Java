import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Welcome to Cab Booking ChatBot");
            System.out.println("\n1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Select 1 or 2: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("\n1. Auto");
                    System.out.println("2. Sedan");
                    System.out.println("3. SUV");
                    System.out.print("Select cab type: ");

                    int cab = sc.nextInt();

                    String cabtype;
                    int rate;

                    switch (cab) {
                        case 1:
                            cabtype = "Auto";
                            rate = 12;
                            break;

                        case 2:
                            cabtype = "Sedan";
                            rate = 18;
                            break;

                        case 3:
                            cabtype = "SUV";
                            rate = 25;
                            break;

                        default:
                            System.out.println("Invalid cab type.");
                            continue;
                    }

                    System.out.println("\n1. Pune Station to Shivajinagar");
                    System.out.println("2. Swargate to Kothrud");
                    System.out.println("3. Hinjawadi to Wakad");
                    System.out.print("Choose route: ");

                    int r = sc.nextInt();

                    String source;
                    String destination;
                    double distance;

                    switch (r) {
                        case 1:
                            source = "Pune Station";
                            destination = "Shivajinagar";
                            distance = 5;
                            break;

                        case 2:
                            source = "Swargate";
                            destination = "Kothrud";
                            distance = 8;
                            break;

                        case 3:
                            source = "Hinjawadi";
                            destination = "Wakad";
                            distance = 10;
                            break;

                        default:
                            System.out.println("Invalid route.");
                            continue;
                    }

                    double fare = rate * distance;

                    System.out.println("\n----- Ride Details -----");
                    System.out.println("Cab Type: " + cabtype);
                    System.out.println("Source: " + source);
                    System.out.println("Destination: " + destination);
                    System.out.println("Distance: " + distance + " km");
                    System.out.println("Rate: Rs. " + rate + " per km");
                    System.out.println("Total Fare: Rs. " + fare);

                    while (true) {
                        System.out.println("\n1. Confirm and Share OTP");
                        System.out.println("2. Cancel Ride");
                        System.out.print("Enter your choice: ");

                        int c = sc.nextInt();

                        if (c == 1) {
                            int otp = 1234;

                            System.out.print("Enter OTP: ");
                            int notp = sc.nextInt();

                            if (notp == otp) {
                                System.out.println("Ride booking successful!");
                                break;
                            } else {
                                System.out.println("Invalid OTP. Try again.");
                            }

                        } else if (c == 2) {
                            System.out.println("Ride is cancelled.");
                            break;

                        } else {
                            System.out.println("Invalid choice. Try again.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Thank you for visiting");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Enter 1 or 2.");
            }
        }
    }
}
