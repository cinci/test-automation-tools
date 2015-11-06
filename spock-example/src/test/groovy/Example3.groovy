import spock.lang.Specification
import spock.lang.Stepwise

/**
 * Data driven test and stepwise
 */
@Stepwise
class Example3 extends Specification {

    def "data driven test"() {
        expect:
        println name
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

    def "maximum of two numbers"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b || c
        3 | 5 || 5
        7 | 0 || 7 // 0
        0 | 0 || 0
    }
}
