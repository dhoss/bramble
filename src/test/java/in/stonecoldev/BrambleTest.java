package in.stonecoldev;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class BrambleTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void smoke() {
        Assertions.assertTrue(application.isRunning());
    }

}
