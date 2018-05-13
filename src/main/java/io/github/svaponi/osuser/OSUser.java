package io.github.svaponi.osuser;

/**
 * Container for OS user data.
 */
public class OSUser {

    private static final String UNKNOWN = "<unknown>";

    private final String username;

    public OSUser(final String username) {
        this.username = username;
    }

    /**
     * @return true is OS user is not available, false otherwise.
     */
    public boolean isUnknown() {
        return null == username || username.trim().isEmpty();
    }

    /**
     * @return current OS username
     */
    public String getUsername() {
        return isUnknown() ? UNKNOWN : username;
    }
}
