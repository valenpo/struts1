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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Subscribers can maintain a set of email subscriptions for an account.
 *
 * @author Stefan Graff
 * @since 1.3.11
 */
@TestMethodOrder(MethodName.class)
public class IT_6Verify {
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
  public void test61VerifyDataEntry5a() {
    // Test name: 6_1_Verify data-entry (5a)
    // Step # | name | target | value
    // 1 | open | struts-mailreader/Logon.do |
    // Pass logon
    driver.get(home + "Logon.do");
    // 2 | verifyTitle | MailReader Demonstration Application - Logon |
    // Logon page title
    assertEquals("MailReader Demonstration Application - Logon", driver.getTitle());
    // 3 | type | name=username | hermes
    // Registered username
    driver.findElement(By.name("username")).sendKeys("hermes");
    // 4 | type | name=password | m3dus4
    // Correct password
    driver.findElement(By.name("password")).sendKeys("m3dus4");
    // 5 | click | name=Submit |
    // Submit
    driver.findElement(By.name("Submit")).click();
    // 6 | verifyTitle | MailReader Demonstration Application - Main Menu |
    // Menu page title
    assertEquals("MailReader Demonstration Application - Main Menu", driver.getTitle());
    // 7 | click | linkText=Edit your user registration profile |
    // Click Edit Profile
    driver.findElement(By.linkText("Edit your user registration profile")).click();
    // 8 | verifyTitle | Edit Registration for the MailReader Demonstration Application |
    // Registraion Edit page title
    assertEquals("Edit Registration for the MailReader Demonstration Application", driver.getTitle());
    // 9 | click | linkText=Add |
    // Click Add
    driver.findElement(By.linkText("Add")).click();
    // 10 | verifyTitle | Create New Mail Subscription |
    // Add Subscription title
    assertEquals("Create New Mail Subscription", driver.getTitle());
    // 11 | click | name=DO_SUBMIT |
    // Save subscription
    driver.findElement(By.name("DO_SUBMIT")).click();
    // 12 | assertElementPresent | xpath=//*[contains(text(),'Validation Error')] |
    // Validation Error on saving with no input
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),\'Validation Error\')]"));
      assertTrue(elements.size() > 0);
    }
    // 13 | echo | FIXME: Allows blanks for host and other fields |
    // FIXME: Allows blanks for host and other fields
    System.out.println("FIXME: Allows blanks for host and other fields");
    // 14 | sendKeys | name=host | ${KEY_SPACE}${KEY_SPACE}
    // Mail Server
    driver.findElement(By.name("host")).sendKeys(Keys.SPACE, Keys.SPACE);
    // 15 | sendKeys | name=username | ${KEY_SPACE}${KEY_SPACE}
    // Mail Username
    driver.findElement(By.name("username")).sendKeys(Keys.SPACE, Keys.SPACE);
    // 16 | sendKeys | name=password | ${KEY_SPACE}${KEY_SPACE}
    // Mail Password
    driver.findElement(By.name("password")).sendKeys(Keys.SPACE, Keys.SPACE);
    // 17 | click | name=DO_SUBMIT |
    // Save subscription
    driver.findElement(By.name("DO_SUBMIT")).click();
    // 18 | assertElementPresent | xpath=//*[contains(text(),'Validation Error')] |
    // Validation Error on saving with no input
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),\'Validation Error\')]"));
      assertTrue(elements.size() > 0);
    }
    // 19 | click | name=org.apache.struts.taglib.html.CANCEL |
    // Cancel subscription
    driver.findElement(By.name("org.apache.struts.taglib.html.CANCEL")).click();
    // 20 | click | name=DO_SUBMIT |
    // Save user
    driver.findElement(By.name("DO_SUBMIT")).click();
    // 21 | verifyTitle | MailReader Demonstration Application - Main Menu |
    // Menu page title
    assertEquals("MailReader Demonstration Application - Main Menu", driver.getTitle());
    // 22 | click | linkText=Log off MailReader Demonstration Application |
    // Logoff Hermes
    driver.findElement(By.linkText("Log off MailReader Demonstration Application")).click();
    // 23 | verifyTitle | MailReader Demonstration Application |
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
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