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
}
