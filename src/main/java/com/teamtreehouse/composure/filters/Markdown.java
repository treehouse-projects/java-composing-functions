package com.teamtreehouse.composure.filters;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;



public class Markdown {
  private static final Parser parser;
  private static final HtmlRenderer renderer;

  static {
    renderer = HtmlRenderer.builder().build();
    parser = Parser.builder().build();
  }

  public static String render(String markdown) {
    Node document = parser.parse(markdown);
    return renderer.render(document);
  }
}
