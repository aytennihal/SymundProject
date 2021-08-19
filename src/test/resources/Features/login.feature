@SYMU-418
Feature: 

	@SYMU-387
	Scenario: DO NOT USE-Verify that user can not login with any invalid credentials -ANC
		Given the user is on the login page
		When the user enters username and password
		And clicks the login button
		Then user should see "Wrong username or password." message
		And user should not be able to login
		

	@SYMU-407
	Scenario: Verify that user can see option link like "forgot password" on the login page to be able to reset the password -ANC
		Given the user is on the login page
		When user clicks on forgot password
		Then user should be able to see reset password button
		When user enters username
		And clicks on reset password button
		Then user should be able to reset the password	


	@SYMU-415
	Scenario Outline: Verify that user can not login with any invalid credentials -ANC
		Given the user is on the login page
		When the user enters "<username>" and "<password>"
		And clicks the login button
		And user should see "Wrong username or password." message
		Then user should not be able to login

		Examples:
		|username     |password  |
		|wrong        |password  |
		|invalid      |invalidpassword|
			


	@SYMU-416
	Scenario Outline: Verify that user can not login with blank username or password -ANC
		Given the user is on the login page
		When user enters blank "<username>" or "<password>"
		And clicks the login button
		Then user should see "Please fill out this field." message
		
		Examples:
		|userName    | password |
		|Employee71  |          |
		|            |Employee123|
		|            |           |	


	@SYMU-417
	Scenario: Verify that user can see valid placeholders on Username and Password fields -ANC
		Given the user is on the login page
		Then the user should see valid placeholders should be seen on related inputboxes	

	@SYMU-406
	Scenario : Verify user can see the password explicity if needed-ANC
		Given the user is on the login page
		When the user enters username and password
		And clicks on eye button which is right side on password button
		Then user should be able to see password explicity



	@SYMU-402
	Scenario: Verify that user can see the password in a form of dots by default-ANC
		Given the user is on the login page
		When user enters password
		Then user should be able to see password with dots format as deafult