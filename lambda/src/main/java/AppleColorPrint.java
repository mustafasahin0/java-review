public class AppleColorPrint implements ApplePrettyPrint{
    @Override
    public String print(Apple apple) {
        if(apple.getWeight()<200) return "A Light " + apple.getColor().toString() +" apple";
        else return "A Heavy "+ apple.getColor().toString()+" apple";
    }
}
