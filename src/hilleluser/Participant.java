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

    public void setJumpHeight(Integer jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void setRunDistance(Integer runDistance) {
        this.runDistance = runDistance;
    }

    public Integer getJumpHeight() {
        return jumpHeight;
    }

    public Integer getRunDistance() {
        return runDistance;
    }
}
