package com.junioroffers.domain.login;

class UsernameNotFoundException extends RuntimeException{
    public UsernameNotFoundException(String userNotFound) {
        super(userNotFound);
    }
}
