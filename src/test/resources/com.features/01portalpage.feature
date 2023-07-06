Feature: portal page
Scenario: Launching portal page and getting started

Given User opens portal page
When User clicks get started button
Then User should go to home page
And page title should be "NumpyNinja"

