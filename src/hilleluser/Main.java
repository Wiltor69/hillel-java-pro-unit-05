package hilleluser;

public class Main {
    public static void main(String[] args) {
         Participant p1 = new Human("John", 5, 100);
         Participant p2 = new Human("Bill", 2, 500);
         Participant p3 = new Cat ("Barsik", 5, 250);
         Participant p4 = new Cat("Murzik", 4, 500);
         Participant p5 = new Robot("R2D2", 9, 1500);
        Participant p6 = new Robot("C3PO", 15, 3000);
        
        Let le1 = new Obstacle(3, 150);
        Let le2 = new Obstacle(5, 250);
        Let le3 = new Obstacle(7, 250);
        Let le4 = new Obstacle(2, 100);
        Let le5 = new Obstacle(10, 3000);
        Let le6 = new Obstacle(5, 2500);




        Participant[] participants = {p1, p2, p3, p4, p5, p6};

        Let[] lets = {le1, le2, le3, le4, le5, le6};


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






