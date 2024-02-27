@All
Feature: Test amazon application

 #prerequest
  Background: 
    Given open amazon home page

  @Homepage
  Scenario: Test title of home page
    When user capture current title of home page
    Then title should matched with home page title

#@ignore
  @Bestsellers
  Scenario: Test title of bestsellers
    When user open bestsellers page
    When user capture current title of bestsellers
    Then title should match with bestsellers page title

#@ignore
  @Mobiles
  Scenario: Test title of mobiles
    When user open mobiles page
    When user capture current title of mobiles
    Then title should match with mobiles page title

  @TodaysDeal
  Scenario: Test title of todaysdeal
    When user open todaysdeal page
    When user capture current title of todaysdeal
    Then title should match with todaysdeal page title
