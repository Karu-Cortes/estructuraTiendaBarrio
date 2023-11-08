package TiendaBarrioAppMven.infrastructure.dao.crud;



import TiendaBarrioAppMven.domain.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCrud implements IGenericCrud<Product> {


  protected final List<Product> productList;

  public ProductCrud() {
    this.productList = new ArrayList<>();
  }


  @Override
  public void add(Product entity) {
    productList.add(entity);
  }

  @Override
  public void edit(Product entity) {

  }

  @Override
  public void remove(Product entity) {

  }

  @Override
  public Product findById(Integer id) {
    return null;
  }

  @Override
  public List<Product> findAll() {
    return null;
  }
}
