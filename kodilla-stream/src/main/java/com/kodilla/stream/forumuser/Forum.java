package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theListOfForumUsers = new ArrayList<>();

    public Forum() {
        theListOfForumUsers.add(new ForumUser(1, "User1", 'F', LocalDate.of(2000,11,5), 187));
        theListOfForumUsers.add(new ForumUser(2, "User2", 'M', LocalDate.of(1998,6,24), 203));
        theListOfForumUsers.add(new ForumUser(3, "User3", 'M', LocalDate.of(1995,4,13), 19));
        theListOfForumUsers.add(new ForumUser(4, "User4", 'F', LocalDate.of(2010,9,3), 17));
        theListOfForumUsers.add(new ForumUser(5, "User5", 'F', LocalDate.of(2003,12,25), 23));
        theListOfForumUsers.add(new ForumUser(6, "User6", 'M', LocalDate.of(1985,1,8), 54));
        theListOfForumUsers.add(new ForumUser(7, "User7", 'F', LocalDate.of(1972,4,12), 0));
        theListOfForumUsers.add(new ForumUser(8, "User8", 'F', LocalDate.of(2001,5,29), 0));
        theListOfForumUsers.add(new ForumUser(9, "User9", 'M', LocalDate.of(1999,11,11), 0));
        theListOfForumUsers.add(new ForumUser(10, "User110", 'F', LocalDate.of(2011,2,24), 131));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theListOfForumUsers);
    }
}
