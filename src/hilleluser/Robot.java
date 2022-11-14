package hilleluser;

public class Robot extends Participant implements User{
    private Integer jumpHeight;
    private Integer runDistance;

    public Robot(Integer jumpHeight, Integer runDistance) {
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

    @Override
    public void jump() {

       System.out.println(" to jumping ");

    }

}
