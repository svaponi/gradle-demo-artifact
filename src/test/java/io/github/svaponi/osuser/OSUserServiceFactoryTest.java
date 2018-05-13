package io.github.svaponi.osuser;

import org.junit.Assert;
import org.junit.Test;

public class OSUserServiceFactoryTest {

    @Test
    public void test_getInstance() {
        final OSUserService service = OSUserServiceFactory.getInstance();
        Assert.assertNotNull(service);
    }
}
