package com.company;

public class Winner {
    public static void TheWinnerTakesItAll(){

        if (Bank.cashAmount[0]>Bank.cashAmount[1] && Bank.cashAmount[0]>Bank.cashAmount[2] ) {
            System.out.println("Winner is: " + Board.playersNames[0]);
        }
        if (Bank.cashAmount[1]>Bank.cashAmount[0] && Bank.cashAmount[1]>Bank.cashAmount[2] ) {
            System.out.println("Winner is: " + Board.playersNames[1]);
        }
        if (Bank.cashAmount[2]>Bank.cashAmount[1] && Bank.cashAmount[2]>Bank.cashAmount[0] ) {
            System.out.println("Winner is: " + Board.playersNames[2]);
        }

        if(Bank.cashAmount[0]==Bank.cashAmount[1] && Bank.cashAmount[0]>Bank.cashAmount[2]){
            System.out.println("Winner is: "+Board.playersNames[0]+" and "+Board.playersNames[1]);
        }
        if(Bank.cashAmount[0]==Bank.cashAmount[2] && Bank.cashAmount[0]>Bank.cashAmount[1]) {
            System.out.println("Winner is: " + Board.playersNames[0] + " and " + Board.playersNames[2]);
        }
        if(Bank.cashAmount[1]==Bank.cashAmount[2] && Bank.cashAmount[1]>Bank.cashAmount[0]) {
            System.out.println("Winner is: " + Board.playersNames[1] + " and " + Board.playersNames[2]);
        }

        if(Bank.cashAmount[0]==Bank.cashAmount[1] && Bank.cashAmount[2]==Bank.cashAmount[1]){
            System.out.println("ALL WON!!!");
        }




    }
}
