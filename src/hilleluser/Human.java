package hilleluser;

public class Human implements User{
    private String name;

    public Human(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public class Obstacle implements Let{
        private double heightWall;
        private int distanceTrack;

        public Obstacle(double heightWall, int distanceTrack) {
            this.heightWall = heightWall;
            this.distanceTrack = distanceTrack;
        }

        public int getDistanceTrack() {
            return distanceTrack;
        }

        public void setDistanceTrack(int distanceTrack) {
            this.distanceTrack = distanceTrack;
        }

        public double getHeightWall() {
            return heightWall;
        }

        public void setHeightWall(int heightWall) {
            this.heightWall = heightWall;
        }


        public void overcome() {
            jump();
            run();
            if (getHeightWall() >= 3 ){
                System.out.println("User " + getName() + " can not jump on " + getHeightWall() + " m" );

            } else if (getDistanceTrack() >= 5000){
                System.out.println("User " + getName() + " can not run " + getHeightWall() + " m" );

            } else

            System.out.println("User " + getName() + " jump on " + getHeightWall() + " m ");

            System.out.println("User " + getName() + " run " + getDistanceTrack() + " m ");

        }

    }

    @Override
    public void run() {
        System.out.println(getName() + " to running ");
    }

    public void jump () {
        System.out.println(getName() + " to jumping ");
    }


}
