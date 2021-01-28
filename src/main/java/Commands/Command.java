package Commands;

import Exceptions.DukeException;
import Storage.Storage;
import TaskList.TaskList;
import Ui.Ui;

public abstract class Command {
    TaskList tasklist;
    Ui ui;
    Storage storage;


    Command(TaskList tasklist, Ui ui, Storage storage) {
        this.tasklist = tasklist;
        this.ui = ui;
        this.storage = storage;
    }

    Command() {
    }

    /**
     * Abstract method to Executes the Command given.
     *
     * @param tasklist Duke TaskList object.
     * @param storage Duke Storage object.
     * @param ui Duke UI object.
     * @throws DukeException Depends on the error of the command.
     */
    public abstract void execute(TaskList tasklist, Ui ui, Storage storage) throws DukeException;
    public abstract boolean isExit();
}
