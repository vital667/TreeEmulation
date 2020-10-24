package branches;

import leafs.LeafPrototype;
import java.util.List;

public class BranchNeedle extends BranchPrototype {

    public BranchNeedle(boolean isMainBranch, List<LeafPrototype> leaves, List<BranchPrototype> branches) {
        super(isMainBranch, leaves, branches);
    }

    public BranchNeedle(boolean isMainBranch) {
        super(isMainBranch);
    }
}
