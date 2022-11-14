package hilleluser;

public class Wall implements Let{
    Integer height;



    public Wall(Integer wall) {
        this.height = wall;
    }

    @Override
    public boolean overcome(Participant participant) {

        if(height < participant.getJumpHeight()){
            return true;
        } else
        return false;
    }
}
