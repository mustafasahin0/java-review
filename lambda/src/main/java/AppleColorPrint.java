public class AppleColorPrint implements ApplePrettyPrint {
    @Override
    public String print(Apple apple) {
      String characteristic = apple.getWeight() > 150 ? "Heavy" : "Light";
      return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
