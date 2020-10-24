package trees;

import branches.BranchPrototype;

import java.util.ArrayList;
import java.util.List;

public abstract class TreePrototype {

    List<BranchPrototype> branches;

    /**
     * możemy stworzyć puste drzewo z samym kanarem lub od razu jakąś strukturę tego drzewa
     */

    public TreePrototype() {
        branches = new ArrayList<>();
    }

    public TreePrototype(List<BranchPrototype> branches) {
        this.branches = branches;
    }

    public void addBranch(BranchPrototype branch) {
        /**implementacja logiki gdzie dodajemy nową gałąź z liśmi lub bez*/
    }

}
