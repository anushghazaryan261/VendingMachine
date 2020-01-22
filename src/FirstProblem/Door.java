package FirstProblem;

public class Door {
    private double width;
    private double height;
    private String material;
    private boolean isLocked;

    public Door(double height) {
        this.height = height;
    }

    public Door(double height,double width){
        this.height=height;
        this.width=width;
    }

    public Door(String material) {
        this.material = material;
    }

    public Door() {
    }


    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Door door = (Door) o;

        if (Double.compare(door.width, width) != 0) return false;
        if (Double.compare(door.height, height) != 0) return false;
        if (isLocked != door.isLocked) return false;
        return material != null ? material.equals(door.material) : door.material == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (material != null ? material.hashCode() : 0);
        result = 31 * result + (isLocked ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Door{" +
                "width=" + width +
                ", height=" + height +
                ", material='" + material + '\'' +
                ", isLocked=" + isLocked +
                '}';
    }
}
