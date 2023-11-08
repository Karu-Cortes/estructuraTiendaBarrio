package TiendaBarrioAppMven.infrastructure.dao.crud;

import java.util.List;

public interface IGenericCrud<T> {

  void add(T entity);
  void edit(T entity);
  void remove(T entity);

  T findById(Integer id);

  List<T> findAll();

}
