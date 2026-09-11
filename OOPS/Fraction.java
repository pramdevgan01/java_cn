package OOPS;

public class Fraction {
    int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public void print(){
        System.out.println(numerator + "/" +denominator);
    }

    public void increment(){
        numerator = numerator + denominator;
        simplify();
    }

    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i = 2; i <= smaller; i++){
            if(numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
    public void setNumerator(int num){
        this.numerator = num;
    }

    public int getNumerator(){
        return numerator;
    }

    public void setDenominator(int num){
        if(num == 0){
            return;
        }
        this.denominator = num;
    }
}
