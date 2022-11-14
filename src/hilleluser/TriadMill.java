package hilleluser;

public class TriadMill implements Let{
    Integer distance;
    Human human;
    Cat cat;
    Robot robot;
    public TriadMill(Integer distance) {
        this.distance = distance;
    }


    @Override
    public boolean overcome(Participant participant) {

        if(distance < participant.getRunDistance()){
            return true;
        } else
        return false;
    }
}
