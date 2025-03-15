# WebDriver Methods in Selenium with Java

This repository provides a comprehensive guide to understanding and using WebDriver methods in Selenium for web automation with Java.

## Table of Contents
1. [Introduction to WebDriver Methods](#introduction-to-webdriver-methods)
2. [Overview of WebDriver Methods](#overview-of-webdriver-methods)
3. [Capturing and Using Page Source](#capturing-and-using-page-source)
4. [Window Handling in WebDriver](#window-handling-in-webdriver)
5. [Handling Synchronization](#handling-synchronization)
6. [Working with Web Elements](#working-with-web-elements)
7. [Closing and Quitting Browser Sessions](#closing-and-quitting-browser-sessions)

## Introduction to WebDriver Methods
- WebDriver methods are essential for interacting with browsers and performing various actions in Selenium automation. These methods provide the ability to control the browser, interact with web elements, handle windows, and perform synchronization.

## Overview of WebDriver Methods
- WebDriver provides a wide range of methods for interacting with browsers and web elements.
- These methods are categorized into:
  - Browser management methods
  - Element interaction methods
  - Navigation methods
  - Synchronization methods

## Capturing and Using Page Source
- Selenium WebDriver allows capturing the current page's HTML source using the `getPageSource()` method.
- This method helps extract the page content and can be used for validation or debugging purposes.

## Window Handling in WebDriver
- WebDriver provides methods to handle multiple browser windows:
  - `getWindowHandle()`: Retrieves the window handle of the current window.
  - `getWindowHandles()`: Retrieves all window handles currently open.
  - Switching between browser windows can be done using window IDs, allowing Selenium to perform actions in multiple windows.

## Handling Synchronization
- Synchronization is crucial for ensuring that the automation script waits for elements to be ready before interacting with them.
- WebDriver provides methods like `wait`, `implicitlyWait`, and `explicitWait` to manage synchronization in automated scripts.

## Working with Web Elements
- Selenium WebDriver allows interaction with web elements through methods like:
  - `isDisplayed()`: Checks if an element is visible on the page.
  - `isEnabled()`: Checks if an element is enabled for interaction.
- These methods are useful for validating the state of elements before performing actions like clicking, typing, or selecting.

## Closing and Quitting Browser Sessions
- WebDriver provides two methods for handling browser sessions:
  - `close()`: Closes the current browser window.
  - `quit()`: Closes all browser windows and ends the WebDriver session.

---

## Installation

To get started with Selenium and WebDriver methods, follow these steps:

1. Install Java from the official [Oracle website](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html).
2. Install Selenium WebDriver by adding the dependency to your project’s `pom.xml` (for Maven users):

   ```xml
   <dependency>
       <groupId>org.seleniumhq.selenium</groupId>
       <artifactId>selenium-java</artifactId>
       <version>3.141.59</version>
   </dependency>
