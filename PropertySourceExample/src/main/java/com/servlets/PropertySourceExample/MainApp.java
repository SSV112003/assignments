package com.servlets.PropertySourceExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        MyBean bean = context.getBean(MyBean.class);
        bean.printProperties();

        context.close();
    }
}
