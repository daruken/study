package org.example.study.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CharAtTest {
    @Test
    @DisplayName("문자열 \"abc\"가 주어졌을 때, String의 charAt()메소드를 활용해 특정 위치의 문자를 가져오기")
    void 문자열_특정위치_가져오기() {
        String str = "abc";
        CharAt charAt = new CharAt();

        char result = charAt.charAtPoint(str, 1);
        assertThat(result).isEqualTo('b');
    }

    @Test
    @DisplayName("문자열 \"abc\"의 허용되지 않는 위치의 문자를 가져오려고 할 때, StringIndexOutOfBoundsException 예외 발생")
    void 문자열_특정위치_가져오기_예외발생() {
        String str = "abc";
        CharAt charAt = new CharAt();

        assertThatThrownBy(() -> {
            charAt.charAtPoint(str, 4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index: 4, Size: 3");

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    charAt.charAtPoint(str, 4);
                }).withMessageMatching("Index: \\d+, Size: \\d+");
    }
}
