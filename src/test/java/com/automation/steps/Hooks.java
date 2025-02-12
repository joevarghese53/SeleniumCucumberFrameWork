package com.automation.steps;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {



    @Before
    public void setUp(){
        DriverManager.createDriver();
        ConfigReader.initConfig();
    }

    @After
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }
}
