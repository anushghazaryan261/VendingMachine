public class Test {
    public static void main(String[] args) {

    }


    public static String doSomething(int a) throws MyFirstCheckedExeption {
        if(a<0){
            return "is negative";
        } else{
            return "is not negative";
        }
    }
}
