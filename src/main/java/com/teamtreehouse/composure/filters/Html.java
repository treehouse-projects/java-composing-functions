package com.teamtreehouse.composure.filters;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;


public class Html {
  private final static Whitelist whitelist = Whitelist.relaxed();

  public static String boldCleaner(String html) {
    return Jsoup.clean(html, whitelist
            .removeTags("strong")
            .addAttributes("a", "rel"));
  }

  public static String externalizeLinks(String html) {
    Document doc = Jsoup.parse(html);
    doc.select("a")
            .attr("rel", "external");
    return doc.body().html();
  }
}
