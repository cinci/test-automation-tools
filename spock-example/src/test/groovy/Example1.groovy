import spock.lang.Requires
import spock.lang.Specification

/**
 * Simple example - setup, when, then
 */
class Example1 extends Specification {

    @Requires({ os.macOs })
    def "HashMap accepts null key"() {

        setup:
        def map = new HashMap()

        when:
        map.put(null, "elem")

        then:
        notThrown(NullPointerException)
    }
}
