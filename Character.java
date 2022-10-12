public class Character {

    // Member data / attributes
    private String name;
    private String classX;
    private String race;
  
    /* Constructor */
    public Character(String name, String classX, String race) {
      this.name = name;
    }
  
          
    public void showName() {
      System.out.println(name + ": Hello");
      this.printMessage("Hello!");
    }
  
    public void printMessage(String message) {
      System.out.println(name + ": " + message);
    }
  
    public String getName() {
      return name;
    }
  
    public String getClassX() {
      return classX;
    }
  
    public String getRace() {
      return race;
    }
  
  }