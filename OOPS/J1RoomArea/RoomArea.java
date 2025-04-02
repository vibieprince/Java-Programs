package J1RoomArea;
class Room {
    double length;
    double breadth;

    void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {  // Added method for better structure
        return length * breadth;
    }
}

class RoomArea {
    public static void main(String args[]) {
        Room room1 = new Room();
        room1.setDimensions(14, 10);

        double area = room1.calculateArea();  // Using a method for better encapsulation

        System.out.println("Area = " + area);
    }
}
