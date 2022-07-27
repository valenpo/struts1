/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.struts.apps.scriptingmailreader;

//Generated by Selenium IDE
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *  Visitors can browse the Welcome, Login, and Register pages (only) without presenting credentials.
 *
 * @author Stefan Graff
 * @since 1.3.11
 */
@TestMethodOrder(MethodName.class)
public class IT_1Browse {
  private WebDriver driver;
  private String home;

  @BeforeEach
  public void setUp() {
    driver = WebDriverManager.getInstance().create();
    home = "http://localhost:"
            + System.getProperty("cargo.servlet.port")
            + "/struts-scripting-mailreader/";
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void test11BrowsePublicPagesMss() {
    // Test name: 1_1_Browse public pages (MSS)
    // Step # | name | target | value
    // 1 | open | struts-mailreader/Welcome.do |
    // Open welcome action
    driver.get(home + "Welcome.do");
    // 2 | verifyTitle | MailReader Demonstration Application |
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
    // 3 | click | linkText=Register with the MailReader Demonstration Application |
    // Click Register
    driver.findElement(By.linkText("Register with the MailReader Demonstration Application")).click();
    // 4 | verifyTitle | Register for the MailReader Demonstration Application |
    // Registration page title
    assertEquals("Register for the MailReader Demonstration Application", driver.getTitle());
    // 5 | click | linkText=MailReader Demonstration Application |
    // Click Welcome
    driver.findElement(By.linkText("MailReader Demonstration Application")).click();
    // 6 | verifyTitle | MailReader Demonstration Application |
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
    // 7 | click | linkText=Log on to the MailReader Demonstration Application |
    // Click Logon
    driver.findElement(By.linkText("Log on to the MailReader Demonstration Application")).click();
    // 8 | verifyTitle | MailReader Demonstration Application - Logon |
    // Logon page title
    assertEquals("MailReader Demonstration Application - Logon", driver.getTitle());
    // 9 | click | linkText=MailReader Demonstration Application |
    // Click Welcome
    driver.findElement(By.linkText("MailReader Demonstration Application")).click();
    // 10 | verifyTitle | MailReader Demonstration Application |
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
  }
  @Test
  public void test12BrowseNonPublicPagesAndFail5a() {
    // Test name: 1_2_Browse non-public pages (and fail) (5a)
    // Step # | name | target | value
    // 1 | open | struts-mailreader/SubmitLogon.do |
    // Skip Logon page
    driver.get(home + "SubmitLogon.do");
    // 2 | verifyTitle | MailReader Demonstration Application - Logon |
    // Logon page title
    assertEquals("MailReader Demonstration Application - Logon", driver.getTitle());
    // 3 | assertElementPresent | xpath=//*[contains(text(),'Validation Error')] |
    // Test Validation Error
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),\'Validation Error\')]"));
      assertTrue(elements.size() > 0);
    }
    // 4 | open | struts-mailreader/SaveRegistration.do |
    // Skip Save RegistrationAction page
    driver.get(home + "SaveRegistration.do");
    // 5 | verifyTitle | Register for the MailReader Demonstration Application |
    // Registration page title
    assertEquals("Register for the MailReader Demonstration Application", driver.getTitle());
    // 6 | assertElementPresent | xpath=//*[contains(text(),'Validation Error')] |
    // Test Validation Error
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),\'Validation Error\')]"));
      assertTrue(elements.size() > 0);
    }
  }

  /**
   * For JDK 1.7 compatibility
   * <em>Assert</em> that {@code expected} and {@code actual} are equal.
   * <p>If both are {@code null}, they are considered equal.
   *
   * @see Object#equals(Object)
   */
  private static void assertEquals(Object expected, Object actual) {
    Assertions.assertEquals(expected, actual);
  }

  /**
   * For JDK 1.7 compatibility
   * <em>Assert</em> that the supplied {@code condition} is {@code true}.
   */
  private static void assertTrue(boolean condition) {
    Assertions.assertTrue(condition);
  }
}