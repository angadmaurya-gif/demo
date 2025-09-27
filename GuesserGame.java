package project.java;

import java.util.Scanner;

class Guesser{
     int GuesserNum;
     public int GuessNum(){
         Scanner sc= new Scanner(System.in);
         System.out.println("Guesser kindly guess the number:");
         GuesserNum=sc.nextInt();
         return GuesserNum;

     }
 }
 class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner sc=new Scanner(System.in);
        PlayerNum=sc.nextInt();
        return PlayerNum;
    }
 }
 class Umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;
    public void CollectNumFromGuesser(){
        Guesser Gu=new Guesser();
        Guessernum=Gu.GuessNum();
    }
    public void CollectNumFromPlayer(){
        Player Pl1=new Player();
        System.out.println("Player number 1 guess the number:");
        Playernum1=Pl1.PlayerNumb();
        Player Pl2=new Player();
        System.out.println("Player number 2 guess the number:");
        Playernum2=Pl2.PlayerNumb();
        Player Pl3=new Player();
        System.out.println("Player number 3 guess the number:");
        Playernum3=Pl3.PlayerNumb();
    }
    public void Compair(){
        if(Guessernum==Playernum1){
            if(Guessernum==Playernum2 && Guessernum==Playernum3) {
                System.out.println("All Player win the game");
            }
                else if(Guessernum==Playernum2) {
                System.out.println("Player1 And Player 2 win the game");
            }
                else if(Guessernum==Playernum3){
                System.out.println("Player 1 And Player3 win the game");
            }
                else{
                System.out.println("Player 1 win the game");
            }

        }
        else if(Guessernum==Playernum2){
            if(Guessernum==Playernum3){
                System.out.println("Player 2 And Player 3 win thw game");
            } else   {
                System.out.println("Player 2 win the game");
            }
        }
        else if(Guessernum==Playernum3){
            System.out.println("only Player 3 win the game");
        }
        else{
            System.out.println("All the Player Lost the game");
        }

     }

 }
public class GuesserGame {
    public static void main(String[] args) {
      Umpire up=new Umpire();
      up.CollectNumFromGuesser();
      up.CollectNumFromPlayer();
      up.Compair();
        System.out.println("----game over----");
    }
}
