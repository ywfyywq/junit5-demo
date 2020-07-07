package com.xyz0751.demo.junit5.official;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * 标签示例
 *
 * @author YY
 */
@Tag("fast")
@Tag("model")
class TaggingDemo {

    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }

}
