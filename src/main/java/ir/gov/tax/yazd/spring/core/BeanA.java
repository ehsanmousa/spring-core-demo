package ir.gov.tax.yazd.spring.core;

import java.time.LocalDate;
import java.time.LocalTime;

public class BeanA {
  private LocalTime localTime;

  public BeanA() {
    System.out.println("Called no-arg constructor");
  }

  public BeanA(LocalDate localDate) {
    System.out.printf("Called localDate %s constructor%n", localDate);
  }

  public LocalTime getLocalTime() {
    return localTime;
  }

  public void setLocalTime(LocalTime localTime) {
    System.out.printf("Called localTime %s in setter%n", localTime);
    this.localTime = localTime;
  }
}
