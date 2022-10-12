import java.util.ArrayList;

public class Party{
  private ArrayList<Character> characters;
  private String name;
  private int maxSize;

  public Party(String name, int maxSize) {
    this.name = name;
    this.maxSize = maxSize;
    characters = new ArrayList<>();
  }

  public void addToParty(Character character) {
    if (characters.size()==maxSize) {
      System.out.println("Full!");
      return;
    }
    characters.add(character);
    System.out.println("Welcome to the " + name + " Party!");
  }

  public String toString() {
    String result = name + ": [ ";
    for (Character character : characters) {
      result += character.getName() + ", ";
    }
    result += "]";
    return result;
  }
  // public void removeFromParty(Character character) {
  //   boolean result = character.remove(character);
  //   if (!result) {
  //       System.out.println("Character was not in the Party.");
  //   } else {
  //       System.out.println("Character removed from the Party.");
  //   }
  // }
}