package hilleluser;

public class Main {
    public static void main(String[] args) {


        Participant[] participants = {new Human("John"), new Human("Bill")
                /*new Cat("Barsik"), new Cat("Murzik"), new Robot("R2D2"), new Robot("C3PO")*/};

        Let[] lets = {new Wall(6), new Wall(7) /*new TriadMill(100),
                new TriadMill(5000), new TriadMill(10000)*/};


        for (Participant participant : participants)
            for (Let let : lets) {
                if (let.overcome(participant)) {
                    System.out.println("overcame obstacles");
                } else
                    System.out.println("could not overcome the obstacle");
                break;
            }

    }
}






