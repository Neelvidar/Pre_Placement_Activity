class Base {
    public int i, j;

    public Base() {
        System.out.println("Inside Base constructor");
    }

    public void fun() {
        System.out.println("Inside Base fun");
    }

    public void gun() {
        System.out.println("Inside Base gun");
    }
}

class Derived extends Base {
    public int X, Y;

    public Derived() {
        System.out.println("Inside Derived Constructor");
    }

    public void Sun() {
        System.out.println("inside Derived Sun");
    }
}

class SingleLevel {
    public static void main(String A[]) {
        Derived dobj = new Derived();

        dobj.fun();
        dobj.gun();
        dobj.Sun();
    }
}
