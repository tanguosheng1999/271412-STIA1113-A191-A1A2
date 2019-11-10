# Student Info

Matric: 271412 
Name: Tan Guo Sheng

## Introduction

In this assignment, I have to create a car loan calculator by using Java code to calculate the monthly repayment, principal,interest and balance. First, I have to write a pseudocode and draw a flow chart. Then, I need to calculate monthly repayment according to the car price, downpayment, loan period, and rate. I use do...while statement to loop monthly repayment. I also need to find and display value of principal, interest, and balance for every year based on loanperiod. I use for statement to loop principal, interest, and balance. So, I learn how to use looping with do...while and for statement.


## Pseudocode to calculate the perimeter of a rectangle

```
Start
Delare
float CarPrice, DownPayment, InterestRate, MonthlyRepayment, Principal, Balance, Payment, YearInterest1, YearInterest7, YearPayment7, Interest
double TotalPrincipal = 0
double TotalInterest = 0
double TotalBalance = 0
int LoanPeriod
int Index

Output”Car Price(RM)”
Input Car Price and loop until user number less than RM30000
If user enters car price less than RM30000, the user is required to enter Car Price again.

Output”Down Payment(RM)”
Input Down Payment and loop until user enter zero or positive number
If user enter Down Payment negative number, the user is required to enter Down Payment again

Output”Loan Period(Year 5-9)”
Input Loan Period and loop until while not between 5 until 9 years
If user enter Loan Period less than 5 years or more than 9 years, the user is required to enter Loan Period again
 
Output”Interest Rate(%)”
Input Interest Rate and loop until while not between 3 until 7%
 If user enter Interest Rate less than 3% or more than 7%, the user is required to enter Interest Rate again

Calculate the Payment = (CarPrice – DownPayment)
Calculate the MonthlyRepayment = (Payment / LoanPeriod / 12) +(Payment * InterestRate / 100 /12)
Output MonthlyRepayment


Calculate YearInterest1 = Payment * InterestRate / 100
Calculate YearInterest7 = YearInterest1 * LoanPeriod
Calculate YearPayment7 = Payment + YearInterest7
Calculate Principal = YearPayment7 / LoanPeriod
Calculate Interest = Payment * InterestRate / 100
Calculate Balance = YearPayment7 – Principal

Loop depen on LoanPeriod
TotalPrincipal += Principal
TotalInterest += Interest
TotalBalance = YearPayment7 – TotalPrincipal
Output Index
Output TotalPrincipal
Output TotalInterest
Output TotalBalance

End

```
## Flow chart 

![Flowchart](https://github.com/tanguosheng1999/271412-STIA1113-A191-A1A2/blob/master/Flow%20Chart(assignment%201%262).png)


## Screenshot of the output

![output](https://github.com/tanguosheng1999/271412-STIA1113-A191-A1A2/blob/master/Output.png)
