package TiendaBarrioAppMven.infrastructure.dao.crud;



import TiendaBarrioAppMven.domain.entity.Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryCrud implements IGenericCrud<Inventory> {

  protected final List<Inventory> inventoryList;

  public InventoryCrud() {
    this.inventoryList = new ArrayList<>();
  }

  @Override
  public void add(Inventory entity) {

  }

  @Override
  public void edit(Inventory entity) {

  }

  @Override
  public void remove(Inventory entity) {

  }

  @Override
  public Inventory findById(Integer id) {
    return null;
  }

  @Override
  public List<Inventory> findAll() {
    return null;
  }
}
