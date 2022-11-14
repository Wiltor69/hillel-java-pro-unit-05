package hilleluser;

public abstract class Participant {
    Integer jumpHeight;
    Integer runDistance;
    Human human;
    Cat cat;
    Robot robot;

    public Participant(Integer jumpHeight, Integer runDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public Participant() {

    }

    public Integer getJumpHeight() {
        return jumpHeight = 5;
    }

    public void setJumpHeight(Integer jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public Integer getRunDistance() {

        return runDistance = 5000;
    }

    public void setRunDistance(Integer runDistance) {
        this.runDistance = runDistance;
    }

}
