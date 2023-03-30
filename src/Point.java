public class Point {

    private String label;
    private int xCoord;
    private int yCoord;
    public Point(String lab, int x, int y){
        label = lab;
        xCoord = x;
        yCoord = y;
    }

    public String getLabel() {
        return label;
    }
    public int getxCoord() {
        return xCoord;
    }
    public int getyCoord() {
        return yCoord;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point){
            if (((Point) obj).getxCoord() == this.getxCoord() && ((Point) obj).getyCoord() == this.getyCoord()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Point " + getLabel() + " is at x = " + getxCoord() + ", y = " + getyCoord();
    }
}
