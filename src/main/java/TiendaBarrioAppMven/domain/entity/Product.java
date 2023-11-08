package TiendaBarrioAppMven.domain.entity;


import TiendaBarrioAppMven.infrastructure.lasting.ECategory;
import TiendaBarrioAppMven.infrastructure.lasting.ELabel;

public class Product {

    /**
     * Atributos de la clase @Products
     *
     * @param category corresponde al enum creado en la carpeta lasting llamado ECategory
     */

    private final Integer idProduct;
    private String name;
    private String description;
    private Double price;
    private ECategory category;
    private ELabel label;
    private static Integer counterId = 0;


    /**
     * Contructores
     */
    public Product(String name, String description, Double price, ECategory category, ELabel label) {
        this.idProduct = counterId++;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.label = label;
    }


    /**
     * Getters and Setters
     */

    public Integer getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ECategory getCategory() {
        return category;
    }

    public void setCategory(ECategory category) {
        this.category = category;
    }

    public ELabel getLabel() {
        return label;
    }

    public void setLabel(ELabel label) {
        this.label = label;
    }

    public static Integer getCounterId() {
        return counterId;
    }

    public static void setCounterId(Integer counterId) {
        Product.counterId = counterId;
    }
}
