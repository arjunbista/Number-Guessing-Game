
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class game {
    public static void Play(){
        Random rand= new Random();

        //Generate random integers in range 0 to 20
        int rand_int = rand.nextInt(20);
        for(int i=0;i<5;i++){
            System.out.println("Please Enter your guessed integer number to check: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a==rand_int){
                System.out.println("Congratulation You Won");
                Continue();
                }
        }
        System.out.println("You Lost, The number Was :"+rand_int);
        Continue();
    }
    
    public static void Continue(){
        String valid="1";
        System.out.println("Enter 1 to continue or any key to exit ");
        Scanner sc = new Scanner(System.in);
        String choice=Integer.toString((sc.nextInt()));
        if(choice.equals(valid)){
            Play();
        }
        else{
            System.exit(0);
        }  
    }
    
    public static void main(String arg[]){
        Play();
    }
}

