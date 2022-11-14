package hilleluser;

public class Robot extends Participant implements User{
    private String name;

    public Robot(String name) {
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

        return runDistance = 7000;
        }

    @Override
    public Integer jump() {

       //System.out.println(getName() + " to jumping ");
        return jumpHeight = 9;
    }

}
