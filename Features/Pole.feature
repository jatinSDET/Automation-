@Setup
Feature: Check the " Poles Functionality" Functionality

  Background: 
    Given Enter the Pole ID and Search it

  @ManualWorkOnly
  Scenario: Pole - Manual work only
    Given Check All Others Fields should not be enable
    When Click to check Pole Reset Required
    And Check All Others Fields should not be disable
    And Enter the DP Number
    And Click to press the save button
    When Click to Manual work only
    And Select as Yes

  @SurfaceType
  Scenario: Pole - Surface type
    When Click to drop down
    And Select the drop down as Tarmac

  @DPNumber
  Scenario: Pole - DP Number
    When Verify after enter the DP Number all fields should not be enable

  @PoleNumber
  Scenario: Pole - Pole Number
    When Enter the Pole Number

  @AdditionalStays
  Scenario: Pole -Additional Stays
    When Enter the value for Additional Stays Required

  @Reset
  Scenario: Pole - Reset
    When Verify here Pole Reset is checked or not

  @FibreOnlyPole
  Scenario: Pole - Fibre Only Pole
    When Click to Fibre Only Pole
    And Select as Yes in drop down

  @ExistingAerialCables
  Scenario: Pole - Existing Aerial Cables
    When Click to Enter the values

  @ExistingDropWires
  Scenario: Pole - Existing Drop Wires
    When Click to provide the value of Existing Drop Wires

  @ExistingStays
  Scenario: Pole - Existing Stays
    When Provide existing stays value

  @ExistingTerminalBlocks
  Scenario: Pole - Existing Terminal Blocks
    When Enter the values for Existing Terminal Blocks

  @ExistingJoints
  Scenario: Pole - Existing Joints
    When Enter the value for Existing Joints

  @ExistingOtherFittings
  Scenario: Pole - Existing Other Fittings
    When Enter the value for Existing Other Fittings
