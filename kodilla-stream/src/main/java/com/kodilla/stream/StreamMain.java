package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultOfForumUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getNoOfPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        theResultOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " -> " + entry.getValue())
                .forEach(System.out::println);
    }
}
