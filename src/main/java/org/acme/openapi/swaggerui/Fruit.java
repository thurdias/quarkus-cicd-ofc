package org.acme.openapi.swaggerui;

/**
 * This class represents a fruit entity.
 */
public class Fruit {

    /**
     * Name of the fruit.
     */
    private String name;

    /**
     * Description of the fruit.
     */
    private String description;

    /**
     * Default constructor.
     */
    public Fruit() {
    }

    /**
     * Constructor with parameters.
     * @param name the name of the fruit
     * @param description the description of the fruit
     */
    public Fruit(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Gets the name of the fruit.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the fruit.
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets the description of the fruit.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the fruit.
     * @param description the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }
}