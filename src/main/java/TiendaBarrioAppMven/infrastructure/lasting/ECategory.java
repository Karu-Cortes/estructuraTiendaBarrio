package TiendaBarrioAppMven.infrastructure.lasting;

import java.util.List;

public enum ECategory {
    /**
     * Atributos
     * Se crea el enum ECategoria, para darle una clasificación a las categorias que existen en el inventario de la
     * tienda, donde tiene dos atributos,
     * @param valueCategory Para agregar el concepto de la categoria
     * El List.of nos ayuda en este caso a crear listas de los elementos del enum ELabel.
     * cada categoria tiene una lista de etiquetas
     */

    ASEO_HOGAR("Aseo Hogar", List.of(ELabel.AMBIENTADORES, ELabel.BLANQUEADORES, ELabel.CERA, ELabel.DESINFECTANTES,
            ELabel.INSECTICIDAS, ELabel.LIMPIEZA)),
    BEBIDAS("Bebidas", List.of(ELabel.AGUA, ELabel.ENERGIZANTES, ELabel.GASEOSAS, ELabel.HIDRATANTES,
            ELabel.JUGOS_MALTAS, ELabel.TE_LIQUIDO)),
    CARNES_FRIAS_Y_CONGELADOS("Carnes frias y Congelados", List.of(ELabel.CONGELADOS, ELabel.EMPANADAS,
            ELabel.PAPAS_YUCAS_Y_PAQUETES)),
    CIGARRILLOS("Cigarrillos", List.of(ELabel.CIGARRILLOS)),
    CUIDADO_BEBE("Cuidado Bebe", List.of(ELabel.ALIMENTACION, ELabel.PANALES, ELabel.PANITOS)),
    CUIDADO_PERSONAL("Cuidado Personal", List.of(ELabel.AFEITADO, ELabel.CREMAS_CORPORALES, ELabel.CUIDADO_ORAL,
            ELabel.DESODORANTES, ELabel.GEL, ELabel.JABONES_DE_TOCADOR, ELabel.PAPEL_HIGIENICO, ELabel.PROTECCION_FEMENINA,
            ELabel.SHAMPOO)),
    CUIDADO_ROPA("Cuidado Ropa", List.of(ELabel.DETERGENTES, ELabel.JABONES_EN_BARRA)),
    DESPENSA("Despensa", List.of(ELabel.ACEITES, ELabel.ARROZ_Y_GRANOS, ELabel.AVENA_HOJUELA, ELabel.AZUCAR_Y_PANELAS,
            ELabel.BASES_CREMAS_Y_SOPAS, ELabel.BASES_ACHOCOLATADAS, ELabel.CAFE, ELabel.CEREALES, ELabel.CHOCOLATES_DE_MESA,
            ELabel.CONDIMENTOS_CALDOS_Y_SAL, ELabel.ENLATADOS_CONSERVAS, ELabel.HARINAS_Y_MEZCLAS, ELabel.PASTAS, ELabel.SALSAS_VINAGRES,
            ELabel.TE_INFUSIONES_E_INSTANTANEOS)),
    DROGERIA("Drogeria", List.of(ELabel.SALUD_BIENESTAR)),
    DULCES_Y_POSTRES("Dulces y Postres", List.of(ELabel.AREQUIPE, ELabel.CHOCOLATERIA, ELabel.CONFITES_DULCES,
            ELabel.CREMA_DE_LECHE_Y_CONDENSADA, ELabel.DULCES_TIPICOS, ELabel.GELATINAS_FLANES_PUDINES, ELabel.REPOSTERIA)),
    ELECTRODOMESTICOS("Electrodomesticos", List.of(ELabel.ELECTRODOMESTICOS)),
    HELADOS("Helados", List.of(ELabel.HELADOS)),
    HOGAR_Y_DECORACION("Hogar y Decoracion", List.of(ELabel.DESECHABLES)),
    IUMINACION_Y_ELECTRICOS("Iuminacion y Electricos", List.of(ELabel.BOMBILLOS, ELabel.PILAS)),
    LACTEO_HUEVOS_Y_REFRIGERADOS("Lacteo/Huevos y refrigerados", List.of(ELabel.ALPINETTE, ELabel.ALPINITO,
            ELabel.AREPAS, ELabel.AVENA, ELabel.CARNES_FRIAS_Y_EMBUTIDOS, ELabel.GELATINAS_FLANES_Y_PUDINES, ELabel.HUEVOS,
            ELabel.KUMIS, ELabel.LECHE, ELabel.LECHES_EN_POLVO, ELabel.MANTEQUILLA, ELabel.MARGARINAS, ELabel.QUESOS,
            ELabel.YOGURT)),
    LIMPIEZA_COCINA("Limpieza Cocina", List.of(ELabel.BOLSAS_DE_BASURA, ELabel.ESPONJAS_Y_FIBRAS,
            ELabel.LAVALOZA, ELabel.SERVILLETAS, ELabel.TRAPEROS_ESCOBAS)),
    MASCOTAS("Mascotas", List.of(ELabel.AVES, ELabel.GATOS, ELabel.HAMSTERS, ELabel.PERRO, ELabel.PEZ)),
    PANADERIA_Y_PASTELERIA("Panaderia y Pasteleria", List.of(ELabel.PANADERIA_EMPACADA)),
    PASABOCAS("Pasabocas", List.of(ELabel.GALLETAS_DULCES, ELabel.GALLETAS_SALADAS, ELabel.GALLETAS_SALUDABLES,
            ELabel.PAPAS_FRITAS_Y_PAQUETES)),
    VINOS_Y_LICORES("Vinos y Licores", List.of(ELabel.AGUARDIENTE, ELabel.BRANDY, ELabel.CERVEZA, ELabel.GINEBRA,
            ELabel.LICOR, ELabel.RON, ELabel.VINOS, ELabel.VODKA, ELabel.WHISKY));
    private String valueCategory;

    private List<ELabel> labels;


    /**
     * Constructor
     */
    ECategory(String valueCategory, List<ELabel> labels) {
        this.valueCategory = valueCategory;
        this.labels = labels;
    }

    /**
     * Getters and Setters
     */

    public String getValueCategory() {
        return valueCategory;
    }

    public void setValueCategory(String valueCategory) {
        this.valueCategory = valueCategory;
    }

    public List<ELabel> getLabels() {
        return labels;
    }

    public void setLabels(List<ELabel> labels) {
        this.labels = labels;
    }
}
