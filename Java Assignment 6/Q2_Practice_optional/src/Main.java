import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double totalMiles;
        double gasolinePrice;
        double VehicleAverage;
        double parkingFee;
        double toll;
        int noOfPerson;
        double TotalCost;
        double totalCostPerPerson;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in miles : ");
        totalMiles = sc.nextDouble();
        System.out.print("Enter gasoline Price : ");
        gasolinePrice = sc.nextDouble();
        System.out.print("Enter Vehicle mileage : ");
        VehicleAverage = sc.nextDouble();
        System.out.print("Enter Parking fees : ");
        parkingFee = sc.nextDouble();
        System.out.print("Enter toll : ");
        toll = sc.nextDouble();

        TotalCost = (totalMiles * gasolinePrice / VehicleAverage) + parkingFee + toll;
        System.out.println("Total cost = Rs."+TotalCost);

        System.out.print("Enter number of persons : ");
        noOfPerson = sc.nextInt();

        System.out.println("***** Car Pooling Report *****");
        System.out.println("Total Cost = Rs."+TotalCost);
        totalCostPerPerson = TotalCost/noOfPerson;
        System.out.println("Total cost per person = Rs"+totalCostPerPerson);
        System.out.println("Money saved by car-pooling = Rs."+(TotalCost+totalCostPerPerson));
    }
}