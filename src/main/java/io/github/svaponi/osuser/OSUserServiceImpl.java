package io.github.svaponi.osuser;

public class OSUserServiceImpl implements OSUserService {

    private final OSUser user;

    public OSUserServiceImpl() {
        user = new OSUser(System.getProperty("user.name"));
    }

    @Override
    public OSUser getUser() {
        return user;
    }
}
