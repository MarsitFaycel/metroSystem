package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void  userCanLogin() throws NoSuchMethodException {
        User user = new User();
        Assertions.assertEquals(User.class.getMethod("login").getModifiers(), 1);
    }

    @Test
    void  userCanCreateAccount() throws NoSuchMethodException {
        User user = new User();
        Assertions.assertEquals(User.class.getMethod("createAccount").getModifiers(), 1);
    }

    @Test
    void  userCanSwipeIn() throws NoSuchMethodException {
        User user = new User();
        Assertions.assertEquals(User.class.getMethod("swipeIn").getModifiers(), 1);
    }

    @Test
    void  userCanSwipeOut() throws NoSuchMethodException {
        User user = new User();
        Assertions.assertEquals(User.class.getMethod("swipeOut").getModifiers(), 1);
    }

    @Test
    void  userCanGetFare() throws NoSuchMethodException {
        User user = new User();
        Assertions.assertEquals(User.class.getMethod("getFare").getModifiers(), 1);
    }
}
