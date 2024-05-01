import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        System.out.println("How many days temperature you want to enter");
        Scanner console = new Scanner(System.in);
        int numOfDays = console.nextInt();
        int sumOfTemp = 0;
        for(int i=1; i<numOfDays ; i++){
            System.out.println("enter day "+ i +" temperature");
            int temp = console.nextInt();
          sumOfTemp = sumOfTemp+temp;
        }
        System.out.println(" average temperature is "+ sumOfTemp/numOfDays);

    }
}
