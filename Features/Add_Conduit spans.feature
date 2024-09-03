@PreRequisite
Feature: Pole Bend

  Background: 
    Given Open Work Order for Conduit span

  @PoleBend
  Scenario: To verify that Pole Bend - Add Conduit span with distance as less than 1m btw change of state to jb
    Given Add Spans1
    When Enter to search Structure ID
    And Enter to search the pole path1
    Then Enter the Duct Distance in millimetres1

  @PoleBend
  Scenario: To verify that Pole Bend - Add Conduit span with distance as less than 1m btw pole to jb
    Given Add Pole2
    Then Add Span2
    When Enter to search Structure ID and span place
    Then Enter the Duct Distance in millimetres2

  @PoleBend
  Scenario: To verify that Pole Bend - Add Duct Distance in millimetres
    When Add Spans3
    Then Enter to search Structure ID3
    And Verify the Duct Distance in millimetres3
