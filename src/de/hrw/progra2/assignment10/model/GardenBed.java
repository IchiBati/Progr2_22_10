package de.hrw.progra2.assignment10.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A garden bed containing flowers.
 */
public class GardenBed {
    /** A list of all flowers within the garden bed */
    private List<Flower> flowers;
    /** The soil in which flowers are planted */
    private Soil soil;

    /**
     * Constructs a garden bed.
     * @param flowers
     * @param soil
     */
    public GardenBed(List<Flower> flowers, Soil soil) {
        this.flowers = new ArrayList<>(flowers);
        this.soil = soil;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    /**
     * Adds a flower to the garden bed.
     * @param flower
     */
    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    public Soil getSoil() {
        return soil;
    }

    public void setSoil(Soil soil) {
        this.soil = soil;
    }

    @Override
    public String toString() {
        return "GardenBed{" +
                "flowers=" + flowers +
                ", soil=" + soil +
                '}';
    }
}
