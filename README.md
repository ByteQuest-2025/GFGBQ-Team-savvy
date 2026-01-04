# GFGBQ-Team-savvy
Repository for savvy - Vibe Coding Hackathon
# 🐷 eGullak - Digital Savings Tracker

*Team SAVvy | Vibe Coding Hackathon*

eGullak is a smart micro-investment platform designed for first-time investors. It helps users save small amounts daily and suggests the best investment options (FD, Gold, Mutual Funds) based on their risk profile.

### 🚀 Features
* *Smart Savings:* Daily inputs to track your savings.
* *Risk Calculator:* Analyzes your income and suggests Low, Medium, or High-risk investments.
* *Investment Options:* Choose from 9 different options like Gold, Stocks, and SIPs.

### 💻 Tech Stack
* *Java:* Backend logic & calculation.
* *HTML/JS:* Web interface for the judges.


### WORKING CODE


import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class eGullak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSaved = 0;
        double finalAmount = 0;

        System.out.println("----- eGullak -----");
        System.out.println("----- Micro Investment Platform -----");
        System.out.println("Designed for First-Time Investors\n");

        // --- PART 1: RISK CALCULATOR ---
        System.out.print("Enter your monthly income (in INR): ");
        int income = scanner.nextInt();

        System.out.print("Enter investment period (in years): ");
        int investmentPeriod = scanner.nextInt();

        System.out.println("\n--- RISK PROFILE ANALYSIS ---");
        if (investmentPeriod > 3 && income > 20000) {
            System.out.println("Risk Profile: LOW RISK");
            System.out.println("Suggested: Fixed Deposits (FD), Govt Bonds, Large-cap Mutual Funds");
        } else if (investmentPeriod > 3 && income < 20000) {
            System.out.println("Risk Profile: HIGH RISK");
            System.out.println("Suggested: Small-cap Mutual Funds, Stocks, High-growth SIPs");
        } else {
            System.out.println("Risk Profile: MODERATE RISK");
            System.out.println("Suggested: Index Funds, Balanced Funds, Short-term SIPs");
        }

        // --- PART 2: SAVINGS CALCULATOR ---
        System.out.println("\n--- SAVINGS CALCULATOR ---");
        System.out.print("Enter daily saving amount (min Rs.5): ");
        int dailySav = scanner.nextInt();

        if (dailySav < 5) {
            System.out.println("Invalid amount. Minimum savings is Rs. 5.");
            return;
        }

        System.out.print("Enter number of days you want to save: ");
        int days = scanner.nextInt();

        // Calculate total savings
        for (int i = 1; i <= days; i++) {
            totalSaved += dailySav;
        }

        // --- PART 3: INVESTMENT OPTIONS ---
        System.out.println("\n--- CHOOSE INVESTMENT OPTION ---");
        System.out.println("1. Fixed Deposits (FD) (5% return)");
        System.out.println("2. Government Bond (6% return)");
        System.out.println("3. Large-cap Mutual Funds (12% return)");
        System.out.println("4. Small-cap Mutual Funds (18% return)");
        System.out.println("5. Stocks (12% return)");
        System.out.println("6. Index Funds (11% return)");
        System.out.println("7. Balanced Mutual Funds (8% return)");
        System.out.println("8. High-growth SIPs (12% return)");
        System.out.println("9. Short-term SIPs (7% return)");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: finalAmount = totalSaved + (totalSaved * 0.05); break;
            case 2: finalAmount = totalSaved + (totalSaved * 0.06); break;
            case 3: finalAmount = totalSaved + (totalSaved * 0.12); break;
            case 4: finalAmount = totalSaved + (totalSaved * 0.18); break;
            case 5: finalAmount = totalSaved + (totalSaved * 0.12); break;
            case 6: finalAmount = totalSaved + (totalSaved * 0.11); break;
            case 7: finalAmount = totalSaved + (totalSaved * 0.08); break;
            case 8: finalAmount = totalSaved + (totalSaved * 0.12); break;
            case 9: finalAmount = totalSaved + (totalSaved * 0.07); break;
            default: 
                System.out.println("Invalid choice.");
                return;
        }

        // Output Results
        System.out.printf("\nTotal Saved Amount: Rs. %.2f\n", totalSaved);
        System.out.printf("Expected Value After Investment: Rs. %.2f\n", finalAmount);

        // --- PART 4: SAVE TO FILE (investment_history.txt) ---
        try {
            FileWriter fileWriter = new FileWriter("investment_history.txt", true); // true = append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.println("Daily Save: Rs." + dailySav);
            printWriter.println("Days: " + days);
            printWriter.println("Total Saved: Rs." + totalSaved);
            printWriter.println("Final Amount: Rs." + finalAmount);
            printWriter.println("--------------------------");
            
            printWriter.close();
            System.out.println("\nInvestment details saved to 'investment_history.txt' successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file.");
        }

        System.out.println("Thank you for investing safely with eGullak!");
    }
}
