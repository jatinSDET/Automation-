@PreRequisite
Feature: Check the "Refresh Address button" Functionality

  #Background:
  #Given Open Work Order for NAD
  #@Regression
  #Scenario: Click Refresh Address button and check for success message
  #Given Click to work order name1
  #When Click to Refresh Address button
  #And I will verify that "ADDRESS SUCCESSFULY UPDATED" as Successfull meassge
  #
  #@Regression
  #Scenario: Switch to Address Type NGD address and check Successful Message "NGD address fetched successfully "
  #Given Enter UPRN number and Search1
  #When Select NAD Address in drop down1
  #And Verify the success message as1 "NGD address fetched successfully"
  #
  #@Regression
  #Scenario: Switch to Address Type ORFriendly Address and Check By Default as ORFriendly
  #Given Enter UPRN number and Click to Search
  #When Verify by default it should ORFriendly only
  #
  #@Regression
  #Scenario: Piper sourced CPE - if it has UPRN- Check address fields disable
  #Given Enter UPRN number and Search UPRN
  #When Address fields should be disabled
  #
  #@Regression
  #Scenario: Check Low address accuracy in properties and it must be in amber
  #Given Add Spans between CPE to CBT
  #When Click to reparent CPE to CBT
  #And Verify the CPE Properties as "Low address accuracy"
  @Regression
  Scenario: Add New CPE and check if CPE is in Blue colour and Missing UPRN in Proprties
    Given Click to Add SDU and CPE place it
    When Click to CPE and Reparent to CBTs
    Then Also Verify the Missing UPRN in Proprtiess
  #@Regression
  #Scenario: ORION New CPE Address Type - change OR friendly address to NGD address and check error  message -CPE does not exist with id:
    #Given Add SDU and add CPE placed it in Structure
    #Then Switched to OR Frindly to NGD address
    #Then Verify the Error message "Cpe does not exist with id:"
