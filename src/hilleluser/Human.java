package hilleluser;

public class Human extends Participant implements User {
    private String name;
    Human human;


    public Human(String name) {
        super();
        this.name = name;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }


    @Override
    public Integer run() {

        //System.out.println(getName() + " to running ");
        return human.runDistance = 5000;
    }

    public Integer jump() {

        //System.out.println(getName() + " to jumping ");
        return human.jumpHeight = 5;
    }


}
