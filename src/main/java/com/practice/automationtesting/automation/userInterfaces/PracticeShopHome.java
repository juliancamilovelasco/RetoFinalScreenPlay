package com.practice.automationtesting.automation.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class PracticeShopHome {

    public static final Target SELECT_ANDROID_BOOK = Target.the("Book Android").locatedBy("//*[@id='content']/ul/li[1]/a[1]/img");
    public static final Target MY_ACCOUNT = Target.the("My Account").locatedBy("//a[@href='http://practice.automationtesting.in/my-account/']");



}
