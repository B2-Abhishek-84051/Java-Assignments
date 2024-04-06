public class Main {
    public static void main(String[] args) {
        SalariedEmployee SE = new SalariedEmployee("Raju", "Sharma", 101, 2500);
        System.out.println(SE.toString());
        HourlyEmployee HE = new HourlyEmployee("Shyam", "Verma", 102, 20, 45);
        System.out.println(HE.toString());
        CommissionEmployee CE = new CommissionEmployee("Baburao", "Apte", 103, 1000, 2.5);
        System.out.println(CE.toString());
        BasePlusCommissionEmployee BE = new BasePlusCommissionEmployee("Ghanshyam", "Das", 104, 1500, 1.5, 2500);
        System.out.println(BE.toString());

        System.out.println();
        System.out.println("Earnings : ");
        System.out.println("Name\t\t\tEarning");
        System.out.println(SE.first_name+"\t\t\t"+SE.earnings());
        System.out.println(HE.first_name+"\t\t\t"+HE.earnings());
        System.out.println(CE.first_name+"\t\t\t"+CE.earnings());
        System.out.println(BE.first_name+"\t\t"+BE.earnings());


    }
}
