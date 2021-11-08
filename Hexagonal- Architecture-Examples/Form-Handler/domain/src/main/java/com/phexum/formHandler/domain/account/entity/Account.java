package com.phexum.formHandler.domain.account.entity;

import com.phexum.formHandler.domain.accountType.AccountType;
import com.phexum.formHandler.domain.auth.entity.Auth;

public class Account {
    private long id;
    private String name;
    private Auth auth;
    private AccountType accountType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
