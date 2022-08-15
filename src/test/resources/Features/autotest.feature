#@test1
#Feature: Title of your feature
  #@M103RuleFailure
  #Scenario: Rule failure Autoreplay for MT103
  #Given Suspend  the  Routing Rule
  #And   Approve the suspended routing rule from another user
  #Then Process a valid MT One zero three payment and it falls into rule failure status
  #Then Enable the routing rule
  #And Autoreplay the payment with Rule failure status
  #Then Check for the auto replay incidence and the payment gets completed 

