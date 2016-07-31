package ua.shad.yatsurapizzaservicehw2.domain;

/**
 *
 * @author Maksym Yatsura
 */
public class Pizza implements Comparable<Pizza> {

    public enum PizzaType {

        SEA, MEAT, VEGAN
    }

    private Integer id;
    private String name;
    private Double price;
    private PizzaType type;

    public Pizza() {
    }

    public Pizza(Integer id, String name) {
        this.id = id;
        this.name = name;        
    }

    public Pizza(Integer id, String name, Double price, PizzaType type) {
        this(id, name);
        this.price = price;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pizza {" + "id:" + id + ", name: " + name
                + ", type: " + type + '}';
    }

    @Override
    public int compareTo(Pizza o) {
        
        if(this.price == null || o == null || o.price == null) {
            throw new IllegalArgumentException();
        }
        return this.price.compareTo(o.getPrice());
    }
    
}
