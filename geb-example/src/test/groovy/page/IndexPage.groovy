package page

import geb.Page

/**
 * Simple page object with full url
 *
 * Created by jcincera on 09/11/15.
 */
class IndexPage extends Page {

    static url = "http://localhost:8080"

    static at = { title == "Application" }

    static content = {
        pageContent { $("body") }
    }
}
