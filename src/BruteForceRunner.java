import java.util.Scanner;

public class BruteForceRunner {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);

        System.out.println("Enter the domain");
        int xAxis = keyboardReader.nextInt();

        while (xAxis <= 0){
            System.out.println("Please enter a positive domain.");
            xAxis = keyboardReader.nextInt();
        }

        System.out.println("Enter the range");
        int yAxis = keyboardReader.nextInt();

        while (yAxis <= 0){
            System.out.println("Please enter a positive range.");
            yAxis = keyboardReader.nextInt();
        }

        System.out.println("Enter the y intercept");
        int yIntercept = keyboardReader.nextInt();

        while (yIntercept > yAxis){
            System.out.println("Please enter a y intercept within the range.");
            yIntercept = keyboardReader.nextInt();
        }

        System.out.println("Enter the slope");
        double slope = keyboardReader.nextDouble();

        if (xAxis > 100){
            double scaleFactor = xAxis / 100;
            xAxis = (int)(xAxis / scaleFactor);
            yAxis = (int)(yAxis / scaleFactor);
            yIntercept = (int)(yIntercept / scaleFactor);
        }

        if (yAxis > 100){
            double scaleFactor = yAxis / 100;
            xAxis = (int)(xAxis / scaleFactor);
            yAxis = (int)(yAxis / scaleFactor);
            yIntercept = (int)(yIntercept / scaleFactor);
        }

        for (double y = yAxis; y >= 0; y--){

            for(double x = 0; x <= xAxis; x++) {


                if (x == 0 && y != yIntercept) {
                    System.out.print("|");
                }

                else {
                    if (y == 0){
                        System.out.print("-");
                    }

                    else if (y == yIntercept && x == 0){
                        System.out.print("*");
                    }

                    else if (y == (x * slope) + yIntercept){
                        System.out.print("*");
                    }

                    else {
                        System.out.print(" ");
                    }
                }

            }

            System.out.println("");
        }


    }
}
