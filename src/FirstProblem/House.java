package FirstProblem;

public class House {

    private Door[] doors;
    private Window[] windows;
    private String adress;

    public House(Door[] doors) {
        this.doors = doors;
    }

    public House(Window[] windows) {
        this.windows = windows;
    }

    public House(String adress) {
        this.adress = adress;
    }

    public House() {
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
        System.out.println("Locking the house by key");
    }
    public void printQuantityOfWindows(){
        System.out.println("The quantity of windows is: " + this.windows.length);
    }
    public void printQuantityOfDoors(){
        System.out.println("The quantity of doors is: " + this.doors.length);
    }
}
