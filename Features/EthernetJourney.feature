@PreRequisite
Feature: Ethernet Journey

  #Background:
  #Given Create Ethernet WO
  #And Click to WO Name
  @BeforeAll
  Scenario: To verify that Ethernet - create workorder should be working fine
    Given Proving Access ON

  @Ethernet
  Scenario: To verify that Ethernet - Enter the End User Site Details should be working fine
    Given Click to this 'End User Site Details'
    Then Filled all the required details

  @Ethernet
  Scenario: To verify that Ethernet - Safety details should be working fine
    Given Click to this Cancel Work Order
    Then Click to Yes

  @Ethernet
  Scenario: To verify that Ethernet - Rollback to preplanning phase should be working fine
    Given Click to this first 'Complete PRE_PLANNING  phase' button
    Then Click to 'Rollback PRE_PLANNING Phase' button

  @Ethernet
  Scenario: To verify that Ethernet - Plant Position details should be working fine
    Given Click to this 'Plant Positioning' error
    When Filled all the required details here

  @Ethernet
  Scenario: To verify that Ethernet - Safety details should be working fine
    Given Click to 'Safety' Option
    When Again Filled the required details

  @Ethernet
  Scenario: To verify that Ethernet - Change dummy cable to ethernet cable should be working fine
    Given Select the drop down as 'COF 950/144'

  @Ethernet
  Scenario: To verify that Ethernet - Change the T code item to small, medium, large node should be working fine
    Given Filled required heree
    And Click to Completed survey buttonn
    Then Select the drop down as Small Nod'
    Then Select the drop down as Medium Node
    And Select the drop down as Large Node

  @Ethernet
  Scenario: To verify that Ethernet - Change the Y code to dcb or mcb should be working fine
    Given Filled required hereee
    And Click to Completed survey buttonnn
    Then Click to YCode equipment requires an updated item type error
    And Select the Iteam Type as 'MULTICCT_SP_BOX_12TR'

  @Ethernet
  Scenario: To verify that Ethernet - search by Y code should be working fine
    Given Click to Work Order Name here
    When Clicked to Start Point
    Then Verify Equipment 'Equipment Ref Name' Should be as 'T CODE'

  @Ethernet
  Scenario: To verify that Ethernet - Search by T code should be working fine
    Given Click to End Point and Enclosing Structure as well
    And Verify the Y Code in Plant Type

  @Ethernet
  Scenario: To verify that Ethernet - Enter USRN detail for Tcode and Y Code should be working fine
    Given Click to error 2 civils does not have USRN number
    And Filled the USRN Number one
    Then Filled the USRN Number two

  @AfterAll
  Scenario: To verify that Ethernet - create workorder should be working fine
    Given Proving Access Off
