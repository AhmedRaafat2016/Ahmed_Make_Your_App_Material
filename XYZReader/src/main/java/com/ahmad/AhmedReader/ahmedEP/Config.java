package com.ahmad.AhmedReader.ahmedEP;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://nspf.github.io/XYZReader/ahmedDB.json" );

        } catch (MalformedURLException ignored) {
        }

        BASE_URL = url;
    }
}
