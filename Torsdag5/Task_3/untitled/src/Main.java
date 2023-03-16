import java.util.Collection;
import java.util.HashSet;

public class Main {


    public static void main(String[] args){

        //Room room1 = new Room(1, 2, 2);
        //Room room2 = new Room(2, 1, 3)
        //Room room3 = new Room(3, 3, 1)

        // Make a building that is a collection of rooms
        Collection roomCollection = new HashSet();
        roomCollection.add(new Room(1,2,2));
        roomCollection.add(new Room(2,1,3));
        roomCollection.add(new Room(3,3,1));
        int totalNumberOfLamps1 = countLampsInRoomCollection(roomCollection);
        System.out.println("Total number of lamps in building: " + totalNumberOfLamps);

        Building building = new Building();

        int totalNumberOfLamps = countLampsInBuilding(building);


    }

    public static int countLampsInRoomCollection(Collection roomCollection){

        int totalNumberOfLamps = 0;
        for (Room room: roomCollection) {
            int nLamps = room.getNumberOfLamps();
            totalNumberOfLamps =+ nLamps;
        }

        return totalNumberOfLamps;
    }

    public static int countLampsInBuilding(Building building){

        int totalNumberOfLamps = 0;
        for (Room room: building) {
            int nLamps = room.getNumberOfLamps();
            totalNumberOfLamps =+ nLamps;
        }

        return totalNumberOfLamps;
    }

}
