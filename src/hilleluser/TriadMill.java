package hilleluser;

public class TriadMill implements Let{
    Integer distance;

    public TriadMill(Integer distance) {
        this.distance = distance;
    }


    @Override
    public boolean overcome(Participant participant) {

        if(distance < participant.getRunDistance()){
            return true;
        }
        return false;
    }
}
