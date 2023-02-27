Feature: SmartBear Functionality


Background:
  Given user is on "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx"

  Scenario Outline: Validate invalid login attempt
When user enters username as "<username>"
And user enters password as "<password>"
And user clicks on Login button
Then user should see "<message>"

  Examples:

 | username | password  | message                     |
 | abcd     | abcd1234  | Invalid Login or Password.  |

