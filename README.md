# GFGBQ-Team-savvy
Repository for savvy - Vibe Coding Hackathon
Made a plan

#include <stdio.h>
int main() 
{
    int dailysav,days,i;
    int ch;
    float totalsav = 0,finalamt = 0;
    FILE *file;

    printf("----- Micro Investment Platform -----\n");
    printf("Designed for First-Time Investors\n\n");
//How much user will put in for how long
    printf("Enter daily saving amount (from Rs.5):");
    scanf("%d",&dailysav);

    if(dailysav<5) 
	{
        printf("Invalid amount. Please enter between Rs.1 and Rs.5.\n");
        return 0;
    }

    printf("Enter number of days you want to save:");
    scanf("%d",&days);

    for (i=1;i<=days;i++) 
	{
        totalsav+=dailysav; //Adding same amount for the entered number of days
    }
//Giving chs for investment
    printf("\nChoose Investment Option:\n");
    printf("1. Fixed Savings (4%% return)\n");
    printf("2. Government Bond (6%% return)\n");
    printf("3. Digital Gold (5%% return)\n");
    printf("Enter your choice:");
    scanf("%d",&ch);
//Calculating final amount that will be returned
    switch (ch) 
	{
        case 1:
            finalamt=totalsav+(totalsav*0.04);
            break;
        case 2:
            finalamt=totalsav+(totalsav*0.06);
            break;
        case 3:
            finalamt=totalsav+(totalsav*0.05);
            break;
        default:
            printf("Invalid choice.\n");
            return 0;
    }

    printf("\nTotal Saved Amount: Rs.%.2f",totalsav);
    printf("\nExpected Value After Investment: Rs.%.2f\n",finalamt);
//Saving the memory
    file=fopen("investment_history.txt","a");

    if (file==NULL) 
	{
        printf("Error opening file.\n");
        return 0;
    }

    fprintf(file,"Daily Save: Rs.%d\n",dailysav);
    fprintf(file,"Days: %d\n",days);
    fprintf(file,"Total Saved: Rs.%.2f\n",totalsav);
    fprintf(file,"Final Amount: Rs.%.2f\n",finalamt);
    fprintf(file,"--------------------------\n");

    fclose(file);

    printf("\nInvestment details saved successfully.\n");
    printf("Thank you for investing safely!\n");

    return 0;
}

#2
Risk calculator

#include<stdio.h>
int main() 
{
    int income;
    int investmentPeriod; // in years

    printf("Enter your monthly income (in INR): ");
    scanf("%d", &income);

    printf("Enter investment period (in years): ");
    scanf("%d", &investmentPeriod);

    if (investmentPeriod > 3 && income > 20000) {
        printf("\nRisk Profile: LOW RISK\n");
        printf("Suggested Investments:\n");
        printf("- Fixed Deposits (FD)\n");
        printf("- Government Bonds\n");
        printf("- Large-cap Mutual Funds\n");
    }
    else if (investmentPeriod > 3 && income < 20000) {
        printf("\nRisk Profile: HIGH RISK\n");
        printf("Suggested Investments:\n");
        printf("- Small-cap Mutual Funds\n");
        printf("- Stocks\n");
        printf("- High-growth SIPs\n");
    }
    else {
        printf("\nRisk Profile: MODERATE RISK\n");
        printf("Suggested Investments:\n");
        printf("- Index Funds\n");
        printf("- Balanced Mutual Funds\n");
        printf("- Short-term SIPs\n");
    }

    return 0;
}

### 3
#include <stdio.h>
int main() 
{
    int dailysav,days,i;
    int ch;
    float totalsav = 0,finalamt = 0;
    FILE *file;

	printf("-----eGullak-----\n");
    printf("----- Micro Investment Platform -----\n");
    printf("Designed for First-Time Investors\n\n");
//Calculating risks
	int income;
    int investmentPeriod; // in years

    printf("Enter your monthly income (in INR): ");
    scanf("%d", &income);

    printf("Enter investment period (in years): ");
    scanf("%d", &investmentPeriod);

    if (investmentPeriod > 3 && income > 20000) {
        printf("\nRisk Profile: LOW RISK\n");
        printf("Suggested Investments:\n");
        printf("- Fixed Deposits (FD)\n");
        printf("- Government Bonds\n");
        printf("- Large-cap Mutual Funds\n");
    }
    else if (investmentPeriod > 3 && income < 20000) {
        printf("\nRisk Profile: HIGH RISK\n");
        printf("Suggested Investments:\n");
        printf("- Small-cap Mutual Funds\n");
        printf("- Stocks\n");
        printf("- High-growth SIPs\n");
    }
    else {
        printf("\nRisk Profile: MODERATE RISK\n");
        printf("Suggested Investments:\n");
        printf("- Index Funds\n");
        printf("- Balanced Mutual Funds (Hybrid)\n");
        printf("- Short-term SIPs\n");
    }
//How much user will put in for how long
    printf("Enter daily saving amount (from Rs.1):");
    scanf("%d",&dailysav);

    if(dailysav<5) 
	{
        printf("Invalid amount. Please enter valid amount.\n");
        return 0;
    }

    printf("Enter number of days you want to save:");
    scanf("%d",&days);

    for (i=1;i<=days;i++) 
	{
        totalsav+=dailysav; //Adding same amount for the entered number of days
    }
//Giving chs for investment
    printf("\nChoose Investment Option:\n");
    printf("1. Fixed Deposits (FD) (5%% return)\n");
    printf("2. Government Bond (6%% return)\n");
    printf("3. Large-cap Mutual Funds (12%% return)\n");
    printf("4. Small-cap Mutual Funds (18%% return)\n");
    printf("5. Stocks (12%% return)\n");
    printf("6. Index Funds (11%% return)\n");
    printf("7. Balanced Mutual Funds (Hybrid) (8%% return)\n");
    printf("8. High-growth SIPs (12%% return)\n");
    printf("9. Short-term SIPs (7%% return)\n");
    printf("Enter your choice:");
    scanf("%d",&ch);
//Calculating final amount that will be returned
    switch (ch) 
	{
        case 1:
            finalamt=totalsav+(totalsav*0.05);
            break;
        case 2:
            finalamt=totalsav+(totalsav*0.06);
            break;
        case 3:
            finalamt=totalsav+(totalsav*0.12);
            break;
        case 4:
            finalamt=totalsav+(totalsav*0.18);
            break;
        case 5:
            finalamt=totalsav+(totalsav*0.12);
            break;
        case 6:
            finalamt=totalsav+(totalsav*0.11);
            break;
    	case 7:
            finalamt=totalsav+(totalsav*0.08);
            break;
        case 8:
            finalamt=totalsav+(totalsav*0.12);
            break;
        case 9:
            finalamt=totalsav+(totalsav*0.07);
            break;
        default:
            printf("Invalid choice.\n");
            return 0;
    }

    printf("\nTotal Saved Amount: Rs.%.2f",totalsav);
    printf("\nExpected Value After Investment: Rs.%.2f\n",finalamt); 
//Saving the memory
    file=fopen("investment_history.txt","a");

    if (file==NULL) 
	{
        printf("Error opening file.\n");
        return 0;
    }

    fprintf(file,"Daily Save: Rs.%d\n",dailysav);
    fprintf(file,"Days: %d\n",days);
    fprintf(file,"Total Saved: Rs.%.2f\n",totalsav);
    fprintf(file,"Final Amount: Rs.%.2f\n",finalamt);
    fprintf(file,"--------------------------\n");

    fclose(file);

    printf("\nInvestment details saved successfully.\n");
    printf("Thank you for investing safely!\n");

    return 0;
}
