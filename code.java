import java.util.Scanner;

public class Library {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String[] books = {
            "Basics of Java Programming",
            "Python fun",
            "Data Structures",
            "Machine Learning",
            "Artificial Intelligence",
            "Database Management"
        };

        String[] domain = {
            "Programming",
            "Programming",
            "Programming",
            "AI",
            "AI",
            "Database"
        };

        System.out.println(" Hello! Welcome to the Library");

        for (;;) {

            System.out.println("\nDo you want Books or Other Files?");
            
            System.out.println("1. Books Domain");
            
            System.out.println("2. Other Files");
            
            System.out.println("3. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("\n BOOK DOMAINS ");
                
                System.out.println("1. Programming");
                
                System.out.println("2. AI");
                
                System.out.println("3. Database");

                System.out.print("Enter domainchoice: ");
                int domainChoice = sc.nextInt();
                sc.nextLine();

                String selectedDomain;

                if (domainChoice == 1) {
                    selectedDomain = "Programming";
                    System.out.println("We Have -  Java Programming (Not issued) , Python fun (Not issued) , Data Structures(Issued)");
                }

                else if (domainChoice == 2) {
                    selectedDomain = "AI";
                    System.out.println("We Have - Machine Learning (Not issued) ,Artificial Intelligence (Not issued)");
                }

                else if (domainChoice == 3) {
                    selectedDomain = "Database";
                    System.out.println("We Have - Database Management (issued)");
                }

                else {
                    System.out.println("Invalid domain no book available for this Domain.");
                    continue;
                }

                System.out.print("\nEnter the book  you want to issue: ");
                String book = sc.nextLine();

                if (book.equals("Java Programming")) {
                    System.out.println(" java Programming  is availabe , (issued)");
                }

                else if (book.equals("Python fun")) {
                    System.out.println(" Python fun is availabe , (issued)");
                }

                else if (book.equals("Data Structure")) {
                    System.out.println(" Sorry ,Data Structure is not availabe ");
                }

                else if (book.equals("Machine Learning")) {
                    System.out.println(" Machine Learning is availabe , (issued) ");
                }

                else if (book.equals("Artifical Intelligence")) {
                    System.out.println("Artifical Intelligence is availabe, (issued)");
                }
                    else if (book.equals("Database Management")) {
                        System.out.println("Database Management is availabe , (issued)");
                    }

                else {
                    System.out.println("Invalid request made by user!! , please check ");
                }
                System.out.println("Book is issued , return time is 15 Days , return it on time!!");

                  
            }


            else {

                System.out.println("Not Availabe this time !!");
            }
        }
    }
}
