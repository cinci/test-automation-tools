package test

import geb.spock.GebSpec
import page.TodoPage
import spock.lang.Stepwise

/**
 * Check list size and add button functionality
 *
 * Created by jcincera on 09/11/15.
 */
@Stepwise
class TodoPageTest extends GebSpec {
    def "check my todo list items"() {
        when:
        to TodoPage

        then:
        todoList.size() == 5
    }

    def "check new item form"() {
        setup:
        to TodoPage
        newItem.itemText = "New todo item"

        when:
        assert withAlert { newItem.addButton.click() } == "adding..."

        then:
        assert todoList.size() == 6
    }
}
