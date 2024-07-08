public class classesAndObjects {
    int x=10;
    void myFunc() {
        System.out.println(x);
    }
    public static void main(String[] args) {
        classesAndObjects myObj=new classesAndObjects();
        System.out.println(myObj.x);
        myObj.myFunc();
    }
}