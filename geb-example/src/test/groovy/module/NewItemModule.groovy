package module

import geb.Module

/**
 * Created by jcincera on 10/11/15.
 */
class NewItemModule extends Module {

    static content = {
        itemText { $(".new-item") }
        addButton { $(".add-button") }
    }

}
