public class MyTest1 {
    public static void main(String[] args) {
        MyInterface test1 = new MyInterface() {
            @Override
            public int test(int a, int b) {
                return a - b;
            }
        };
        System.out.println(test1.test(90, 8));//82

        //简写1：
        MyInterface test2 = (int a, int b) -> {
            return a - b;
        };
        System.out.println(test2.test(20, 10));//10

        //简写2：
        MyInterface test3 = (a, b) -> {return a - b;};
        System.out.println(test3.test(30, 10));//20

        //简写3：
        MyInterface test4 = (a, b) -> a - b;
        System.out.println(test4.test(40, 10));//30
    }
}
