@PreRequisite
Feature: Ethernet

  @YellowSecureArea
  Scenario: To verify that In Yellow Secure Areas, cant create workorder wholly inside polygon should be working fine
    Given Click to Manually Draw buttonn
    And Five Times Click to Mapp
    Then Verify Error Messagee"Cannot create workorder completely within a protected secure area"

  @YellowSecureArea
  Scenario: To verify that In Yellow Secure Areas, can create workorder partially inside polygon should be working fine
    Given Click to Yellow Side Manually Draww
    And Click to Yellow Side at Map for Creating Polygon Partially
    Then Verify Yellow side Work Order Name ass "SURVEY - CREATED"

  @YellowSecureArea
  Scenario: To verify that In Yellow Secure Area, can see SDU/CPE should be working fine
    Given Add the SDU and CPE at Yellow Side Areaa
    And Verify the Pop Up Messagee at Yellow Side

  @YellowSecureArea
  Scenario: To verify that In Yellow Secure Area, cant see civils and ghostplan should not be working fine
    Given Add to the Splitter at Yellow Side Areaa
    And Verify the Pop Upp Message at Yellow Side
