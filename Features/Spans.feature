@PreRequisite
Feature: Spans

  Background: 
    Given Open Work Order for Spans

  @Spans
  Scenario: To verify that Adding existing span as a data improvement activity should be working fine
    Given Check the Data Improvement
    When Select the drop down for Spans as 'Span exists update attributes'
    And Fill the Remarksss1

  @Spans
  Scenario: To verify that Updating span type as a data improvement activity should be working fine
    Given Search to open Span
    And Select the status as 'IPL'
    Then Select drop down for Spans2 as 'Span route modified'
    And Fill the Remarks2

  @Spans
  Scenario: Deleting span as a data improvement activity should be working fine
    Given Add New Spans
    And Select the Structure
    Then Click to delete the structure

  @Spans
  Scenario: To verify that Moving existing span as a data improvement activity should be working fine
    Given Select Move and Drag It
    When Leave a comment about our change
    And Click to Confirm
