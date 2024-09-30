import java.util.Scanner;
public class InsurancePolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Insurance Number: ");
        String insuranceNumber = sc.nextLine();
        System.out.println("Enter Insurance Name: ");
        String insuranceName = sc.nextLine();
        System.out.println("Amount covered");
        Double amountcovered = sc.nextDouble();
        System.out.println("---SELECT---");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int option = sc.nextInt();
        Insurance insurance = null;

        if (option == 1) {
            LifeInsurance lifeInsurance = new LifeInsurance();
            lifeInsurance.setInsuranceNumber(insuranceNumber);
            lifeInsurance.setInsuranceName(insuranceName);
            lifeInsurance.setAmountcovered(amountcovered);
            System.out.println("-----Policy Term-----: ");
            lifeInsurance.setPolicyTerm(sc.nextInt());
            System.out.println("-----Benefit Percent-----:");
            lifeInsurance.setBenefitPercent(sc.nextFloat());
            insurance = lifeInsurance;
        }

        else if (option == 2) {
            MotorInsurance motorInsurance = new MotorInsurance();
            motorInsurance.setInsuranceNumber(insuranceNumber);
            motorInsurance.setInsuranceName(insuranceName);
            motorInsurance.setAmountcovered(amountcovered);
            System.out.println("-----Depreciation Percent-----: ");
            motorInsurance.setDepPercent(sc.nextFloat());
            insurance = motorInsurance;
        }

        else {
            System.out.println("Invalid Option");
            sc.close();
            return;
        }
        double premium = insurance.calculatePremium();
        System.out.println("Calculated Premium: " + premium);
        sc.close();
    }
}
