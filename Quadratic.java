public class Quadratic {
    public static void main(String[] args) {
        if(args.length < 3){
            System.out.println("Please give arguments");
        } else{
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            if(a == 0){
                System.out.println("The answer is " + -c/b);
            }else{
                double d = (-b + Math.sqrt(b*b + -4*a*c))/2*a;
                double e = (-b - Math.sqrt(b*b + -4*a*c))/2*a;
                if (b*b + -4*a*c < 0){
                    System.out.println("No Solution");
                }else {
                    System.out.println("The first answer is " + d );
                    System.out.println("The second answer is "+ e);
                }
                
            }
    }
        }
    }
    