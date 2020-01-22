package FifthProblem;

public class Puppy extends Dog{
    @Override
    public void setAge(double age) {
        if(age>0&&age<=1){
            super.setAge(age);
        }


    }
}
