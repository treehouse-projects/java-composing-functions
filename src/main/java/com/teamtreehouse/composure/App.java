package com.teamtreehouse.composure;

import com.teamtreehouse.composure.filters.Html;

public class App {

  public static void main(String[] args) {
    String htmlInput = "<p>Using strong tags <strong>allows you to over promote</strong> and " +
            "<a href=\"http://www.myspace.com/tom\">Links should open in new browser</a></p>";

    String result = Html.boldCleaner(htmlInput);

    System.out.println(result);
  }
}
