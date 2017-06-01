package com.gmail.babanin.aleksey;

public class Ticket {
    private int number;

    public Ticket(int number) {

        if ((number < 0) || (number > 9999)) {
            throw new IllegalArgumentException("ticket number must have 4 digits");
        }

        this.number = number;
    }

    public boolean isLucky() {

        int leftPart = this.number / 100;
        int rightPart = this.number % 100;

        leftPart = compress(leftPart);
        rightPart = compress(rightPart);

        if (leftPart == rightPart) {
            return true;
        }
        return false;
    }

    private int compress(int number) {
        int result = number;

        while (result > 9) {
            result = result / 10 + result % 10;
        }
        return result;
    }
}
