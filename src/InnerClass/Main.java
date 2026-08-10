package InnerClass;

class OuterClass {
    public void show(){
        System.out.println("OuterClass Show print");
    }

    static class InnerClass {
        public void show(){
            System.out.println("InnerClass Show print");
        }
    }

    class InnerClass2 {
        public void show(){
            System.out.println("InnerClass2 Show print");
        }
    }
}

public class Main {
    public static void main(String[] a) {
        OuterClass o = new OuterClass();
        o.show();

        OuterClass.InnerClass i = new OuterClass.InnerClass();
        i.show();

        OuterClass.InnerClass2 i2 = new OuterClass().new InnerClass2();
        i2.show();
    }
}