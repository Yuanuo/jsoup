module org.jsoup {
    requires java.xml;

    requires static jsr305;

    exports org.jsoup;
    exports org.jsoup.helper;
    exports org.jsoup.internal;
    exports org.jsoup.nodes;
    exports org.jsoup.parser;
    exports org.jsoup.safety;
    exports org.jsoup.select;
}