package main.java.utils;

import main.java.homework_6.DataProviderClass;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import test.java.utils.RetryAnalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        iTestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);
        iTestAnnotation.setDataProviderClass(DataProviderClass.class);
        iTestAnnotation.setDataProvider("dp");
    }
}
