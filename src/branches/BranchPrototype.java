package branches;

import leafs.LeafPrototype;

import java.util.ArrayList;
import java.util.List;

public abstract class BranchPrototype {

    /**
     * każda gałąź może zawierać inne gałęzie e zawierać liście) oraz koniecznie informację czy odchodzi od konara
     */

    boolean isMainBranch;

    private List<LeafPrototype> leaves;
    private List<BranchPrototype> branches;

    public BranchPrototype(boolean isMainBranch, List<LeafPrototype> leaves, List<BranchPrototype> branches) {
        this.isMainBranch = isMainBranch;
        this.leaves = leaves;
        this.branches = branches;
    }

    public BranchPrototype(boolean isMainBranch) {
        this.isMainBranch = isMainBranch;
        leaves = new ArrayList<>();
        branches = new ArrayList<>();
    }

    private void addLeaf(LeafPrototype leafPrototype) {
        leaves.add(leafPrototype);
    }

    void addBranch(BranchPrototype branchPrototype) {
        branches.add(branchPrototype);
    }

}
