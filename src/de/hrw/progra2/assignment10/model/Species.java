package de.hrw.progra2.assignment10.model;

/**
 * Enumerator for species.
 */
public enum Species {
    /**
     * Daisy. Bright and fun.
     * German: Gänseblümchen.
     */
    DAISY("Bright and fun."),
    /**
     * Orchid. Usually includes three petals.
     * German: Orchidee.
     */
    ORCHID("Usually includes three petals."),
    /**
     * Tulip. Streaks of colours.
     * German: Tulpe.
     */
    TULIP("Streaks of colours."),
    /**
     * Dahlia. A rainbow of colours.
     * German: Dahlie.
     */
    DAHLIA("A rainbow of colours.");

    private String description;

    /**
     * Constructor for constructing a flower-species.
     * @param description
     */
    Species(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "Species{" +
                "description='" + description + '\'' +
                '}';
    }
}
