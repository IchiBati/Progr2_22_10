package de.hrw.progra2.assignment10;

import de.hrw.progra2.assignment10.model.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class InformationPanel {

    /**
     * For each flower in a garden bed, this method prints the species and
     * whether the flower has enough sunlight.
     * @param gardenBed a garden bed
     */
    public void printFlowerInformationForGardenBed(GardenBed gardenBed) {
        gardenBed.getFlowers().stream().map(Flower::getSpecies).forEach(System.out::print);
        gardenBed.getFlowers().stream().map(Flower::isEnoughSun).forEach(x -> System.out.println(" - has enough light: " + x));
    }

    /**
     * Prints every flower of a garden bed that has a preferred fertilizer
     * which is also within the soil of the garden bed.
     * @param gardenBed a garden bed
     */
    public void printFlowersWithAdequateFertilizer(GardenBed gardenBed) {
        gardenBed.getFlowers().stream().filter(flower -> gardenBed.getSoil().getFertilizers().contains(flower.getSuitableFertilizer())).forEach(System.out::println);
    }

    /**
     * Returns garden beds that do not use a given fertilizer.
     * @param gardenBeds an array of garden beds
     * @param fertilizer forbidden fertilizer
     * @return Returns garden beds that do not include the forbidden fertilizer.
     */
    public List<GardenBed> getGardenBedsByFertilizer(GardenBed[] gardenBeds, Fertilizer fertilizer) {
        return Arrays.stream(gardenBeds).filter(gardenBed -> !(gardenBed.getSoil().getFertilizers().contains(fertilizer))).collect(Collectors.toList());
    }

    /**
     * Calculates the average visitors for given botanical gardens.
     * @param botanicalGardens List of botanical gardens
     * @return Average amount of visitors
     */
    public double getAverageVisitorsForBotanicalGardens(List<BotanicalGarden> botanicalGardens) {
        return botanicalGardens.stream().mapToLong(BotanicalGarden::getTotalVisitorsPerYear).average().orElse(0);
    }

    /**
     * Counts all flowers within a garden bed by species.
     * @param gardenBed garden bed
     * @return Returns a map, mapping the species to the number of flowers of that species.
     */
    public Map<Species, Long> getGroupedFlowersBySpeciesOfBotanicalGarden(GardenBed gardenBed) {
        gardenBed.getFlowers()
    }

    /**
     * Returns all garden beds from given list of graden beds that contain given flower.
     * @param gardenBeds list of garden beds
     * @param flower flow to search for
     * @return Returns a list of graden beds that contain given flower
     */
    public List<GardenBed> getGardenBedsWithSpecificFlower(List<GardenBed> gardenBeds, Flower flower) {
        // TODO: Solution expected
    }

    // === EXTRA EXERCISE ===

    /**
     * Calculates the sum of daisy flowers within a botanical garden.
     * @param botanicalGarden
     * @return Number of daisy flowers
     */
    public long getNumberOfDaisyFlowers(BotanicalGarden botanicalGarden) {
        // TODO: Solution expected
    }
}
