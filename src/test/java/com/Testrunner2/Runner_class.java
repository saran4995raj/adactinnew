package com.Testrunner2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\features2", glue = "com.stepdefinition2", 
tags = "@Smoke ", dryRun = false, stepNotifications = true,plugin= {"html:target\\report\\Adactin.html",
		"json:target\\report\\Adactinpj.json"},publish=true)

public class Runner_class {

}
