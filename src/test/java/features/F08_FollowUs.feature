@smoke
  Feature: F08_FollowUs | User can open followUs links

  #Facebook
    Scenario: user opens facebook link
    Given user click on facebook icon at home page
    Then facebook tab is opened in new tab



  #Twitter
    Scenario: user opens twitter link
      Given user click on twitter icon at home page
      Then twitter tab is opened in new tab


  #Rss
    Scenario: user opens rss link
      Given user click on rss icon at home page
      Then rss tab is opened in new tab


  #Youtube
    Scenario: user opens youtube link
      Given user click on youtube icon at home page
      Then youtube tab is opened in new tab
