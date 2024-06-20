package org.acme.openapi.swaggerui;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * Resource class for managing fruits.
 */
@Path("/fruits")
public final class FruitResource {

    /**
     * Set of fruits.
     */
    private Set<Fruit> fruits = Collections.newSetFromMap(
        Collections.synchronizedMap(new LinkedHashMap<>())
    );

    /**
     * Constructor to initialize the fruit set.
     */
    public FruitResource() {
        fruits.add(new Fruit("Apple", "Winter fruit"));
        fruits.add(new Fruit("Pineapple", "Tropical fruit"));
    }

    /**
     * Lists all fruits.
     * @return the set of fruits
     */
    @GET
    public Set<Fruit> list() {
        return fruits;
    }

    /**
     * Adds a new fruit.
     * @param fruit the fruit to add
     * @return the updated set of fruits
     */
    @POST
    public Set<Fruit> add(final Fruit fruit) {
        fruits.add(fruit);
        return fruits;
    }

    /**
     * Deletes a fruit.
     * @param fruit the fruit to delete
     * @return the updated set of fruits
     */
    @DELETE
    public Set<Fruit> delete(final Fruit fruit) {
        fruits.removeIf(existingFruit -> 
            existingFruit.getName().contentEquals(fruit.getName())
        );
        return fruits;
    }
}
