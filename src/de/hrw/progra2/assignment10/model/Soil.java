package de.hrw.progra2.assignment10.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Soil in which flowers can be planted.
 */
public class Soil {
    /** A list of fertilizers found within the soil */
    private List<Fertilizer> fertilizers;

    /**
     * Constructs a soil.
     * @param fertilizers
     */
    public Soil(List<Fertilizer> fertilizers) {
        this.fertilizers = new ArrayList<>(fertilizers);
    }

    public List<Fertilizer> getFertilizers() {
        return fertilizers;
    }

    /**
     * Adds a fertilizer to the soil.
     * @param fertilizer
     */
    public void addFertilizer(Fertilizer fertilizer) {
        this.fertilizers.add(fertilizer);
    }

    @Override
    public String toString() {
        return "Soil{" +
                "fertilizers=" + fertilizers +
                '}';
    }
}
