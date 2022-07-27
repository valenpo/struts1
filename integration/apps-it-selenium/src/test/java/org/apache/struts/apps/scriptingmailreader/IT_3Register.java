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

// Generated by Selenium IDE
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Subscribers can store login credentials and a primary email contact with the system.
 *
 * @author Stefan Graff
 * @since 1.3.11
 */
@TestMethodOrder(MethodName.class)
public class IT_3Register {
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
  public void test31RegisterHermesMss() {
    // Test name: 3_1_Register Hermes (MSS)
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
    // 5 | type | name=username | hermes
    // username
    driver.findElement(By.name("username")).sendKeys("hermes");
    // 6 | type | name=password | m3dus4
    // password
    driver.findElement(By.name("password")).sendKeys("m3dus4");
    // 7 | type | name=password2 | m3dus4
    // password2
    driver.findElement(By.name("password2")).sendKeys("m3dus4");
    // 8 | type | name=fullName | Hermes Katsopolis
    // fulllName
    driver.findElement(By.name("fullName")).sendKeys("Hermes Katsopolis");
    // 9 | type | name=fromAddress | hermes@somewhere.com
    // fromAddress
    driver.findElement(By.name("fromAddress")).sendKeys("hermes@somewhere.com");
    // 10 | click | name=DO_SUBMIT |
    // Save
    driver.findElement(By.name("DO_SUBMIT")).click();
    // 11 | verifyTitle | MailReader Demonstration Application - Main Menu |
    // Menu page title
    assertEquals("MailReader Demonstration Application - Main Menu", driver.getTitle());
    // 12 | click | linkText=Log off MailReader Demonstration Application |
    // Logoff Hermes
    driver.findElement(By.linkText("Log off MailReader Demonstration Application")).click();
    // 13 | verifyTitle | MailReader Demonstration Application |
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
  }
  @Test
  public void test32VerifyDataEntry1a5a() {
    // Test name: 3_2_Verify data-entry (1a-5a)
    // Step # | name | target | value
    // 1 | open | struts-mailreader/Welcome.do |
    // Open welcome action
    driver.get(home + "Welcome.do");
    // 2 | verifyTitle | MailReader Demonstration Application |
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
    // 3 | click | linkText=Log on to the MailReader Demonstration Application |
    // Click Logon
    driver.findElement(By.linkText("Log on to the MailReader Demonstration Application")).click();
    // 4 | verifyTitle | MailReader Demonstration Application - Logon |
    // Logon page title
    assertEquals("MailReader Demonstration Application - Logon", driver.getTitle());
    // 5 | type | name=username | hermes
    // username
    driver.findElement(By.name("username")).sendKeys("hermes");
    // 6 | type | name=password | m3dus4
    // password
    driver.findElement(By.name("password")).sendKeys("m3dus4");
    // 7 | click | name=Submit |
    // Submit
    driver.findElement(By.name("Submit")).click();
    // 8 | verifyTitle | MailReader Demonstration Application - Main Menu |
    // Menu page title
    assertEquals("MailReader Demonstration Application - Main Menu", driver.getTitle());
    // 9 | click | linkText=Edit your user registration profile |
    // Edit user profile
    driver.findElement(By.linkText("Edit your user registration profile")).click();
    // 10 | verifyTitle | Edit Registration for the MailReader Demonstration Application |
    // Registraion Edit page title
    assertEquals("Edit Registration for the MailReader Demonstration Application", driver.getTitle());
    // 11 | verifyText | css=tr:nth-child(1) > td | hermes
    // Label username
    assertEquals("hermes", driver.findElement(By.cssSelector("tr:nth-child(1) > td")).getText());
    // 12 | verifyValue | name=fullName | Hermes Katsopolis
    // fullName
    {
      String value = driver.findElement(By.name("fullName")).getAttribute("value");
      assertEquals("Hermes Katsopolis", value);
    }
    // 13 | verifyValue | name=fromAddress | hermes@somewhere.com
    // fromAddress
    {
      String value = driver.findElement(By.name("fromAddress")).getAttribute("value");
      assertEquals("hermes@somewhere.com", value);
    }
    // 14 | click | name=org.apache.struts.taglib.html.CANCEL |
    // Cancel
    driver.findElement(By.name("org.apache.struts.taglib.html.CANCEL")).click();
    // 15 | verifyTitle | MailReader Demonstration Application - Main Menu |
    // Menu page title
    assertEquals("MailReader Demonstration Application - Main Menu", driver.getTitle());
    // 16 | click | linkText=Log off MailReader Demonstration Application |
    // Logoff Hermes
    driver.findElement(By.linkText("Log off MailReader Demonstration Application")).click();
    // 17 | verifyTitle | MailReader Demonstration Application |
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
}