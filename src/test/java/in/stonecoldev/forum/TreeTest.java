package in.stonecoldev.forum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeTest {


  @Test
  public void treeTest() {

    Post root =
        PostBuilder.builder()
        .id(1)
        .title("root")
        .body("root node")
        .build();

    Post firstReply = root.withId(2);

    assertEquals(List.of(firstReply), root.addChild(firstReply));


  }

}