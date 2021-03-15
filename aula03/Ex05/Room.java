public class Room {
    private Point topRight;
    private Point bottomLeft;
    private String roomType;

    public Room(Point topRigth, Point bottomLeft, String roomType){
        this.topRight = topRigth;
        this.bottomLeft = bottomLeft;
        this.roomType = roomType;
    }

    public Point geomCenter() {
        return new Point((topRight.x()+bottomLeft().x())/2,(topRight.y()+bottomLeft().y())/2);
    }

    public double area() {
        double width = topRight.x()-bottomLeft.x();
        double height = topRight.y()-bottomLeft.y();
        return width*height;
    }

    public Point topRight() { return topRight; }
    public Point bottomLeft() { return bottomLeft; }
    public String roomType() { return roomType; }
}
