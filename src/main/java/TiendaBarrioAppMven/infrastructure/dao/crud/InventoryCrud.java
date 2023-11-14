package TiendaBarrioAppMven.infrastructure.dao.crud;



import TiendaBarrioAppMven.domain.entity.Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryCrud implements IGenericCrud {

  protected final List<Inventory> inventoryList;

  public InventoryCrud() {
    this.inventoryList = new ArrayList<>();
  }


  @Override
  public void create(Object entity) {

  }

  @Override
  public void update(Object entity) {

  }

  @Override
  public Object getByCode(int code) {
    return null;
  }

  @Override
  public List getAll() {
    return null;
  }
}
