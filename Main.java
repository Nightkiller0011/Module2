import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // System.out.println("Hello World");
    Character c1 = new Character("Darius", "Paladin", "Human");
    // create an object of Scanner
    Scanner input = new Scanner(System.in);

    Party p = new Party("Explorers", 5);
    
    System.out.println(p.toString());
    int menu = 1;
    while (menu != 0){
        System.out.println("\nMenu\n-----------------\n0. Quit\n1. Add Existing\n2. Add New Character\n3. Delete Character\n4. Display Party\n");
        

        // take input from the user
        menu = input.nextInt();

        if (menu == 1) {
            p.addToParty(c1);
            p.addToParty(new Character("Stougne", "Warlock", "Human"));
            p.addToParty(new Character("Ion", "Warlock", "Shadow"));
            p.addToParty(new Character("Oscer", "Bard", "Human"));
            p.addToParty(new Character("DeWarn", "Fighter", "Dwarf"));
        }
        else if (menu == 2) {
            System.out.println("Name: ");
            String name = input.next();
            System.out.println("Class: ");
            String classX = input.next();
            System.out.println("Race: ");
            String race = input.next();
            p.addToParty(new Character(name, classX, race));
        }
        else if (menu == 3) {
            System.out.println("Name: ");
            String name = input.next();
            // p.removeFromParty(name);
        }
        else if (menu == 4) {
            System.out.println(p);
        }
    }
  }
}
