package io.javabytes.aspect;

public class SecuredMethod {

    @Secured(isLocked = true)
    public void lockedMethod() {
    }

    @Secured(isLocked = false)
    public void unlockedMethod() {
    }
}
