Feature: Keka Home Page Scenarios

  @P1
  Scenario: Downloading employee's early arrivals list

    Given  I am on the "LoginPage" of Keka Portal
    When   I login through Microsoft Account by providing valid "emailid" and "password"
    Then   I am on "Homepage" of Keka Portal
    When   I click on "My team"
    Then   I should be on "SummaryPage"
    When   I click on "View Employees" list
    Then   I should be navigated to "View Employees Page"
    When   I click on the "Download icon"
    Then   I should be able to view and click on "Downloaded Pdf"

