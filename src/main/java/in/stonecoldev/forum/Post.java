package in.stonecoldev.forum;


import io.soabase.recordbuilder.core.RecordBuilder;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RecordBuilder
public record Post(
    Integer id,
    String title,
    String body,
    Integer authorId,
    List<Tree> children,
    Optional<Tree> parent,
    OffsetDateTime createdOn,
    OffsetDateTime updatedOn) implements PostBuilder.With, Tree {

  @Override
  public List<Tree> addChild(Tree child) {
    List<Tree> children =
        Optional.ofNullable(this.children())
            .orElseGet(ArrayList::new);

    children.add(child);

    return this.withChildren(children).children();
  }

  @Override
  public List<Tree> removeChild(Tree child) {
    return List.of();
  }

  @Override
  public void reparent(Tree newParent, Tree child) {

  }

  @Override
  public int delete(Tree toDelete) {
    return 0;
  }

}