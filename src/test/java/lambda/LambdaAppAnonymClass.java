package lambda;

public class LambdaAppAnonymClass {
    public static void main(String[] args) {
        Operationable operation = new Operationable() {
            public int calculate(int x, int y){
                return x + y;
            }
        };
        int z = operation.calculate(20, 10);
        System.out.println(z); // 30
    }
}