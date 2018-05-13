package io.github.svaponi.osuser;

public class OSUserServiceFactory {

    /**
     * @return new instance of {@link OSUserService}
     */
    public static OSUserService getInstance() {
        return new OSUserServiceImpl();
    }
}
