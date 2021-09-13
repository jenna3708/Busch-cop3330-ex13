import java.util.Scanner;
import java.lang.Math;

public class exercise13 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("What is the principal amount?");
        String principal = input.next();
        double convPrincipal = Double.parseDouble(principal);

        Scanner input2 = new Scanner (System.in);
        System.out.println("What is the rate?");
        String rate = input2.next();
        double convRate = Double.parseDouble(rate);

        Scanner input3 = new Scanner (System.in);
        System.out.println("What is the number of years?");
        String years = input3.next();
        double convYears = Double.parseDouble(years);

        Scanner input4 = new Scanner (System.in);
        System.out.println("What is the number of times the interest is compounded per year?");
        String compound = input4.next();
        double convCompound = Double.parseDouble(compound);

        //converting percent to decimal
        //simplifying the math
        double rateDec = convRate / 100;
        double math1 = (1+ rateDec/convCompound);
        double math2 = convCompound * convYears;
        double expMath = Math.pow(math1,math2);

        //getting investment over the years
        double compInvestment = convPrincipal * (expMath);

        System.out.println("$"+convPrincipal+" invested at "+convRate+"% for "+convYears+" years compounded "+convCompound+" times per year is $"+String.format("%.2f",compInvestment));

    }
}


