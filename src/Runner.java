public class Runner {
    public static void main(String[] args) {
        int result = HelloWorldKt.addFun1(5, 3);
//        int result = Hello.addFun1(5, 3);
        System.out.println(result);

        result = HelloWorldKt.calAmount(50, 0.03);
        System.out.println(result);
        result = HelloWorldKt.calAmount(50);
        System.out.println(result);

        Human3 programmer = new Human3() {
            @Override
            public void think() {
                System.out.println("Think virtually....");
            }
        };
        programmer.think();
    }
}

interface Human3 {
    void think();
}