@PreRequisite
Feature: Attachments

  Background: 
    Given Open the WorkOrder for Attachments Type
    When Click to WorkOrder Name
    And Click to Upload button

  @Upload
  Scenario: To verify that for PON Work Order all the attachments Upload should be working fine
    Given Chosen file and given the Description1
    When Select and check DRSS the Attachment types
    And Chosen file and given the Description2
    Then Select and check Schamatics the Attachment types
    And Chosen file and given the Description3
    Then Select and check Spine or Agg the Attachment types
    And Chosen file and given the Description4
    Then Select and check Other the Attachment types

  @Edit
  Scenario: To verify that for PON Work Order all the attachments Edit should be working fine
    Given Click the Edit or Pencil option1
    When Click Replacement option and click to choose file1
    Then Description as1 "Replaced File1"
    Then Select the Dropdown as DRSS only
    When Click the Edit or Pencil option2
    And Click Replacement option and click to choose file2
    Then Description as2 "Replaced File 2"
    And Select the Dropdown as Schamatics only
    When Click the Edit or Pencil option3
    And Click Replacement option and click to choose file3
    Then Description as3 "Replaced File 3"
    And Select the Dropdown as Spine or Agg only
    When Click the Edit or Pencil option4
    And Click Replacement option and click to choose file4
    Then Description as4 "Replaced File 4"
    And Select the Dropdown as Other only

  @Delete
  Scenario: To verify that for PON Work Order all the attachments Delete should be working fine
    When Click the delete icon1
    And Click Delete button as confirmation1
    When Click the delete icon2
    And Click Delete button as confirmation2
    When Click the delete icon3
    And Click Delete button as confirmation3
    When Click the delete icon4
    And Click Delete button as confirmation4

  @10+MB
  Scenario: To verify that for PON Work Order in Cannot upload attachment more than10MB
    Given Click to Upload the chosen file with more than10MB and given the Description

  @NagativeAttachments
  Scenario: To verify that for PON Workorder not able to upload unsupported functionality
    Given Click to Upload the chosen file with unsupported file and given the Description
