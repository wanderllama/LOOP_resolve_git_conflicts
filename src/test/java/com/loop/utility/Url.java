package com.loop.utility;

public enum Url {

    DOCUPORT("https://beta.docuport.app"),
    GOOGLE("https://www.google.com");

    private final String url;

    Url(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
