package io.github.svaponi.osuser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OSUserServiceTest {

    private static OSUserService service;

    @Before
    public void init() {
        if (service == null) {
            service = OSUserServiceFactory.getInstance();
        }
    }

    @Test
    public void test_getUser() {
        final OSUser user = service.getUser();
        Assert.assertNotNull(user);
    }

    @Test
    public void test_getUser_isUnknown() {
        final OSUser user = service.getUser();
        Assert.assertFalse(user.isUnknown());
    }

    @Test
    public void test_getUser_getUsername() {
        final OSUser user = service.getUser();
        Assert.assertFalse(user.getUsername() == null);
        Assert.assertFalse(user.getUsername().trim().isEmpty());
    }
}
