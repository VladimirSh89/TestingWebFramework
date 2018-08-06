package Functions;

import Driver.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Functions {

    WebDriver driver;
    public static Map<String, String> hashMap;

    public void initialize() {
        DriverFactory.setUpDriver();
        this.driver = DriverFactory.getCurrentDriver();
    }

    public void onPage(String page) throws ClassNotFoundException {
        hashMap = new HashMap<>();
        Class<?> c = Class.forName("com.pages." + page);
        while (c != null) {
            for(Field field : c.getDeclaredFields()) {
                if(field.isAnnotationPresent(FindBy.class)) {
                    field.setAccessible(true);
                    FindBy findBy = field.getAnnotation(FindBy.class);
                    String elementName = field.getName();
                    String locator = findBy.using();
                    hashMap.put(elementName, locator);
                }
            }
            c = c.getSuperclass();
        }
    }

    public String getElement(String element) {
        if(hashMap.size() <= 0) {
            Assert.assertTrue(false);
        }
        String value = null;
        for(Map.Entry<String, String> entry : hashMap.entrySet()) {
            String keyFromMap = entry.getKey();
            if(keyFromMap.equalsIgnoreCase(element)) {
                value = entry.getValue();
                break;
            }
        }
        return value;
    }

    public void clickElement(String element) {
        String locator = getElement(element);
        WebElement webElement = driver.findElement(By.xpath(locator));
        webElement.click();
    }

    public void enterValueToAField(String element, String value) {
        String locator = getElement(element);
        WebElement webElement = driver.findElement(By.xpath(locator));
        webElement.sendKeys(value);
    }

    public void selectFromDropDown(String element, String value) {
        String locator = getElement(element);
        WebElement webElement = driver.findElement(By.xpath(locator));
        Select dropDownSelect = new Select(webElement);
        List<WebElement> getAllOptions = dropDownSelect.getOptions();
        if(!dropDownSelect.isMultiple()) {
            for(int i = 0; i < getAllOptions.size(); i++) {
                if(getAllOptions.get(i).getText().equalsIgnoreCase(value)) {
                    dropDownSelect.selectByIndex(i);
                    break;
                }
            }
        }
    }

    public void verifyText(String element, String value) {
        String locator = getElement(element);
        WebElement webElement = driver.findElement(By.xpath(locator));
        String text = webElement.getText();
        if(text.equalsIgnoreCase(value)) {
            Assert.assertTrue(true);
        }
    }

    public void openURL() {
        driver.get("");
    }

    public void closeBrowser() {
        driver.close();
    }
}
