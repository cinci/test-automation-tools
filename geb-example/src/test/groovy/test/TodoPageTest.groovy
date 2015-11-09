package test

import geb.spock.GebSpec
import page.TodoPage

/**
 * Created by jcincera on 09/11/15.
 */
class TodoPageTest extends GebSpec {
    def "check my todo list items"() {
        when:
        to TodoPage

        then:
        todoList.size() == 5

        // TODO add some module check
    }

}
