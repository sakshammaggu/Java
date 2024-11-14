// generic class having one parameter
class genericClassHavingOneParameter<T> {
    T obj;

    genericClassHavingOneParameter (T obj) {
        this.obj=obj;
    }

    public T getGenericObject() {
        return this.obj;
    }
}

// generic class having more than one parameter
class genericClassHavingMoreThanOneParameter<T, U> {
    T obj1;
    U obj2;

    genericClassHavingMoreThanOneParameter(T obj1, U obj2) {
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public T getTObj() {
        return this.obj1;
    }

    public U getUObj() {
        return this.obj2;
    }

    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class genericClass {
    public static void main(String[] args) {
        genericClassHavingOneParameter<Integer> intObj=new genericClassHavingOneParameter<Integer>(15);
        System.out.println(intObj.getGenericObject());

        genericClassHavingOneParameter<String> strObj=new genericClassHavingOneParameter<String>("Hello world");
        System.out.println(strObj.getGenericObject());

        genericClassHavingMoreThanOneParameter<String, Integer> obj=new genericClassHavingMoreThanOneParameter<String, Integer>("Hi", 20);
        System.out.println(obj.getTObj());
        System.out.println(obj.getUObj());
        obj.print();
    }
}