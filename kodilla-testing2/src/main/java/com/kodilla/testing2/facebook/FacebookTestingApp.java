package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_ACCEPT_COOKIES = "//div[@class=\"_9xo5\"]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_SELECT_DAY = "//div[@id=\"birthday_wrapper\"]/div/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@id=\"birthday_wrapper\"]/div/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@id=\"birthday_wrapper\"]/div/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        Thread.sleep(1000);

        while(!driver.findElement(By.xpath(XPATH_SELECT_DAY)).isDisplayed());
        WebElement selectDayEl = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectDayEl);
        selectDay.selectByIndex(3);

        while(!driver.findElement(By.xpath(XPATH_SELECT_MONTH)).isDisplayed());
        WebElement selectMonthEl = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectMonthEl);
        selectMonth.selectByIndex(3);

        while(!driver.findElement(By.xpath(XPATH_SELECT_YEAR)).isDisplayed());
        WebElement selectYearEl = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectYearEl);
        selectYear.selectByIndex(40);
    }
}
