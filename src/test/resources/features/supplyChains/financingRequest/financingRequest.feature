@financingRequest
Feature: financingRequest

  Scenario:financingRequest
    Given login "environments_3" To RequestFinancing
    When login successfully and click RequestFinancing
    Then upload RequestFinancing File