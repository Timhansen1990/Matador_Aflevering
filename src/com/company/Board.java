 package com.company;

public class Board {
    static int[] playerLocation = {0, 0, 0};
    static String[] playersNames= {"Test a","Test b","Test c"};

    public static void Start() {
        int i;

        while (playerLocation[0] < 10 && playerLocation[1] < 10 && playerLocation[2] < 10) {
            if (playerLocation[0] > 9 || playerLocation[1] > 9 || playerLocation[2] > 9){
                break;
            }
            for ( i = 0; i <= 2; i++) {

                int dice = Dice.RollResult(i); //Throw the dice

                playerLocation[i] = playerLocation[i] + dice;//Move user x
                System.out.println(playersNames[i]  + " Stands on field " + playerLocation[i]);

                // TODO if player goes minus = Game Over,

               if (playerLocation[i] == 0 ) {
                    System.out.println("You cant Buy");
                }else if (playerLocation[i] > 9){
                    System.out.println("You Cant Buy");
                }
                else {
                    Bank.Purchase(i, playerLocation[i]);// ask if want to buy = yes =buy, if location is owned = pay

                }

                System.out.println("\n"
                        +" cashammount "+Bank.cashAmount[0]+" location: "+playerLocation[0]+" "+playersNames[0]+"\n"
                        +" cashammount "+Bank.cashAmount[1]+" location: "+playerLocation[1]+" "+playersNames[1]+"\n"
                        +" cashammount "+Bank.cashAmount[2]+" location: "+playerLocation[2]+" "+playersNames[2]+"\n");
            } i = 0; //continue to first player
        }
        System.out.println("THE GAME HAS FINISHED");
        Winner.TheWinnerTakesItAll();
    /*    System.out.println("\n"+playersNames[0]+" cashammount "+Bank.cashAmount[0]+"\n"
                +playersNames[1]+" cashammount "+Bank.cashAmount[1]+"\n"
                +playersNames[2]+" cashammount "+Bank.cashAmount[2]+"\n");*/
    }
}
