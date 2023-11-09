

	class GenericClass<T> {
	    private T value;

	    public GenericClass(T value) {
	        this.value = value;
	    }

	    public T getValue() {
	        return value;
	    }
	}

	class ExtendedGenericClass<T> extends GenericClass<T> {
	    public ExtendedGenericClass(T value) {
	        super(value);
	    }
	}

	public class GenericInheritance {
	    public static void main(String[] args) {
	        GenericClass<Integer> intVal= new ExtendedGenericClass<>(42);
	        GenericClass<String> stringVal = new ExtendedGenericClass<>("Hello, Generics!");

	        System.out.println("Integer Value: " + intVal.getValue());
	        System.out.println("String Value: " + stringVal.getValue());
	    }
	}


