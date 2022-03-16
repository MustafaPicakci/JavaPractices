package calculator;

import java.lang.reflect.InvocationTargetException;;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class CalculatorClassLoader {
    public Object load(String jarFilePath, String className) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        URLClassLoader urlClassLoader = new URLClassLoader(
                new URL[]{new URL("File:" + jarFilePath)},
                this.getClass().getClassLoader()
        );
        Class classToLoad = Class.forName(className, true, urlClassLoader);
        Object instance = classToLoad.getDeclaredConstructor().newInstance();
        return instance;
    }

}
