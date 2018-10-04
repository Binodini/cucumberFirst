Feature: Launch and Login to a2c
@Login
Scenario: Login
Given Launch the Browser
And Navigate to the URL
And Maximise the Browser
And Set the timeout
And Click on the qauth link
And Enter username as pkona@usqaex
And Enter password as Portal123!
When Click submit button
Then User landed to home page
@Search
Scenario Outline: Click on Search client Name
#And Click on Search client
When Enter Client Name as <Client Name>
Then Click on client
Examples:
|Client Name|
|American Bank|
@AuditProcess
Scenario: Click on Manage Engagement Data
And Click on Manage Engagement Data
And Select Client Fiscal Year
And Click on Create New
And Click on Create new MAT pricing profile
And click on Begin button
When Click on continue button of Warning popup
Then Landed on Mat Pricing
#And close the browser

@MATPricingProfile
Scenario Outline: Create MAT Pricing Profile
And Enter MAT Pricing Profile Name as <PPNAME>
And Click Audit n Other Attest Services
And Select MAT calender
And Click on Next icon
And Click on date
And Click on MAT Profile
And Select MAT Main Profile Location
And Click on Save  

Examples:
|PPNAME|
|First Cucumber Script Binu|

@Engagements
Scenario Outline:Create Engagement
And Click on New button
And Click on the continuance radio button
And Click on check box
And Click on OK button
And Enter Engagement Name as <Engagement Name>
And Enter Engagement Description
And Click on main Engagement location
And Select the location
And Click on AEPs Search icon
And click on lookup button
And Search the partner and leader role 
And click on Search button
And Select the user
Then Click on the next page
And Select the next user
And click on add button
And Click on the checkbox
And Click on Select Persons
And Click on EQCR option
And click on user
And Click on select person
And Click on Engagement Senior Manager
And Click on Lookup person

Examples:
|Engagement Name|
|First Cucumber Engagement Name Binu| 

