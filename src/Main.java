public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.age = 10;
        System.out.println(hello.age);

        Hello hello2 = new Hello();
        hello2.age = 40;
        System.out.println(hello2.age);
        System.out.println(hello.age);
    }
}
