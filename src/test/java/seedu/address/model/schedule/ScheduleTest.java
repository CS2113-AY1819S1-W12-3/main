package seedu.address.model.schedule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static seedu.address.testutil.TypicalActivity.ACTIVITY_TASK_1;
import static seedu.address.testutil.TypicalActivity.ACTIVITY_TASK_2;
import static seedu.address.testutil.TypicalActivity.ACTIVITY_TASK_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javafx.collections.ObservableList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ScheduleTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private final Schedule schedule = new Schedule();

	@Test
	public void add_nullActivity_throwsNullPointerException() {
		thrown.expect(NullPointerException.class);
		schedule.add(null);
	}

	@Test
	public void delete_nullActivity_throwsNullPointerException() {
		thrown.expect(NullPointerException.class);
		schedule.delete(null);
	}

	@Test
	public void setActivity_nullList_throwsNullPointerException() {
		thrown.expect(NullPointerException.class);
		schedule.setSchedule(null);
	}

	@Test
	public void setPersons_list_replacesOwnListWithProvidedList() {
		schedule.add(ACTIVITY_TASK_1);
		List<Activity> activityList = Collections.singletonList(ACTIVITY_TASK_3);
		schedule.setSchedule(activityList);
		Schedule expectedSchedule = new Schedule();
		expectedSchedule.add(ACTIVITY_TASK_3);
		assertEquals(expectedSchedule, schedule);
	}

	@Test
	public void asUnmodifiableObservableList_modifyList_throwsUnsupportedOperationException() {
		thrown.expect(UnsupportedOperationException.class);
		ObservableList<Activity> activityList = schedule.getActivities();
		activityList.remove(0);
	}
}