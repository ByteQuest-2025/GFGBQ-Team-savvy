import java.util.Scanner;

public class eGullak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-------------------------------------");
        System.out.println("   🐷 eGullak - Micro Investment App   ");
        System.out.println("-------------------------------------");

        // 1. User Input
        System.out.print("Enter Daily Savings Amount (Rs): ");
        double dailySavings = scanner.nextDouble();

        System.out.print("Enter Duration (Days): ");
        int days = scanner.nextInt();

        // 2. Show Options (Matching your Website)
        System.out.println("\nSelect Investment Plan:");
        System.out.println("1. Fixed Deposits (FD) - 5%");
        System.out.println("2. Government Bond - 6%");
        System.out.println("3. Large-cap Funds - 12%");
        System.out.println("4. Small-cap Funds - 18%");
        System.out.println("5. Stocks - 12%");
        System.out.println("6. Index Funds - 11%");
        System.out.println("7. Balanced Funds - 8%");
        System.out.println("8. High-growth SIPs - 12%");
        System.out.println("9. Short-term SIPs - 7%");
        
        System.out.print("Enter Choice (1-9): ");
        int choice = scanner.nextInt();

        // 3. Logic (Matching your HTML Logic)
        double rate = 0.0;
        String planName = "";

        switch (choice) {
            case 1: rate = 0.05; planName = "FD"; break;
            case 2: rate = 0.06; planName = "Govt Bond"; break;
            case 3: rate = 0.12; planName = "Large-cap"; break;
            case 4: rate = 0.18; planName = "Small-cap"; break;
            case 5: rate = 0.12; planName = "Stocks"; break;
            case 6: rate = 0.11; planName = "Index Funds"; break;
            case 7: rate = 0.08; planName = "Balanced"; break;
            case 8: rate = 0.12; planName = "High SIP"; break;
            case 9: rate = 0.07; planName = "Short SIP"; break;
            default: System.out.println("Invalid Choice. Using Base Rate."); rate = 0.04;
        }

        // 4. Calculation
        double totalSaved = dailySavings * days;
        double finalAmount = totalSaved + (totalSaved * rate);

        // 5. Final Output
        System.out.println("\n-----------------------------");
        System.out.println("✅ Investment Successful!");
        System.out.println("Plan Selected: " + planName);
        System.out.println("Total Saved:   Rs " + totalSaved);
        System.out.println("Final Value:   Rs " + finalAmount);
        System.out.println("-----------------------------");
    }
}