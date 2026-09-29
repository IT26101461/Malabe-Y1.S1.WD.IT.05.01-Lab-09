public class IT26101461Lab9Q3 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
    }
}