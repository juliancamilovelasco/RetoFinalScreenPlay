package com.practice.automationtesting.automation.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AndroidQuickStartGuideHomePage {

    public static final Target SELECT_TWO_BOOKS = Target.the("Select Two Books").locatedBy("//div[@class='quantity']/input");
    public static final Target ADD_TO_BASKET = Target.the("Add To Basket").locatedBy("//div[@id='product-169']/div[2]/form/button");
    public static final Target VIEW_BASKET = Target.the("View Basket").locatedBy("//a[@class='button wc-forward']");

}


