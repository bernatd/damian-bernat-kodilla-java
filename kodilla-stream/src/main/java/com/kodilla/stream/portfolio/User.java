package com.kodilla.stream.portfolio;

public final class User {
    private final String usrname;
    private final String realName;

    public User(final String usrname, final String realName) {
        this.usrname = usrname;
        this.realName = realName;
    }

    public String getUsrname() {
        return usrname;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "usrname='" + usrname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return usrname.equals(user.usrname);
    }
}
