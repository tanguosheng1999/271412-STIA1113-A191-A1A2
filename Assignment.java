import java.util.Scanner;

public class Assignment{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        float CarPrice, DownPayment, InterestRate, MonthlyRepayment, Principal, Balance, Payment, YearInterest1, YearInterest7, YearPayment7, Interest;
        double TotalPrincipal = 0; 
        double TotalInterest = 0;
        double TotalBalance = 0;
        int LoanPeriod;
        int Index;

        do{
        System.out.println("Car Price (RM):");
        CarPrice = input.nextFloat(); }
        while (CarPrice<=30000);

        do{
        System.out.println("Down Payment (RM):");
        DownPayment = input.nextFloat(); }
        while (DownPayment<=0);

        do{
        System.out.println("Loan Period (Year 5-9):");
        LoanPeriod = input.nextInt(); }
        while (LoanPeriod<=5 || LoanPeriod>=9);

        do{
        System.out.println("Interest Rate (%):");
        InterestRate = input.nextFloat(); }
        while (InterestRate<=3 || InterestRate>=7);

        System.out.printf("");

        System.out.printf("-----------------------------------------------------------------------------------------\n");

        Payment = CarPrice - DownPayment;
        MonthlyRepayment = (Payment / LoanPeriod / 12) + (Payment * InterestRate / 100 /12);
        System.out.print("\t\t\t\tMonthly Repayment: " + "\n\t\t\t\t    RM");
        System.out.printf("%.2f\n", MonthlyRepayment);

        System.out.printf("-----------------------------------------------------------------------------------------\n");
        System.out.printf("\tYears\t\t Pricipal\t\tInterest\t\t Balance\n");
        System.out.printf("-----------------------------------------------------------------------------------------\n");

        YearInterest1 = Payment * InterestRate / 100;
        YearInterest7 = YearInterest1 * LoanPeriod;
        YearPayment7 = Payment + YearInterest7;
        Principal = YearPayment7 / LoanPeriod;
        Interest = Payment * InterestRate / 100;
        Balance = YearPayment7 - Principal;
        
        for(Index=1 ; Index<=LoanPeriod ; Index++){
            TotalPrincipal += Principal;
            TotalInterest += Interest;
            TotalBalance = YearPayment7 - TotalPrincipal;
            System.out.printf("\t %d", Index);
            System.out.printf("\t\t%9.2f", TotalPrincipal);
            System.out.printf("\t\t%8.2f", TotalInterest);   
            System.out.printf("\t\t%9.2f\n", TotalBalance);
        }
        System.out.printf("-----------------------------------------------------------------------------------------\n");
    }
}
 


