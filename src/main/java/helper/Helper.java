package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import projectPages.HomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Helper {
    WebDriver driver;
   public Helper()
    {
        PageFactory.initElements(driver, this);
    }


    //******https://github.com/nmatei/pay-invoices/blob/master/src/main/java/org/fasttrackit/util/BankCardDetails.java

    public String getUsername()
    {
        File file = new File("src\\main\\resources\\config.properties");

        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        //load properties file
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

       return prop.getProperty("username");


    }

    public String getPassword()
    {
        File file = new File("src\\main\\resources\\config.properties");

        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        //load properties file
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty("password");


    }

}
