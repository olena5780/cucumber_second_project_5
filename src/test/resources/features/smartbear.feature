Feature: SmartBear Functionality

  Background:
    Given user is on "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx"

  Scenario Outline: Validate invalid login attempt
    When user enters username as "<username>"
    And user enters password as "<password>"
    And user clicks on Login button
    Then user should see "<message>"

    Examples:

      | username | password | message                    |
      | abcd     | abcd1234 | Invalid Login or Password. |

<<<<<<< HEAD

  @Smoke
=======
>>>>>>> parent of 3eb42e1 (first push)
  Scenario: Validate valid login attempt
    When user enters username as "Tester"
    And user enters password as "test"
    And user clicks on Login button
    Then user should be routed to "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/"

<<<<<<< HEAD

  @Regression
=======
>>>>>>> parent of 3eb42e1 (first push)
  Scenario: Validate “Web Orders” menu items
    When user enters username as "Tester"
    And user enters password as "test"
    And user clicks on Login button
    Then user should be routed to "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/"
    And validate below menu items are displayed
      | View all orders | View all products | Order |

<<<<<<< HEAD


  @Regression
=======
>>>>>>> parent of 3eb42e1 (first push)
  Scenario: Validate “Check All” and “Uncheck All” links
    When user enters username as "Tester"
    And user enters password as "test"
    And user clicks on Login button
    Then user should be routed to "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/"
    When user clicks on "Check All" button
    Then all rows should be checked
    When user clicks on "Uncheck All" button
    Then all rows should be unchecked

<<<<<<< HEAD

  @Regression
=======
>>>>>>> parent of 3eb42e1 (first push)
  Scenario: Validate adding new order
    When user enters username as "Tester"
    And user enters password as "test"
    And user clicks on Login button
    Then user should be routed to "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/"
    When user clicks on "Order" menu item
    And user selects "FamilyAlbum" as product
    And user enters 2 as quantity
    And user enters all address information
    |Olena Shov|1234 S Monroe str|San Francisco|CA|12345|
    And user enters all payment information
    And user clicks on "Process" button
<<<<<<< HEAD
    When user clicks on "View all orders" menu item
    Then user should see their order displayed in the table
    And validate all information entered displayed correct with the order
      | |Olena Shov|FamilyAlbum|2|02/28/2023|1234 S Monroe str|San Francisco|CA|12345|Visa|123456789012345|12/25|


  @Regression
  Scenario: Validate “Delete Selected” button
    When user enters username as "Tester"
    And user enters password as "test"
    And user clicks on Login button
    Then user should be routed to "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/"
    When user clicks on "Check All" button
    And user clicks on "Delete Selected" button
    Then validate all orders are deleted from the List of All Orders
    And validate user sees "List of orders is empty. In order to add new order use this link." message
=======
    And user clicks on "View all orders" menu item
    Then user should see their order displayed in the "List of All Orders" table
    And validate all information entered displayed correct with the order
>>>>>>> parent of 3eb42e1 (first push)
