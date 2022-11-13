package hilleluser;

public class Cat implements User {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(getName() + " to running ");
    }

    @Override
    public void jump() {
        System.out.println(getName() + " to jumping ");
    }

    public class Obstacle implements Let {
        private double heightWall;
        private int distanceTrack;

        public Obstacle(double heightWall, int distanceTrack) {
            this.heightWall = heightWall;
            this.distanceTrack = distanceTrack;
        }

        public double getHeightWall() {
            return heightWall;
        }

        public void setHeightWall(int heightWall) {
            this.heightWall = heightWall;
        }

        public int getDistanceTrack() {
            return distanceTrack;
        }

        public void setDistanceTrack(int distanceTrack) {
            this.distanceTrack = distanceTrack;
        }

         @Override
        public void overcome() {
            jump();
            run();
             if (getHeightWall() >= 5){
                 System.out.println("User " + getName() + " can not jump on " + getHeightWall() + " m" );

             } else if (getDistanceTrack() >= 1000){
                 System.out.println("User " + getName() + " can not run " + getHeightWall() + " m" );

             } else
             System.out.println("User " + getName() + " jump on " + getHeightWall() + " m ");

             System.out.println("User " + getName() + " run " + getDistanceTrack() + " m ");
        }

    }
}


