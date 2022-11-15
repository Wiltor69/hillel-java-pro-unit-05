package hilleluser;

public class Cat extends Participant implements User {
    private String name;
    private Integer jumpHeight;
    private Integer runDistance;

    public Cat(String name,Integer jumpHeight, Integer runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(Integer jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    public Integer getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(Integer runDistance) {
        this.runDistance = runDistance;
    }

    @Override
    public void run() {

        System.out.println(getName() + " to running ");

    }

    @Override
    public void jump() {

        System.out.println(getName() + " to jumping ");

    }


}


