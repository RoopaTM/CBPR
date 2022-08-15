
@feature1
Feature: Onboarding data CRUD operations
Background: click on onboarding data

  @tag1
  Scenario: Routing Rule
    Given cilck on onboarding data
    When click the routing rule and click add routing rule
   And Enter the data in the mandatory fields
    And click submit
    And switch tab and login into refdataapprover user
    And click approval menu and and approval details tab
    And Click  created routing rule
    And Approve the new routing rule
    Then logout of the refdataapprover user
    
    
    @tag2
  Scenario: EndPoint
   Given cilck on onboarding data
    When click the EndPoint and click add new end pointb
   And Enter the data in  mandatory fieldsb
    And click the submitb
    And switch tab and login into refdataapprover userb
    And click approval menu and and approval details tabb
    And Click  created routing ruleb
    And Approve the new routing ruleb
    Then logout of the refdataapprover userb