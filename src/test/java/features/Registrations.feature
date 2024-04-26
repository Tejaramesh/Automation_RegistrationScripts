Feature: Registartion of users

Scenario Outline: Verify user is able to register successfully using register API

Given Registration Details with "<email>" "<firstname>" "<lastname>"
When user calls "RegisterAPI" with "post" http request
Then the api call got success with status code 200
And "status" in response body is "success"


Examples:

|email             | firstname |lastname |
|test+697@email.com| Rajesh    | Krishnan |
|test+698@email.com| Ashish    | Krishnan |