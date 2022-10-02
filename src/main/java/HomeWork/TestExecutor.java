package HomeWork;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//        Класс,
//     запускающий тесты, должен иметь статический метод start(Class testClass), которому в качестве
//     аргумента передается объект типа Class
public class TestExecutor {

    public static void start(Class<?> testClass) {
        try {
            startUnsafe(testClass);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void startUnsafe(Class<?> testClass) throws Exception {
        Method[] methods = testClass.getDeclaredMethods();

        Method beforeSuitMethod = null;
        List<Method> testMethods = new ArrayList<>();
        Method afterSuitMethod = null;



        for (Method method : methods) {
            if(method.isAnnotationPresent(BeforeSuite.class)) {
                if(beforeSuitMethod != null) {
                    throw new RuntimeException("Illegal count at befor  annotastion");
                }
                beforeSuitMethod = method;
            }
            if (method.isAnnotationPresent(AfterSuite.class)){
                if(afterSuitMethod != null) {
                    throw new RuntimeException("Illegal count at Aftersuit  annotastion");
                }
                afterSuitMethod = method;
            }

            if(method.isAnnotationPresent(Test.class) ) {
                testMethods.add(method);
            }

        }
        testMethods.sort((m1,m2) -> {
            Test m1Anno = m1.getAnnotation(Test.class);
            Test m2Anno = m2.getAnnotation(Test.class);

            return Integer.compare(m2Anno.order(), m1Anno.order());
        });

         Constructor<?> declaredConstructor = testClass.getDeclaredConstructor();
         if(declaredConstructor != null) {
             throw new RuntimeException("Constructor with no args");
         }

        Object testInstance = declaredConstructor.newInstance();

        if(beforeSuitMethod!=null) {
            beforeSuitMethod.invoke(testInstance);
        }

        for (Method testMethod : testMethods) {
            testMethod.invoke(testInstance);
        }

        if(afterSuitMethod != null) {
            afterSuitMethod.invoke(testInstance);
        }

    }
}
