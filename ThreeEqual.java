public class ThreeEqual {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (args.length != 3) {
            System.out.println("Please give arguments ");
        }
        if(a == b && b == c) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}