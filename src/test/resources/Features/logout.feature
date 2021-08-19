@SYMU-385
Feature: 

	@SYMU-384
	Scenario: Verify that user can not go to home page again by clicking step back button after successfully loged out.
		Given the user is logged in
		When user clicks on go back one page button
		Then user should not go to home page	


	@SYMU-335
	Scenario: Verify that user can log out and ends up with login page-ANC
		Given the user is logged in
		When user click user avatar
		And click log out button
		Then user should be logged out