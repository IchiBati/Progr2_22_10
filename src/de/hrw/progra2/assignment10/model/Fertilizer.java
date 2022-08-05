package de.hrw.progra2.assignment10.model;

/**
 * Enumerator for fertilizer.
 */
public enum Fertilizer {
    /**
     * Mineral fertilizer.
     * German: Anorganisches Mineraldüngemittel
     */
    MINERAL("Anorganic mineral fertilizer"),
    /**
     * Gaseous fertilizer.
     * German: Gasförmiges Kohlenstoffdioxid-Düngemittel.
     */
    GASEOUS("Gaseous carbon dioxide fertilizer"),
    /**
     * Organic fertilizer like compost.
     *  German: Organisches Düngemittel, wie Kompost, teilweise oxidiert.
     */
    ORGANIC("Organic fertilizer");

    /** Name of Fertilizer type. */
    private String fertilizerName;

    /**
     * Constructor for constructing fertilizers.
     * @param fertilizerName
     */
    Fertilizer(String fertilizerName) {
        this.fertilizerName = fertilizerName;
    }

    public String getFertilizerName() {
        return fertilizerName;
    }

    @Override
    public String toString() {
        return "Fertilizer{" +
                "fertilizerName='" + fertilizerName + '\'' +
                '}';
    }
}
