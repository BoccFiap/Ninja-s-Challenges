package secondChallenge;

import java.util.Scanner;

public class Challenge2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int maximumNumber = 10;
    String[] ninjas = new String[maximumNumber];

    int ninjaCount = 0;
    int choice = 0;

    while (choice != 4) {
      System.out.println("\n===== Ninja Menu =====");
      System.out.println("1. Register Ninja");
      System.out.println("2. List Ninjas");
      System.out.println("3. Delete Ninja");
      System.out.println("4. Exit");
      System.out.print("Choose an option: ");
      choice = scan.nextInt();
      scan.nextLine(); // consume newline

      switch (choice) {
        case 1:
          if (ninjaCount < maximumNumber) {
            System.out.print("Enter the ninja's name to register: ");
            String ninjaName = scan.nextLine();
            ninjas[ninjaCount] = ninjaName;
            ninjaCount++;
            System.out.println("Ninja " + ninjaName + " has been registered.");
          } else {
            System.out.println("Ninja list is full.");
          }
          break;

        case 2:
          if (ninjaCount == 0) {
            System.out.println("No ninjas found.");
          } else {
            System.out.println("========= List of Ninjas =========");
            for (int i = 0; i < ninjaCount; i++) {
              System.out.println(i + " - " + ninjas[i]);
            }
          }
          break;

        case 3:
          System.out.print("Enter the index of the ninja to delete: ");
          int indexToRemove = scan.nextInt();
          scan.nextLine(); // consume newline

          if (indexToRemove < 0 || indexToRemove >= ninjaCount) {
            System.out.println("Invalid index.");
            break;
          }

          // Create a new array with one less element
          String[] newNinjas = new String[ninjas.length];
          for (int i = 0, j = 0; i < ninjaCount; i++) {
            if (i != indexToRemove) {
              newNinjas[j++] = ninjas[i];
            }
          }

          ninjas = newNinjas;
          ninjaCount--;

          System.out.println("Ninja successfully removed.");
          System.out.println("========= Updated Ninja List =========");
          for (int i = 0; i < ninjaCount; i++) {
            System.out.println(i + " - " + ninjas[i]);
          }
          break;

        case 4:
          System.out.println("Exiting program...");
          break;

        default:
          System.out.println("This option is not valid.");
      }
    }

    scan.close();
  }
}
