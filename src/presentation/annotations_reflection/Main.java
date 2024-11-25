package presentation.annotations_reflection;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
    }



    @Deprecated
    public class DeprecatedAnno {
        DeprecatedAnno deprecated = new DeprecatedAnno();
    }

    @MyAnno({10.0, 15.0, Math.PI})
    @Anno("First")
    @Anno("Second")
    public class Person {

        private String name;

        public void showInfo(){
             System.out.println("Person class");
        }
    }

    public class Student extends Person{
        @Override
        public void showInfo() {
            System.out.println("Student class");
        }
    }

    @SafeVarargs
    public final <T extends Double> double sum(T... elements){
        double sum = 0;
        for (T elem : elements){
            sum += elem.doubleValue();
        }
        return sum;
    }
 
    @SuppressWarnings({"unchecked", "deprecation"})
    public <T> T[] makeArray(Class<T> cl, int length){
//        DeprecatedAnno deprecatedAnno = new DeprecatedAnno();
        return (T[]) Array.newInstance(cl, length);
    }

    @FunctionalInterface
    public interface FunctionalInterfaceAnno{
        void abstractMethod();
    }
}
