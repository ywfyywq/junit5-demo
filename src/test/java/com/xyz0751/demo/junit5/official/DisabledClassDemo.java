package com.xyz0751.demo.junit5.official;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * 禁用测试用例示例
 *
 * @author YY
 */
@Disabled("Disabled until bug #99 has been fixed")
class DisabledClassDemo {

    @Test
    void testWillBeSkipped() {
    }

}
