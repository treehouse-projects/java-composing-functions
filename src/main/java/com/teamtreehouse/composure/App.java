package com.teamtreehouse.composure;

import com.teamtreehouse.composure.filters.Html;
import com.teamtreehouse.composure.utils.Renderer;
import java.util.function.Function;

public class App {

  public static void main(String[] args) {
    String htmlInput = "<p>Using strong tags <strong>allows you to over promote</strong> and " +
            "<a href=\"http://www.myspace.com/tom\">Links should open in new browser</a></p>";

    Function<String, String> boldCleaner = Html::boldCleaner;

    Function<String, String> sanitizer = boldCleaner.andThen(Html::externalizeLinks);

    String result = Renderer.render(htmlInput, sanitizer);

    System.out.println(result);
  }
}
