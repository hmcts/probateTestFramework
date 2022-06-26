# Created by hrishikesh.gawde at 22/06/2022
Feature: share a case with another pp2 user

  Scenario: Share a GOP case with another user
    Given PP1 user Log in
    When PP2 user create GOP case
    Then Select a same case and click share
    And Add PP2 user and select continue button and confirm
    Then Login as PP2 user
    And Select SHare Case button
    Then Confirm Both PP1 and PP2 user are listed


