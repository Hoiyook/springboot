package com.common.annotation;

import java.lang.annotation.Annotation;

public class UserAnotationTestMain {
    public static void main(String[] args) {
        try {
            Class<UserAnotationTest> aClass = (Class<UserAnotationTest>) Class.forName("com.common.annotation.UserAnotationTest");
            Annotation[] annotations = aClass.getAnnotations();
            for (Annotation annotation : annotations) {
                User user = (User) annotation;
                System.out.println(user.username());

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
