package VendingMachine;

import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class VendingMachine {
    private double height;
    private String color;
    private HashMap<Character, LinkedList<Product>> productsInTheFirstColumn;
    private HashMap<Character, LinkedList<Product>> productsInTheSecondColumn;
    private HashMap<Character, LinkedList<Product>> productsInTheThirdColumn;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public HashMap<Character, LinkedList<Product>> getProductsInTheFirstColumn() {
        return productsInTheFirstColumn;
    }

    public void setProductsInTheFirstColumn(HashMap<Character, LinkedList<Product>> productsInTheFirstColumn) {
        this.productsInTheFirstColumn = productsInTheFirstColumn;
    }

    public HashMap<Character, LinkedList<Product>> getProductsInTheSecondColumn() {
        return productsInTheSecondColumn;
    }

    public void setProductsInTheSecondColumn(HashMap<Character, LinkedList<Product>> productsInTheSecondColumn) {
        this.productsInTheSecondColumn = productsInTheSecondColumn;
    }

    public HashMap<Character, LinkedList<Product>> getProductsInTheThirdColumn() {
        return productsInTheThirdColumn;
    }

    public void setProductsInTheThirdColumn(HashMap<Character, LinkedList<Product>> productsInTheThirdColumn) {
        this.productsInTheThirdColumn = productsInTheThirdColumn;
    }

    public  Product getProductByCommand(Command command){
        if(command.getRaw()=='A'){
            if(command.getColumn()==1){
                productsInTheFirstColumn.get('A').remove();
                return productsInTheFirstColumn.get('A').element();
            }
            else if(command.getColumn()==2){
                productsInTheSecondColumn.get('A').remove();
                return productsInTheSecondColumn.get('A').element();
            }
            else if(command.getColumn()==3){
                productsInTheThirdColumn.get('A').remove();
                return productsInTheThirdColumn.get('A').element();
            }
        } else if(command.getRaw() =='B'){
            if(command.getColumn()==1){
                productsInTheFirstColumn.get('B').remove();
                return productsInTheFirstColumn.get('B').element();
            }
            else if(command.getColumn()==2){
                productsInTheSecondColumn.get('B').remove();
                return productsInTheSecondColumn.get('B').element();
            }
            else if(command.getColumn()==3){
                productsInTheThirdColumn.get('B').remove();
                return productsInTheThirdColumn.get('B').element();
            }
        } else if(command.getRaw()=='C'){
            if(command.getColumn()==1){
                productsInTheFirstColumn.get('C').remove();
                return productsInTheFirstColumn.get('C').element();
            }
            else if(command.getColumn() ==2){
                productsInTheSecondColumn.get('C').remove();
                return productsInTheSecondColumn.get('C').element();
            }
            else if(command.getColumn()==3){
                productsInTheThirdColumn.get('C').remove();
                return productsInTheThirdColumn.get('C').element();
            }
        }
        System.out.println("Wrong command!");
        return null;

    }
}
