package lambda;

public class FunctionalInterfaceWithLambdaGeneric {

    // Example 8
    @FunctionalInterface
    interface Operator <T> {
        T process(T a, T b);
    }

    public static void main(String[] args) {
        Operator<Integer> addOperation = (a, b) -> {
            int c = a + b;
            return c;
        };
        System.out.println(addOperation.process(5, 6));

        Operator<String> concatOperation = (a, b) -> a + b;
        System.out.println(concatOperation.process("5", "6"));

        Operator<String> concatOperation1 = (a, b) -> a + b;
        System.out.println(concatOperation.process("five", "six"));

        Operator<Integer> multiplyOperation = (a, b) -> a * b;
        System.out.println(multiplyOperation.process(5, 6));
    }
}