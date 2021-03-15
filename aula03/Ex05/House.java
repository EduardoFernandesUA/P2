import java.util.Arrays;

public class House {
    private String houseType;
    private Room[] rooms;
    private int adicDivisions;

    public House(String houseType){
        this.houseType = houseType;
        rooms = new Room[8];
        adicDivisions = 4;
    }

    public House(String houseType, int nDivisions, int adicDivisions){
        this.houseType = houseType;
        rooms = new Room[nDivisions];
        this.adicDivisions = adicDivisions;
    }

    public void addRoom(Room room){
        int i;
        for (i = 0; i < rooms.length; i++) {
            if(rooms[i]==null) {
                rooms[i] = room;
                return;
            }
        }
        // add space
        rooms = Arrays.copyOf(rooms, rooms.length + adicDivisions);
        rooms[i] = room;
    }

    public int size() {
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] == null) return i;
        }
        return rooms.length;
    }

    public int maxSize() {
        return rooms.length;
    }

    public Room room(int i) {
        return rooms[i];
    }

    public double area() {
        double soma = 0;
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i]==null) break;
            soma += rooms[i].area();
        }
        return soma;
    }

    public RoomTypeCount[] getRoomTypeCounts(){
        RoomTypeCount[] count = new RoomTypeCount[1];
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i]==null) break;
            for (int j = 0; j < count.length; j++) {
                if(count[j]==null) {
                    count = Arrays.copyOf(count, count.length+1);
                    count[j] = new RoomTypeCount(); 
                    count[j].roomType = rooms[i].roomType();
                    count[j].count = 1;
                    break;
                }
                if(rooms[i].roomType().equals(count[j].roomType)){
                    count[j].count++;
                    break;
                }
            }
        }
        return Arrays.copyOf(count, count.length-1);
    }

    public double averageRoomDistance(){
        double soma = 0;
        int i = 0;
        for (i = 0; i < rooms.length-1; i++) {
            if(i==rooms.length-1){
                soma += Math.sqrt(Math.pow(rooms[i].geomCenter().x()-rooms[0].geomCenter().x(),2)+Math.pow(rooms[i].geomCenter().y()-rooms[0].geomCenter().y(),2));
                break;
            }
            if(rooms[i+1]==null) {
                soma += Math.sqrt(Math.pow(rooms[i].geomCenter().x()-rooms[0].geomCenter().x(),2)+Math.pow(rooms[i].geomCenter().y()-rooms[0].geomCenter().y(),2));
                break;
            }
            soma += Math.sqrt(Math.pow(rooms[i].geomCenter().x()-rooms[i+1].geomCenter().x(),2)+Math.pow(rooms[i].geomCenter().y()-rooms[i+1].geomCenter().y(),2));
        }
        return soma/i;
    }
}
