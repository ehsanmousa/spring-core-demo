package ir.gov.tax.yazd.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    try (var appCtx = new AnnotationConfigApplicationContext(AppConfig.class)) {
      var beanA = appCtx.getBean("beanAComponent", BeanA.class);
      System.out.println(beanA.getBean().getBeanName());
    }
  }
}
