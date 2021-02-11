package ru.example.uitestapplication;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(
            MainActivity.class);
    MainPage page = new MainPage();

    @Test
    public void checkHelloWorld() throws Exception {
        page.getTextView().check(matches(withText("")));
        Thread.sleep(1000);
        page.getTextView().check(matches(withContentDescription("нажмите чтобы увидеть")));
        Thread.sleep(1000);
        page.getButton().perform(click());
        Thread.sleep(1000);
        page.getTextView().check(matches(withText("Hello World!")));
    }


    @Test
    public void checkElementInRecycler() throws Exception {
        page.getRecyclerView().check(matches(isDisplayed()));
        Thread.sleep(1000);
        page.getRecyclerView().perform(RecyclerViewActions.actionOnItemAtPosition(30, click()));
        Thread.sleep(1000);
        page.getRecyclerView().perform(RecyclerViewActions.scrollToPosition(10));
        Thread.sleep(1000);
        page.getRecyclerView().perform(RecyclerViewActions.scrollToPosition(30));
        Thread.sleep(1000);
        page.getRecyclerView().perform(RecyclerViewActions.scrollToPosition(10));
    }
}
