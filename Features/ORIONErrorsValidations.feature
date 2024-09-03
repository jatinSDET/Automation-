@PreRequisite
Feature: Workorder validations

  Background: 
    Given Create new Work Order

  #@Regression
  #Scenario: Workorder validations - CPE missing SNNs should be working fine
    #Given click to "CPEs are missing serving network notes"
    #When click to the "Premises Type" drop down and  select as SDU
    #And click to the "Premises Fed Via" drop down and select as O
    #Then click to the "Serving Network Notes" drop down and select as OH Feed hoist required
#
  #@Regression
  #Scenario: Workorder validations - Equipment have an invalid or missing address should be working fine
    #Given Click to the "Equipment have an invalid or missing address"
    #And Click to the missing address error
    #Then Click to the "Friendly Address" and type as "COLERIDGE AVENUE"
#
  #@Regression
  #Scenario: Workorder validations - Not Duct associated with it
    #Given Click to No Duct have associate cable
    #And Click to the error name
    #Then Select as"CONDUIT"
#
  #@Regression
  #Scenario: Workorder validations - There must be at least one Attachment should be working fine
    #Given Click to the Choose File
    #And the Description
    #Then Click to drop down and select to the "DRSS"
#
  #@Regression
  #Scenario: Workorder validations  cpe need a basement/budi box parent in same MDU should be working fine
    #Given Click to the error CPE need a basement/budi box parent in same MDU
    #Then Click add button and add equipment and IJ and click to  Basement Box
    #Then Click to Basement box and add children
    #And Click to CPE and Submit
#
  #@Regression
  #Scenario: Workorder validations Route through ND and aerial spans should be working fine
    #Given Click to error as Route through ND and aerial spans
    #When Add the cable from one end to another
    #And Select the error Route through ND and aerial spans
    #Then Click to REROUTE button
    #And Click spilitter and other spilitter Sequnecelly and click submit button
#
  @Regression
  Scenario: Workorder validations Equipment has too many outgoing cables should be working fine
    Given Click to add and add Splitter
    And Search Splitter and select Spilitter
    Then Add CBT with Splitter
#
  #@Regression
  #Scenario: Workorder validations too many directly connected CBTs should be working fine
    #Given Click to add MDU and add IJ
    #And Reparent IJ to main spilitter
    #Then Add CBT with IJ
#
  #@Regression
  #Scenario: Workorder validations - ND span has no depth of cover defined should be working fine
    #Given Click to add Spans to Structure and main Splitter
    #When Click to the Depth of Cover (mm)
    #Then Click to dropdown to select as 600
#
  #@Regression
  #Scenario: Workorder validations -  Span has no surface type defined should be working fine
    #Given Click to Add Small IJ at  Structure to Main Splitter
    #When Enter the value as rough"Surface Type - Rough Unsurfaced"
    #And Enter the value "Surface Type - Footway"
    #Then Enter the value as "Surface Type - Carriageway"
#
  #@Regression
  #Scenario: Workorde validations - Equipment have no parent should be working fine
    #Given Reparent CPE and CBT
#
  #@Regression
  #Scenario: Workorde validations Some structures and spans have status set to PDR should be working fine
    #Given Search CBT and Set Status PDR
    #And Click to error by name as status PDR
    #Then Click status drop down as PDA
#
  #@Regression
  #Scenario: Workorde validations Span is connected to an SDU should be working fine
    #Given Add SDU and CPE at Cordinate
    #When DrawSpan between CPE and CBT
    #Then Resolve the error
#
  #@Regression
  #Scenario: Workorde validations - some civils are not serving equipment or cables  should be working fine
    #Given Search the Structure and Add the Spans
    #When select the status as IPL
#
  #@Regression
  #Scenario: Workorde validations CPE has missing or incomplete address data should be working fine
    #Given Add SDU and CPE
    #When Remove the Addreses data and Save
    #Then Fill the Addresses data and Save
#
  #@Regression
  #Scenario: Workorde validations Some equipment or cable segments are inside an inferred structure or spans should be working fine
    #Given Click to this Enclosing Structure
    #And Select the drop down and select as 'INFERRED_STRUCTURE'
    #Then Again click to this Enclosing Structure
    #And Click to class as 'GENERIC'
#
  #@Regression
  #Scenario: Workorde validations Reducer has more than 2 connected spans should be working fine
    #Given Add Reducer at the Structure
    #When Select class as "CHANGE OF STATE"
#
  #@Regression
  #Scenario: Workorde validations Duct tee has more than 3 connected spans should be working fine
    #Given Add Duct equipment at the Structure
    #When Add Spans from Duct to 4 CBT's
    #Then Select the dropdown class as "CHANGE OF STATE"

  #@Regression
  #Scenario: Workorder validations Some nodes serve too many CBTs should be working fine
    #Given Click to Add the Small IJ
    #When Reparent IJ to Main Splitter
    #And Click to IJ and add CBT with IJ
    #Then Last Click "Reparent Equipment" as No
    #And Select Item Drop Down as "MEDIUM_NODE_AS_IJ"

  #@Regression
  #Scenario: Workorde validations Cof600 is routed internally for more then 2m should be working fine
    #Given Click to Add Spans to One Spliitter to another spilitter
    #When Click to Reroute
    #And Click one Splitter to Another Spilitter
