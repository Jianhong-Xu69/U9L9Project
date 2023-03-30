public class ThreeDPoint extends Point{

    private int zCoord;
    public ThreeDPoint(String lab, int x, int y, int z){
        super(lab, x, y);
        zCoord = z;
    }

    public int getzCoord() {
        return zCoord;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ThreeDPoint){
            if (super.equals(obj) && ((ThreeDPoint) obj).getzCoord() == this.getzCoord()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", z = " + getzCoord();
    }
}
