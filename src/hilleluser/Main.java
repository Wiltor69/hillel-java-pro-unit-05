package hilleluser;

public class Main {
    public static void main(String[] args) {


        Participant[] participants = {new Human(3, 3000), new Human(2, 2000),
                new Cat(5,1500), new Cat(4,2000),
                new Robot(7,10000), new Robot(10,5000)};

        Let[] lets = {new Wall(6), new Wall(11), new Wall(15), new TriadMill(100),
                new TriadMill(5000), new TriadMill(10000)};


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






