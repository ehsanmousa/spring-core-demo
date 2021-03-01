package ir.gov.tax.yazd.spring.core;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

@Service("beanBService")
public class BeanB implements BeanNameAware, AccessibleBeanName {
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
