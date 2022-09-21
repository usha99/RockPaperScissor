import java.util.Random;
import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args) {
        System.out.println("Enter 0 : Rock");
        System.out.println("Enter 1 : Paper");
        System.out.println("Enter 2 : Scissor");
        Random random = new Random();
        int computerInput  = random.nextInt(3);
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if(userInput==computerInput){
            System.out.println(" Match Draw : ");
        }
        else if(userInput== 0 && computerInput==2 || userInput==1&& computerInput==0 || userInput==2&& computerInput==1){
            System.out.println(" Congrats!! You Won ");
        }
        else {
            System.out.println(" Computer Won ");
        }
        System.out.println("Computer Choice :" +computerInput);

    }
}
