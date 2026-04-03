package in.stonecoldev.forum;

import java.util.List;
import java.util.Optional;

public interface Tree {

  Integer id();

  List<Tree> children();

  Optional<Tree> parent();

}
