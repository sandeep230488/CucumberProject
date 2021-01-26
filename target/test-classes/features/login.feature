Feature: Application login



Scenario: Home page default login 
	Given User is on Netbanking login page 
	When User sign with following details
	|jenny|jackson|jel@gmail.com|pune|12345|
	Then User home page is displayed 
	And User can see card details
	 
Scenario: Home page default login 
	Given User is on Netbanking login page 
	When User sign with following details
	|sandeep|jackson|jel@gmail.com|pune|12346|
	Then User home page is displayed 
	And User can see card details
