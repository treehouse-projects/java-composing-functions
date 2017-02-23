package com.teamtreehouse.composure;

import com.teamtreehouse.composure.filters.Html;
import com.teamtreehouse.composure.filters.Markdown;
import com.teamtreehouse.composure.utils.Renderer;
import java.util.function.Function;

public class App {

  public static void main(String[] args) {
    String htmlInput = "<p>Using strong tags <strong>allows you to over promote</strong> and " +
            "<a href=\"http://www.myspace.com/tom\">Links should open in new browser</a></p>";
    String markdownInput = "Using strong tags **allows you to over promote** and "
        + "[Links open in a new browser](http://www.google.com)";

    Function<String, String> boldCleaner = Html::boldCleaner;

    Function<String, String> sanitizer = boldCleaner.andThen(Html::externalizeLinks);

    Function<String, String> markeddownSanitizer = sanitizer.compose(Markdown::render);
    String result = Renderer.render(htmlInput, markeddownSanitizer);
    System.out.println("HTML is safe...");
    System.out.println(result);
    result = Renderer.render(markdownInput, markeddownSanitizer);
    System.out.println("Markdown is too...");
    System.out.println(result);


  }
}
