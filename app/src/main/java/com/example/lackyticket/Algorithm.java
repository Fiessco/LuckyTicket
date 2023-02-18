package com.example.lackyticket;

public class Algorithm {

    public Algorithm() {
    }

    public boolean isLuckyTicket(String input) {
        int inputInt = Integer.parseInt(input);

        int s1 = 0, s2 = 0;
        for(int i = 0; i <3; i++) {
            s1 = s1 + inputInt % 10;
            ;
            inputInt = inputInt / 10;
        }
        for(int i = 0; i <3; i++) {
            s1 = s1 + inputInt % 10;
            ;
            inputInt = inputInt / 10;
        }
        if (s1 == s2) {
            return  true;
        } else  {
            return false;
        }
    }

    public  int nextLuckyInt(String input) {
        int inputInt = Integer.parseInt(input);

        if (!(inputInt > 99_999 && inputInt < 999_999)) {
            return -1;
        }
        while (inputInt <= 999_999) {
         if (isLuckyTicket(String.valueOf(inputInt)) ==true) {
             return  inputInt;
         } else {
             inputInt++;
         }

        }

        return -1;
    }
}
