package ru.example.uitestapplication;

import androidx.test.espresso.ViewInteraction;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

/**
 * @author Gevork Safaryan on 05/12/2019
 */
class MainPage {
    private ViewInteraction mTextView = onView(withId(R.id.textView));
    private ViewInteraction mButton = onView(withId(R.id.button));
    private ViewInteraction mRecyclerView = onView(withId(R.id.recycler_view));

    public ViewInteraction getTextView() {
        return mTextView;
    }

    public ViewInteraction getButton() {
        return mButton;
    }

    public ViewInteraction getRecyclerView() {
        return mRecyclerView;
    }
}
