Feature: Registartion of  users

@RTTI
Scenario Outline: Verify user is able to register RTTI General and Driver  successfully using register API

Given Registration Details with "<email>" "<firstname>" "<lastname>" "<formId>" "<userType>"
When user calls "RegisterUser" with "Post" http request
Then the api call got success with status code 200
And "status" in response body is "success"


Examples:

|email             | firstname |lastname |formId                               |userType|
|test+688@email.com| Rajesh    | Krishnan |4ab3bc85-803e-47bb-b50d-a2598570bf1a|LocalDriver|
|test+659@email.com| Ashish    | Krishnan |dd20f8b2-1aac-11ed-861d-0242ac120002|OfficeEmployee|




@ATruck
Scenario Outline: Verify user is able to register ATruck CDL and Non CDL driver successfully using register API

Given Atruck Registration Details with "<email>" "<firstname>" "<lastname>" "<formId>" "<userType>"
When user calls "RegisterUser" with "Post" http request
Then the api call got success with status code 200
And "status" in response body is "success"

Examples:

|email             | firstname |lastname  |formId                              |userType|
|test+671@email.com| Mahesh    | Krishnan |fb1a5abd-0b5a-459c-b823-ea816459b940|nonCdlDriver|
|test+672@email.com| Suresh    | Krishnan |dd20f8b2-1aac-11ed-861d-0242ac120002|cdlDriver|



@RISON
Scenario Outline: Verify user is able to register DOT Driver  successfully using register API

Given Rison Transport Registration Details with "<email>" "<firstname>" "<lastname>" "<formId>" "<userType>"
When user calls "RegisterUser" with "Post" http request
Then the api call got success with status code 200
And "status" in response body is "success"


Examples:

|email             | firstname |lastname  |formId                              |userType|
|test+611@email.com| Mahesh    | Krishnan |4ab3bc85-803e-47bb-b50d-a2598570bf1a|DotDriver|




@BAIER
Scenario Outline: Verify user is able to register DOT Driver  successfully using register API

Given Baier Transport Registration Details with "<email>" "<firstname>" "<lastname>" "<formId>" "<userType>"
When user calls "RegisterUser" with "Post" http request
Then the api call got success with status code 200
And "status" in response body is "success"


Examples:

|email             | firstname |lastname  |formId                              |userType|
|test+677@email.com| Mahesh    | Krishnan |dd20f8b2-1aac-11ed-861d-0242ac120002|General|
|email             | firstname |lastname  |formId                              |userType|
|test+678@email.com| Mahesh    | Krishnan |4ab3bc85-803e-47bb-b50d-a2598570bf1a|DotDriver|





