package com.groupProjects.project2;

public interface WebDriver {

    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends WebDriver,TakeScreenshot{
    void navigate();
}
 class SafariDriver implements RemoteWebDriver{
     @Override
     public void navigate() {
     }
     @Override
     public void open() {
     }
     @Override
     public void close() {
     }
     @Override
     public String getTitle() {
         return null;
     }

     @Override
     public void getScreenshot() {

     }
 }
 class FirefoxDriver implements RemoteWebDriver{
     @Override
     public void open() {
     }
     @Override
     public void close() {
     }
     @Override
     public String getTitle() {
         return null;
     }
     @Override
     public void navigate() {
     }

     @Override
     public void getScreenshot() {

     }
 }
 class ChromeDriver implements RemoteWebDriver{
     @Override
     public void open() {
     }
     @Override
     public void close() {
     }
     @Override
     public String getTitle() {
         return null;
     }
     @Override
     public void navigate() {
     }

     @Override
     public void getScreenshot() {

     }
 }
 interface TakeScreenshot{
    void getScreenshot();
 }


