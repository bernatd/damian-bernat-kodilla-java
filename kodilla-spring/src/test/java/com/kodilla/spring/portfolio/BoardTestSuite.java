package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("toDoTask #1");
        board.inProgressList.tasks.add("inProgressTask #1");
        board.doneList.tasks.add("doneTask #1");

        //Then
        assertEquals("toDoTask #1", board.toDoList.tasks.get(0));
        assertEquals("inProgressTask #1", board.inProgressList.tasks.get(0));
        assertEquals("doneTask #1", board.doneList.tasks.get(0));
    }
}
