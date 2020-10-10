package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 튜플Test {

    private 튜플 test;

    @BeforeEach
    void setUp() {
        test = new 튜플();
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{2,1,3,4}, test.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
        assertArrayEquals(new int[]{2,1,3,4}, test.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"));
        assertArrayEquals(new int[]{111,20}, test.solution("{{20,111},{111}}"));
        assertArrayEquals(new int[]{123}, test.solution("{{123}}"));
        assertArrayEquals(new int[]{3,2,4,1}, test.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"));
        assertArrayEquals(new int[]{3,2,4,1,100}, test.solution("{{4,2,3},{3},{2,3,4,1},{2,3},{2,3,4,1,100}}"));
        assertArrayEquals(new int[]{3,2,4,1,100}, test.solution("{{4,2,3},{3},{2,3,4,1},{2,3},{2,3,4,1,100}}"));
    }
}