@PreRequisite
Feature: Structure

  Background: 
    Given Open Work Order for Structures

  @Structure
  Scenario: To verify that Adding existing structure as a data improvement activity should be working fine
    Given Add Structure and place it
    Then Change to Status1 as 'IPL'
    And Provide Remarks and Click to Map

  @Structure
  Scenario: To verify that Deleting structure as a data improvement activity should be working fine
    Given Enter the Structure ID and add structure It
    Then Click to Structure and select 'Pole'
    And Click to delete that Pole

  @Structure
  Scenario: To verify that Updating structure type as a data improvement activity should be working fine
    Given Adding the Structure here
    Then Click to Status2 as 'IPL'
    And Select the suggestion as 'Structure exists but not recorded'
    Then Fill the Remarks1

  @Structure
  Scenario: To verify that Moving existing structure s a data improvement activity should be working fine
    Given Search the Structure here
    And Select to move structure'
    Then Fill the comments

  @Structure
  Scenario: To verify that Deleting plant causes it to appear on deleted layer should be working fine
    Given Add Pole Structure
    And Search the Structure here and placed it
    Then Click to delete that Pole Structure
    And Click to checked in Layer Deleted Option

  @StructureAttributes
  Scenario: To verify that Change Family of structure should be working fine
    Given Select the Family as BLOCK TERMINAL

  @StructureAttributes
  Scenario: To verify that change Class of structure should be working fine
    Given Select the Family as BURIED here
    When Select the Class as DUCT TEE

  @StructureAttributes
  Scenario: To verify that change Item of structure should be working fine
    Given Select the Family as POLE here
    When Select the Class as HOLLOW LIGHT
