package ru.gav.www.calculatortest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import android.support.test.espresso.ViewAssertion;
import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Rule
    public ActivityTestRule<Calculator> mActivityRule = new ActivityTestRule<>(
            Calculator.class);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void onCreate() {
        onView(withId(R.id.editTextFirstValue)).perform(typeText("2"));
        onView(withId(R.id.editTextSecondValue)).perform(typeText("2"));
        onView(withId(R.id.radioButtonPlus)).check(matches(isChecked()));
        onView(withId(R.id.buttonCalculate)).perform(click());
        onView(withId(R.id.textViewResult)).check(matches(withText("=4")));
    }

    @Test
    public void clickButtonCalculate() {
    }
}