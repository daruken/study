package org.example.study.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SubStringTest {
    @Test
    void 문자열_괄호제거() {
        String str = "(1,2)";
        SubString subString = new SubString();

        String result = subString.removeParenthesis(str);

        assertThat(result).isEqualTo("1,2");
    }
}