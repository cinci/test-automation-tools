package page

import geb.Page

/**
 * Page object with relative url and more content components
 *
 * Created by jcincera on 09/11/15.
 */
class TodoPage extends Page {
    static url = "/todo.html"

    static at = { title == "TODO page!" }

    static content = {
        pageContent { $("body") }
        todoList { $(".my-todo-list > li") }

        // TODO add some module example
    }
}
