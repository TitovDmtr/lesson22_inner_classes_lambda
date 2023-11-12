package inner_classes;

public class MainOuterClass {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();

        // Не можна так звертатися
        //StaticNestedClass staticNestedClass = new StaticNestedClass();

        // Виклик метода
        staticNestedClass.someMethod();
    }
}