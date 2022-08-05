package de.hrw.progra2.assignment10.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * A botanical garden.
 */
public class BotanicalGarden {
    /** List of all garden beds in botanical garden */
    private List<GardenBed> gardenBeds;
    /** Opening date */
    private LocalDate openingDate;
    /** Closing date */
    private LocalDate closingDate;
    /** Total visitors per year */
    private long totalVisitorsPerYear;

    /**
     * Constructs a botanical garden.
     * @param gardenBeds
     * @param openingDate
     * @param closingDate
     * @param totalVisitorsPerYear
     */
    public BotanicalGarden(List<GardenBed> gardenBeds, LocalDate openingDate, LocalDate closingDate, long totalVisitorsPerYear) {
        this.gardenBeds = new ArrayList<>(gardenBeds);
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.totalVisitorsPerYear = totalVisitorsPerYear;
    }

    public List<GardenBed> getGardenBeds() {
        return gardenBeds;
    }

    /**
     * Adds a garden bed to the botanical garden.
     * @param gardenBed
     */
    public void addGardenBed(GardenBed gardenBed) {
        this.gardenBeds.add(gardenBed);
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    public long getTotalVisitorsPerYear() {
        return totalVisitorsPerYear;
    }

    public void setTotalVisitorsPerYear(long totalVisitorsPerYear) {
        this.totalVisitorsPerYear = totalVisitorsPerYear;
    }

    @Override
    public String toString() {
        return "BotanicalGarden{" +
                "gardenBeds=" + gardenBeds +
                ", openingDate=" + openingDate +
                ", closingDate=" + closingDate +
                '}';
    }
}
