// good
public class RollLoadedDie {
    public static void main(String[] args) {
        double test = Math.random();
        
        if (test <= 0.125){
            System.out.println("You rolled a one");
        } else if (test <= 0.250){
            System.out.println("You rolled a two");
        } else if (test <= 0.375){
            System.out.println("You rolled a three");
        } else if (test <= 0.5){
            System.out.println("You rolled a four");
        } else if (test <= 0.625){
            System.out.println("You rolled a five");
        } else{
            System.out.println("You rolled a six");
        }
    }
}
