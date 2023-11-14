package TiendaBarrioAppMven.infrastructure.dao.crud;
import TiendaBarrioAppMven.domain.entity.Product;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductCrud implements IGenericCrud<Product> {
  private static final String CSV_FILE_PATH = "src/main/java/TiendaBarrioAppMven/resources/inventory/inventory.csv";

  @Override
  public void create(Product product) {

    /*
    * Acá estamos usando la dependencia Commons CSV , se obtiene el codigo por medio de la lista CSVRecord
    * también para crear el producto,primero debe revisar en que consecutivo va en el csv y sumarle 1 para agregarle
    * el consecutivo a ese nuevo producto int lastCode = Integer.parseInt(records.get(records.size() - 1).get("Codigo"));
      product.setCode(lastCode + 1);
    * */
    try (CSVParser parser = CSVParser.parse(new FileReader(CSV_FILE_PATH), CSVFormat.DEFAULT.withHeader())) {
      List<CSVRecord> records = parser.getRecords();
      int lastCode = Integer.parseInt(records.get(records.size() - 1).get("Codigo"));
      product.setCode(lastCode + 1);

      /*
      * Accedemos al CSV y lo abrimos con CSV_FILE_PATH, usando Apped para agregar el contenido al final de archivo
      * convirtiendo y agregandolo como una cadena*/

      FileWriter writer = new FileWriter(CSV_FILE_PATH, true);
      writer.append(String.valueOf(product.getCode()));
      writer.append(",");
      writer.append(product.getNombre());
      writer.append(",");
      writer.append(product.getDescripcion());
      writer.append(",");
      writer.append(product.getCategoria());
      writer.append(",");
      writer.append(product.getEtiquetas());
      writer.append(",");
      writer.append(String.valueOf(product.getPrecio()));
      writer.append(",");
      writer.append(product.getUrlFoto());
      writer.append("\n");

      writer.flush(); // vacia datos no escritos en el archivo
      writer.close(); // cierra el archivo
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void update(Product product) {

    /*
     * se lee el archivo CSV
     * obtiene los registros existentes en el archivo CSV con records
     * se sobreescribe el producto seleccionado con FileWriter
     * realiza la actualización de la información con el for
     * itera los items y solo actualiza el item que tenga diferencia con el item del producto*/

    try (CSVParser parser = CSVParser.parse(new FileReader(CSV_FILE_PATH), CSVFormat.DEFAULT.withHeader())) {
      List<CSVRecord> records = parser.getRecords();
      FileWriter writer = new FileWriter(CSV_FILE_PATH);

      // Write the header back to the file
      writer.append(String.join(",", parser.getHeaderMap().keySet()));
      writer.append("\n");

      for (CSVRecord record : records) {
        int code = Integer.parseInt(record.get("Codigo"));
        if (code == product.getCode()) {
          writer.append(String.valueOf(product.getCode()));
          writer.append(",");
          writer.append(product.getNombre());
          writer.append(",");
          writer.append(product.getDescripcion());
          writer.append(",");
          writer.append(product.getCategoria());
          writer.append(",");
          writer.append(product.getEtiquetas());
          writer.append(",");
          writer.append(String.valueOf(product.getPrecio()));
          writer.append(",");
          writer.append(product.getUrlFoto());
          writer.append("\n");
        } else {
          writer.append(record.get("Codigo"));
          writer.append(",");
          writer.append(record.get("Nombre"));
          writer.append(",");
          writer.append(record.get("Descripcion"));
          writer.append(",");
          writer.append(record.get("Categoria"));
          writer.append(",");
          writer.append(record.get("Etiquetas"));
          writer.append(",");
          writer.append(record.get("Precio"));
          writer.append(",");
          writer.append(record.get("URL FOTO"));
          writer.append("\n");
        }
      }

      writer.flush();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public Product getByCode(int code) {
    try (CSVParser parser = CSVParser.parse(new FileReader(CSV_FILE_PATH), CSVFormat.DEFAULT.withHeader())) {
      List<CSVRecord> records = parser.getRecords();

      for (CSVRecord record : records) {
        int recordCode = Integer.parseInt(record.get("Codigo"));
        if (recordCode == code) {
          Product product = new Product();
          product.setCode(recordCode);
          product.setNombre(record.get("Nombre"));
          product.setDescripcion(record.get("Descripcion"));
          product.setCategoria(record.get("Categoria"));
          product.setEtiquetas(record.get("Etiquetas"));
          product.setPrecio(Double.parseDouble(record.get("Precio")));
          product.setUrlFoto(record.get("URL FOTO"));
          return product;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }


  @Override
  public List<Product> getAll() {
    List<Product> productList = new ArrayList<>();

    try (CSVParser parser = CSVParser.parse(new FileReader(CSV_FILE_PATH), CSVFormat.DEFAULT.withHeader())) {
      List<CSVRecord> records = parser.getRecords();

      for (CSVRecord record : records) {
        Product product = new Product();
        product.setCode(Integer.parseInt(record.get("Codigo")));
        product.setNombre(record.get("Nombre"));
        product.setDescripcion(record.get("Descripcion"));
        product.setCategoria(record.get("Categoria"));
        product.setEtiquetas(record.get("Etiquetas"));
        product.setPrecio(Double.parseDouble(record.get("Precio")));
        product.setUrlFoto(record.get("URL FOTO"));

        productList.add(product);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return productList;
  }

}


