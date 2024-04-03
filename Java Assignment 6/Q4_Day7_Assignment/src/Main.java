import java.util.Scanner;

public class Main {
    enum TrafficlIght
    {
        RED(60), YELLOW(5), GREEN(20);
        // String name;
        int id;

        TrafficlIght(int id) {
            //this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        TrafficlIght r = TrafficlIght.RED;


        System.out.println("Duration of RED light is "+r.getId()+" sec");
        System.out.println("======================================");
        TrafficlIght y = TrafficlIght.YELLOW;

        System.out.println("Duration of Yellow is "+y.getId()+" sec");
        System.out.println("======================================");
        TrafficlIght g = TrafficlIght.GREEN;

        System.out.println("Duration of Green is "+g.getId()+" sec");
    }
}