package trees;

public interface Growable {

    /**
     * implementacja metody grow() w każdej klasie drzewa za pomocą metody addBranch() klasy abstrakcyjnej TreePrototype
     * wg jakiejś logiki - dodajemy gałęzie(BranchLeaf/BranchNeedle) i liście(Leaf/Needle) do tych gałezi,
     * określamy czy gałęzie odchodzą od konara czy od innych gałęzi
     */
    void grow();

}
