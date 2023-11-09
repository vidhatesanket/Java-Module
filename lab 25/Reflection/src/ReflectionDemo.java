
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {
        ExampleClass example = new ExampleClass();
        Method privateMethod = ExampleClass.class.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(example);
    }
}

class ExampleClass {
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}