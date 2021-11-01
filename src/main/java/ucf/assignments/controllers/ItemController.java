package ucf.assignments.controllers;

import javafx.scene.Node;

public class ItemController {
    public void handleEditItem(Node target, int itemID) {
        /*
        == PSEUDOCODE ==
        target.replace(ItemView.createEditableItem(target, itemID));
        */
    }

    public void handleDeleteButton(Node target, int itemID) {
        /*
        == PSEUDOCODE ==
        appModel.getCurrentList().removeItem(itemID);
        target.remove();
         */
    }

    public void handleSave(Node target, int itemID) {
        /*
        == PSEUDOCODE ==
        description = target.textField.content;
        dueDate = target.dueDateField.content;
        newItem = new Item(itemID, description, dueDate);
        appModel.getCurrentList().setItem(itemID, newItem);
        target.replace(ItemView.createItem(newItem));
         */
    }
}