@smoke
  Feature: F07_HomeSliders | users can select between options in home slider

  #First Slider (Nokia)
    Scenario: First slider is clickable on home page
       Given user click on first slider with nokia image at home page
       Then user navigate to nokia product details page


  #Second Slider (iphone)
    Scenario: Second slider is clickable on home page
      Given user click on second slider with iphone image at home page
      Then user navigate to iphone product details page


