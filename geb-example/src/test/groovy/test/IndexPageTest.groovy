package test

import geb.spock.GebSpec
import page.IndexPage

/**
 * Just check if application runs
 *
 * Created by jcincera on 09/11/15.
 */
class IndexPageTest extends GebSpec {
    def "application is up and running"() {
        when:
        to IndexPage

        then:
        pageContent.text() == "Hello World application!"
    }

}
