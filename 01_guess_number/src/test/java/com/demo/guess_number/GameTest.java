package com.demo.guess_number;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Create by jony on 2020/8/31
 */
@SpringBootTest
public class GameTest {
    @Test
    public void should_return_0A0B_when_no_number_is_correct() {
        Answer actualAnswer = Answer.createAnswer("1 2 3 4");
        Game game = new Game(actualAnswer);
        Answer inputAnswer = Answer.createAnswer("5 6 7 8");
        String result = game.guess(inputAnswer);
        assertEquals(result, "0A0B");
    }
}