package in.stonecoldev.forum;

import java.util.List;
import java.util.Optional;

public interface Tree {

  List<Tree> children();

  Optional<Tree> parent();

  List<Tree> addChild(Tree child);

  List<Tree> removeChild(Tree child);

  void reparent(Tree newParent, Tree child);

  int delete(Tree toDelete);

}
