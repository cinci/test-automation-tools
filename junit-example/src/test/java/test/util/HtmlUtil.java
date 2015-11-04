package test.util;

/**
 * Created by jcincera on 02/11/15.
 */
public final class HtmlUtil {
    public static String getPageBodyContent(final String html) {
        return html.substring(html.indexOf("<body>") + 6, html.indexOf("</body>"));
    }
}
