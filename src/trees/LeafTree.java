package trees;

import branches.BranchPrototype;

import java.util.List;

public class LeafTree extends TreePrototype implements Growable {

    public LeafTree(List<BranchPrototype> branches) {
        super(branches);
    }

    @Override
    public void grow() {
        /**implementacja logiki*/
    }
}
