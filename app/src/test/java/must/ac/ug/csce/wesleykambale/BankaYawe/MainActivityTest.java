package must.ac.ug.csce.wesleykambale.BankaYawe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;

import static org.junit.Assert.*;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ApplicationProvider;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void activityShouldNotBeNull() throws Exception {
        MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertNotNull(activity);
    }

    @Test
    public void recyclerViewShouldBePresent() throws Exception {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class).create().start().resume()) {
            MainActivity activity = controller.get();
            RecyclerView recyclerView = activity.findViewById(R.id.recyclerview);
            assertNotNull("RecyclerView should not be null", recyclerView);
        }
    }
}
