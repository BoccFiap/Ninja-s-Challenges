package thirdChallenge;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Uchiha ninja = new Uchiha();

    int maximumNumber = 10;
    Uchiha[] ninjaList = new Uchiha[maximumNumber];

    int ninjaCount = 0;
    int choice = 0;

    while(choice != 4){
      System.out.print(
        "\nMenu\n" +
          "1 - Show all ninja information\n" +
          "2 - Add new ninja\n" +
          "3 - Update special ability\n" +
          "4 - Exit\n" +
          "Choose an option: "
      );
      choice = scan.nextInt();
      scan.nextLine();

      switch(choice) {
        case 1:
          if (ninjaCount == 0){
            System.out.println("\nNo ninjas found.");
          } else {
            System.out.print("\n--- Ninja List ---");
            for (int i = 0; i < ninjaCount; i++) {
              System.out.printf("%nNinja %d%n", i + 1);
              ninjaList[i].ShowInformation();
              ninjaList[i].ShowSpecialAbility();
            }
          }
          break;

        case 2:
          System.out.println("\n--- Ninja Registration ---");
          System.out.print("Enter the ninja's name: ");
          ninja.name = scan.nextLine();

          System.out.print("Enter the ninja's age: ");
          ninja.age = scan.nextInt();
          scan.nextLine();

          System.out.print("Enter the ninja's mission: ");
          ninja.mission = scan.nextLine();

          System.out.print("Enter the mission difficulty: ");
          ninja.difficultyLevel = scan.nextLine();

          System.out.print("Enter the mission status: ");
          ninja.statusLevel = scan.nextLine();

          System.out.print("Enter the ninja's special ability: ");
          ninja.specialAbility = scan.nextLine();

          System.out.println("Ninja successfully created!");

          ninjaList[ninjaCount] = ninja;
          ninjaCount++;

          break;

        case 3:
          System.out.println("\n--- Update Special Ability ---");
          if (ninjaCount == 0){
            System.out.println("No existing ninjas.");
            break;
          }

          for (int i = 0; i < ninjaCount; i++) {
            System.out.printf("%n%d - %s%n", i, ninjaList[i].name);
            ninjaList[i].ShowSpecialAbility();
          }

          System.out.print("\nEnter the number of the ninja to update: ");
          int index = scan.nextInt();
          scan.nextLine();

          if (index < 0 || index >= ninjaCount){
            System.out.println("Invalid index!");
            break;
          }

          System.out.print("Enter the new special ability: ");
          String newAbility = scan.nextLine();

          ninjaList[index].specialAbility = newAbility;

          System.out.println("Special ability updated successfully!");
          System.out.println("--- Updated Information ---");
          ninjaList[index].ShowInformation();
          ninjaList[index].ShowSpecialAbility();

          break;
      }
    }

    System.out.println("Exiting program!");
  }
}
