Feature: Messaging Navigators

#  1.Öğrenci, anasayfadaki Hamburger Menu’de Messaging linkine hover over yaptığında yeni mesaj yaz (New Message),
#  gelen (Inbox), giden (Outbox) ve çöp kutuları (Trash) linklerini görebilmeli ve tıklayabilmelidir.

  Scenario:
    Given The user navigates to website
    When Clicks the hamburger button
    And Hover over messaging feature
    And Verify that new message,inbox,outbox and trash are visible

    And Click the new message feature
    Then Verify that current url contains word of new

    And Click the inbox feature
    Then Verify that current url contains word of inbox

    And Click the outbox feature
    Then Verify that current url contains word of outbox

    And Click the trash feature
    Then Verify that current url contains word of trash
