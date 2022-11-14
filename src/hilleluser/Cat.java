package hilleluser;

public class Cat extends Participant implements User {
    private String name;

    public Cat(String name) {

        this.name = name;
    }

    public Cat() {
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
        return runDistance = 1000;
    }

    @Override
    public Integer jump() {

        //System.out.println(getName() + " to jumping ");
        return jumpHeight = 3;
    }


}


