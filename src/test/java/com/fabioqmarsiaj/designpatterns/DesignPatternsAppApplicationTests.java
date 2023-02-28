package com.fabioqmarsiaj.designpatterns;

import com.fabioqmarsiaj.designpatterns.prototype.PrototypeFalse;
import com.fabioqmarsiaj.designpatterns.prototype.PrototypeTrue;
import com.fabioqmarsiaj.designpatterns.singleton.SpringSingleton;
import com.fabioqmarsiaj.designpatterns.singleton.TraditionalSingleton;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternsAppApplicationTests {

    @Autowired
    SpringSingleton springSingleton;
    @Autowired
    SpringSingleton springSingleton2;

    @Autowired
    PrototypeTrue prototypeTrue1;

    @Autowired
    PrototypeTrue prototypeTrue2;

    @Autowired
    PrototypeFalse prototypeFalse1;

    @Autowired
    PrototypeFalse prototypeFalse2;

    @Test
    public void testSingletons() {

        TraditionalSingleton traditionalSingleton1 = TraditionalSingleton.getInstance();
        TraditionalSingleton traditionalSingleton2 = TraditionalSingleton.getInstance();

        Assert.assertNotNull(traditionalSingleton1);
        Assert.assertSame(traditionalSingleton1, traditionalSingleton2);
        Assert.assertNotNull(springSingleton);
        Assert.assertSame(springSingleton, springSingleton2);
    }

    @Test
    public void testPrototypes() {
        Assert.assertSame(prototypeFalse1, prototypeFalse2);
        Assert.assertNotSame(prototypeTrue1, prototypeTrue2);

    }
}
