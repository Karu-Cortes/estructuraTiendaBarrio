package TiendaBarrioAppMven.application.services;

import TiendaBarrioAppMven.domain.entity.Product;
import TiendaBarrioAppMven.infrastructure.dao.crud.ProductCrud;

import java.util.List;
import java.util.Scanner;

public class ProductService {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ProductCrud productCrud = new ProductCrud();

    public static void createProduct() {
        Product product = new Product();
        System.out.print("Ingrese el nombre del producto: ");
        product.setNombre(scanner.nextLine());
        System.out.print("Ingrese la descripción del producto: ");
        product.setDescripcion(scanner.nextLine());
        System.out.print("Ingrese la categoría del producto: ");
        product.setCategoria(scanner.nextLine());
        System.out.print("Ingrese las etiquetas del producto: ");
        product.setEtiquetas(scanner.nextLine());
        System.out.print("Ingrese el precio del producto: ");
        product.setPrecio(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Ingrese la URL de la foto del producto: ");
        product.setUrlFoto(scanner.nextLine());

        productCrud.create(product);
        System.out.println("Producto creado exitosamente.");
    }

    public static void updateProduct() {
        System.out.print("Ingrese el código del producto a modificar: ");
        int code = scanner.nextInt();
        scanner.nextLine();

        Product product = productCrud.getByCode(code);
        if (product != null) {
            System.out.println("Datos del producto:");
            System.out.println("Código: " + product.getCode());
            System.out.println("Nombre: " + product.getNombre());
            System.out.println("Descripción: " + product.getDescripcion());
            System.out.println("Categoría: " + product.getCategoria());
            System.out.println("Etiquetas: " + product.getEtiquetas());
            System.out.println("Precio: " + product.getPrecio());
            System.out.println("URL de la foto: " + product.getUrlFoto());
            System.out.println();

            System.out.println("Seleccione el campo a modificar:");
            System.out.println("1. Nombre");
            System.out.println("2. Descripción");
            System.out.println("3. Categoría");
            System.out.println("4. Etiquetas");
            System.out.println("5. Precio");
            System.out.println("6. URL de la foto");
            System.out.print("Ingrese el número correspondiente al campo: ");
            int fieldChoice = scanner.nextInt();
            scanner.nextLine();

            switch (fieldChoice) {
                case 1:
                    System.out.print("Ingrese el nuevo nombre del producto: ");
                    product.setNombre(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Ingrese la nueva descripción del producto: ");
                    product.setDescripcion(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Ingrese la nueva categoría del producto: ");
                    product.setCategoria(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Ingrese las nuevas etiquetas del producto: ");
                    product.setEtiquetas(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    product.setPrecio(scanner.nextDouble());
                    scanner.nextLine(); // Consumir el salto de línea
                    break;
                case 6:
                    System.out.print("Ingrese la nueva URL de la foto del producto: ");
                    product.setUrlFoto(scanner.nextLine());
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }

            productCrud.update(product);
            System.out.println("Producto modificado exitosamente.");
        } else {
            System.out.println("No se encontró un producto con el código ingresado.");
        }
    }

    public static void getProduct() {
        System.out.print("Ingrese el código del producto a consultar: ");
        int code = scanner.nextInt();
        scanner.nextLine();

        Product product = productCrud.getByCode(code);
        if (product != null) {
            System.out.println("Código: " + product.getCode());
            System.out.println("Nombre: " + product.getNombre());
            System.out.println("Descripción: " + product.getDescripcion());
            System.out.println("Categoría: " + product.getCategoria());
            System.out.println("Etiquetas: " + product.getEtiquetas());
            System.out.println("Precio: " + product.getPrecio());
            System.out.println("URL de la foto: " + product.getUrlFoto());
        } else {
            System.out.println("No se encontró un producto con el código ingresado.");
        }
    }


    public static void getAllProducts() {
        List<Product> productList = productCrud.getAll();
        if (!productList.isEmpty()) {
            for (Product product : productList) {
                System.out.println("Código: " + product.getCode());
                System.out.println("Nombre: " + product.getNombre());
                System.out.println("Descripción: " + product.getDescripcion());
                System.out.println("Categoría: " + product.getCategoria());
                System.out.println("Etiquetas: " + product.getEtiquetas());
                System.out.println("Precio: " + product.getPrecio());
                System.out.println("URL de la foto: " + product.getUrlFoto());
                System.out.println("-------------------------");
            }
        } else {
            System.out.println("No hay productos disponibles.");
        }
    }

}


