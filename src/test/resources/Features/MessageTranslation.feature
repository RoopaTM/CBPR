#@tag
#Feature: Message Translation
#
#
  #@MT103
  #Scenario: MT103-OUTGOING
    #Given Process a payment via postman
    #And open volpay ui and click corresponding payment in Received Instructions Tab
    #When payment status completed and click on bank credit transfer and click volpay ID
    #And CCT status get completed and click external communication Tab and click VOLDIST ID
    #And Distributed Instruction and payment gets into TRANSMIT_COMPLETED status
    #Then view and download the payment
    #And check more outcomes

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
