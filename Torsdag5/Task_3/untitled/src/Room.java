public class Room {

    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int nDoors, int nLamps, int nWindows){
        numberOfDoors = nDoors;
        numberOfLamps = nLamps;
        numberOfWindows = nWindows;

    }
 /*public void add(int nDoors, int nLamps, int nWindows){
     numberOfDoors = nDoors;
     numberOfLamps = nLamps;
     numberOfWindows = nWindows;

 }*/
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}