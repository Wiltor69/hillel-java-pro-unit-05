package hilleluser;

public abstract class Participant {
    Integer jumpHeight;
    Integer runDistance;

    public Participant(Integer jumpHeight, Integer runDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }
    public Participant(){

    }

    public Integer getJumpHeight() {
        return jumpHeight;
    }

    public Integer getRunDistance() {
        return runDistance;
    }
}
