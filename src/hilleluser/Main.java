package hilleluser;

public class Main {
    public static void main(String[] args) {

        Human hm = new Human("John");
        Human.Obstacle hw = hm.new Obstacle(5, 1000);


        Cat cat = new Cat("Barsic");
        Cat.Obstacle cw = cat.new Obstacle(3, 200);

        Human hm1 = new Human("Bill");
        Human.Obstacle hw1 = hm1.new Obstacle(1.5, 100);

        Robot rob = new Robot("R2D2");
        Robot.Obstacle ro = rob.new Obstacle(6,1400);

        User[] user = {hm, cat, hm1,rob};
        Let[] let = {hw, cw, hw1,ro};

        grossOvercome(user, let);
    }

    public static void grossOvercome(User[] user, Let[] let) {
        for (int i = 0; i < user.length; i++) {
            let[i].overcome();
            }
            System.out.println(" ");

        }
    }



