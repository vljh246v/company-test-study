package com.kakao.teststudy.common.matcher;

import com.kakao.teststudy.entity.User;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Objects;

public class IsNotManager extends TypeSafeMatcher<User> {
    @Override
    protected boolean matchesSafely(User user) {
        if(Objects.isNull(user)){
            return false;
        }
        return user.isManager();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("not manager");
    }

    public static Matcher<User> isManager() {
        return new IsNotManager();
    }

}
