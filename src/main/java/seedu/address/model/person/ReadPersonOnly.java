//@author: peiying98

package seedu.address.model.person;
<<<<<<< HEAD

import java.util.Set;

import javafx.beans.property.ObjectProperty;
import seedu.address.model.tag.Tag;
import seedu.address.model.tag.UniqueTagList;
=======
<<<<<<< HEAD
import java.util.Set;

=======
>>>>>>> d4b8e417e0effa343ca60cd5a3412e6dd7a23565

import javafx.beans.property.ObjectProperty;
import seedu.address.model.tag.Tag;
>>>>>>> ea519d0c67d34e4b9ee63935d7aa153ddf3efbde

/**
 * A read-only immutable interface for a Person in the addressbook.
 * Implementations should guarantee: details are present and not null, field values are validated.
 */
public interface ReadPersonOnly {

    ObjectProperty<Name> nameProperty();
    Name getName();
    ObjectProperty<Phone> phoneProperty();
    Phone getPhone();
    ObjectProperty<Email> emailProperty();
    Email getEmail();
    ObjectProperty<Address> addressProperty();
    Address getAddress();
<<<<<<< HEAD
    ObjectProperty<Position> positionProperty();
    Kpi getPosition();
    ObjectProperty<Kpi> kpiProperty();
    Kpi getKpi();
    ObjectProperty<Note> noteProperty();
    Kpi getNote();
    ObjectProperty<UniqueTagList> tagProperty();
=======
>>>>>>> ea519d0c67d34e4b9ee63935d7aa153ddf3efbde
    Set<Tag> getTags();

    /**
     * Returns true if both have the same state. (interfaces cannot override .equals)
     */
    default boolean isSameStateAs(ReadPersonOnly other) {
        return other == this // short circuit if same object
                || (other != null // this is first to avoid NPE below
                && other.getName().equals(this.getName()) // state checks here onwards
                && other.getPhone().equals(this.getPhone())
                && other.getEmail().equals(this.getEmail())
                && other.getAddress().equals(this.getAddress())
<<<<<<< HEAD
                && other.getPosition().equals(this.getPosition())
                && other.getKpi().equals(this.getKpi())
                && other.getNote().equals(this.getNote())
                && other.getTags().equals(this.getTags())
        );
=======
>>>>>>> ea519d0c67d34e4b9ee63935d7aa153ddf3efbde
    }

    /**
     * Formats the person as text, showing all contact details.
     */
    default String getAsText() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getName())
                .append(" Phone: ")
                .append(getPhone())
                .append(" Email: ")
                .append(getEmail())
                .append(" Address: ")
                .append(getAddress())
<<<<<<< HEAD
                .append(" Position: ")
                .append(getPosition())
                .append(" KPI: ")
                .append(getKpi())
                .append(" Notes: ")
                .append(getNote())
                .append(getTags())
=======
>>>>>>> ea519d0c67d34e4b9ee63935d7aa153ddf3efbde
                .append(" Tags: ");
        getTags().forEach(builder::append);
        return builder.toString();
    }

}
