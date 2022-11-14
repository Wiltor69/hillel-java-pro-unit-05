package hilleluser;

public class Human extends Participant implements User {
     private Integer jumpHeight;
    private Integer runDistance;

    public Human(Integer jumpHeight1, Integer runDistance1) {
        super();
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
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
        System.out.println(" to running ");
    }

    public void jump() {
        System.out.println(" to jumping ");
    }


}
