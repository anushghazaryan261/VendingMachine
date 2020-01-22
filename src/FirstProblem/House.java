package FirstProblem;

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
}
