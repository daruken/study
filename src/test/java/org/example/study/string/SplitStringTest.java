package org.example.study.string;

import org.example.study.string.Split;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SplitStringTest {
    @Test
    void 문자열_스플릿() {
        String str = "1,2";
        Split splitString = new Split();

        List<Integer> list = splitString.splitString(str);
        assertThat(list).contains(1, 2);
        assertThat(list).containsExactly(1, 2);
    }

    @Test
    void 문자_스플릿() {
        String str = "1";
        Split splitString = new Split();

        List<Integer> list = splitString.splitString(str);
        assertThat(list).contains(1);
        assertThat(list).containsExactly(1);
    }
}
