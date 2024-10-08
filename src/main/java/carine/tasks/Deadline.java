package carine.tasks;

import carine.exceptions.InvalidDateException;
import carine.parsers.Time;

/**
 * This class represents tasks that need to be done before a specific date/time.
 */
public class Deadline extends Task {
    private Time by;

    /**
     * Constructs a `Deadline` object with the specified name and finish date.
     *
     * @param name The name of the deadline.
     * @param by The time the deadline has to be completed.
     */
    public Deadline(String name, String by) throws InvalidDateException {
        super(name);
        this.by = new Time(by);
    }

    public Time getBy() {
        return by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by.toString() + ")";
    }

    @Override
    public String toDataFormat() {
        return "D" + super.toDataFormat() + "|" + by.toString();
    }
}
