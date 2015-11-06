import spock.lang.Requires
import spock.lang.Specification

/**
 * Failed test output and setup/cleanup as method and block
 */
class Example2 extends Specification {

    def setup() {
        println "@BeforeMethod"
    }

    @Requires({ os.macOs })
    def "Test which fails"() {

        setup:
        def map = new HashMap()

        when:
        map.put(null, "elem")

        then:
        map.size() == 2

        cleanup:
        map.clear()
        println map.size()
    }

    def cleanup() {
        println "Another cleanup"
    }
}
