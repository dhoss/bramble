package in.stonecoldev.frontend;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class HomeControllerTest {

  @Inject
  @Client("/")
  private HttpClient client;

  @Test
  public void home() {
    HttpRequest<?> request = HttpRequest.GET("/").accept(MediaType.TEXT_PLAIN);

    assertNotNull(client.toBlocking().retrieve(request));
    assertEquals("bramble", client.toBlocking().retrieve(request));
  }
}