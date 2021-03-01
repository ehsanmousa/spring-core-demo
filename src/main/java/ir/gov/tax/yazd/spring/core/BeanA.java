package ir.gov.tax.yazd.spring.core;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("beanAComponent")
public class BeanA {

  private AccessibleBeanName bean;

  public AccessibleBeanName getBean() {
    return bean;
  }

  @Resource(name = "beanBService")
  public void setBean(AccessibleBeanName bean) {
    this.bean = bean;
  }
}
