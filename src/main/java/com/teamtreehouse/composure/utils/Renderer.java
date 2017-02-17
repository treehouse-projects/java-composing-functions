package com.teamtreehouse.composure.utils;

import java.util.function.Function;

public class Renderer {

  public static String render(String input, Function<String, String> filter) {
    String result = filter.apply(input);
    return result;
  }


}
