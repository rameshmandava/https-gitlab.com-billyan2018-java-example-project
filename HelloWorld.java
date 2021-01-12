public class HelloWorld {
    static int shared = 0;
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }

    public int hello(int a, int b, int c, int d, int e)
    {
        shared = 100;
        return a + b;
    }

}
