package seedu.address.logic.commands;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.schedule.Activity;

import java.rmi.activation.ActivationID;
import java.util.Date;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class ScheduleEditCommand extends ScheduleCommand{

	private final String task;
	private final Index index;
	private final String MESSEGE_SUCCESS = "Task is edited";

	/**
	 * Creates an AddCommand to add the specified {@code Person}
	 */
	public ScheduleEditCommand(Index index, String task) {
		requireNonNull(task);
		requireNonNull(index);
		this.task = task;
		this.index = index;
	}

	@Override
	public CommandResult updateSchedule(Model model) throws CommandException{
		Activity toDelete = getActivityFromIndex(model, index);
		Activity toAdd = new Activity(toDelete.getDate(), task);
		model.deleteActivity(toDelete);
		model.addActivity(toAdd);
		return new CommandResult(MESSEGE_SUCCESS);
	}

	@Override
	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof ScheduleEditCommand// instanceof handles nulls
				&& task.equals(((ScheduleEditCommand) other).task)
				&& index.equals(((ScheduleEditCommand) other).index));
	}
}
