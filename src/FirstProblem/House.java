package FirstProblem;

import java.util.Arrays;

public class House {

    private Door[] doors;
    private Window[] windows;
    private String address;

    public House(Door[] doors) {
        this.doors = doors;
    }

    public House(Window[] windows) {
        this.windows = windows;
    }

    public House(String address) {
        this.address = address;
    }

    public House() {
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }



    public Door[] getDoors() {
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    public Window[] getWindows() {
        return windows;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }

    public void lockTheHouseByKey(){
        if(!doors[0].isLocked()){
            doors[0].setLocked(true);
        }
    }
    public void printQuantityOfWindows(){
        System.out.println("The quantity of windows is: " + this.windows.length);
    }
    public void printQuantityOfDoors(){
        System.out.println("The quantity of doors is: " + this.doors.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(doors, house.doors)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(windows, house.windows)) return false;
        return address != null ? address.equals(house.address) : house.address == null;

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(doors);
        result = 31 * result + Arrays.hashCode(windows);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "doors=" + Arrays.toString(doors) +
                ", windows=" + Arrays.toString(windows) +
                ", address='" + address + '\'' +
                '}';
    }
}
