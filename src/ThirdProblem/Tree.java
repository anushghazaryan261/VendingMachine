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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tree tree = (Tree) o;

        if (Double.compare(tree.height, height) != 0) return false;
        if (maxAmountOfLeaves != tree.maxAmountOfLeaves) return false;
        return leaves != null ? leaves.equals(tree.leaves) : tree.leaves == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = leaves != null ? leaves.hashCode() : 0;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + maxAmountOfLeaves;
        return result;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leaves=" + leaves +
                ", height=" + height +
                ", maxAmountOfLeaves=" + maxAmountOfLeaves +
                '}';
    }
}
