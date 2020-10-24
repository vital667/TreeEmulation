package branches;

import leafs.LeafPrototype;
import java.util.List;

public class BranchLeaf extends BranchPrototype {

    public BranchLeaf(boolean isMainBranch, List<LeafPrototype> leaves, List<BranchPrototype> branches) {
        super(isMainBranch, leaves, branches);
    }

    public BranchLeaf(boolean isMainBranch) {
        super(isMainBranch);
    }
}
