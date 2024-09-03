@PreRequisite
Feature: Ethernet

  @RedSecureArea
  Scenario: To verify that In Red Secure Areas, can’t create workorder wholly inside polygon should be working fine
    Given Click to Manually Draw button
    And Five Times Click to Map

  @RedSecureArea
  Scenario: To verify that In Yellow/Red Secure Areas, can create workorder partially inside polygon should be working fine
    Given Click to Map for Creating Polygon Partially
    Then Click to Submit button and Click to Yes as Well

  @RedSecureArea
  Scenario: To verify that In Yellow/Red Secure Area, can see SDU/CPE should be working fine
    Given Click to Splitter ID and create WO
    When Add the SDU and CPE at Red Site Area

  @RedSecureArea
  Scenario: To verify that In Yellow/Red Secure Area, cant see civils and ghostplan should not be working fine
    Given Add the Splitter at Red Site Areaa
