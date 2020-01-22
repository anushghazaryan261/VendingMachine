package ThirdProblem;
import java.util.ArrayList;

public class Tree {

    private ArrayList<Leaf> leaves;
    private double height;
    private int maxAmountOfLeaves;

    public Tree(double height) {
        this.height = height;
    }

    public Tree() {
    }

    public int getMaxAmountOfLeaves() {
        return maxAmountOfLeaves;
    }

    public void setMaxAmountOfLeaves(int maxAmountOfLeaves) {
        this.maxAmountOfLeaves = maxAmountOfLeaves;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ArrayList<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(ArrayList<Leaf> leaves) {
        this.leaves = leaves;
    }
    public void bloom(){
        if(leaves.size()!=0){
            for(int i=0;i<leaves.size();i++){
                leaves.get(i).setColor("Green");
                leaves.get(i).setSize(leaves.get(i).getSize()+1);
            }
        }
        else{
            ArrayList<Leaf> newLeaves=new ArrayList<>();
            Leaf newLeaf=new Leaf("Green");
            for(int i=0;i<getMaxAmountOfLeaves();i++){
                leaves.add(newLeaf);
            }
            setLeaves(newLeaves);
        }
    }
    public void makeLeafesYellow(){
        for(int i=0;i<leaves.size();i++){
            leaves.get(i).setColor("Yellow");
        }
    }
    public void makeLeafesFall(){
        leaves.clear();
    }
}
