package ir.gov.tax.yazd.spring.core;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Repository;

@Repository("beanCRepo")
public class BeanC implements BeanNameAware, AccessibleBeanName {
  private String beanName;

  @Override
  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
