package FourthProblem;
import java.util.ArrayList;

public class PhotoAlbum {
    private ArrayList<Photo> photos;
    private double width;
    private double height;

    public PhotoAlbum(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public PhotoAlbum() {
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

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }
    public void givaNameToPhotoByIndex(int index,String name){
        photos.get(index).setName(name);
    }
    public void addPhoto(Photo photo){
        photos.add(photo);
    }
    public void printQuantityOfPhotos(){
        System.out.println("The quantity of Photos is: " + photos.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoAlbum that = (PhotoAlbum) o;

        if (Double.compare(that.width, width) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        return photos != null ? photos.equals(that.photos) : that.photos == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = photos != null ? photos.hashCode() : 0;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "PhotoAlbum{" +
                "photos=" + photos +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
