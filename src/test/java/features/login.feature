Feature: Application login



Scenario: Home page default login 
	Given User is on Netbanking login page 
	When User sign with following details
	|jenny|jackson|jen@gmail.com|pune|12345|
	Then User home page is displayed 
	And User can see card details
	 

