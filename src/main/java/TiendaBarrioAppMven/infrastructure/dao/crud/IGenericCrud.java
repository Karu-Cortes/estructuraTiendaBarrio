package TiendaBarrioAppMven.infrastructure.dao.crud;


import java.util.List;

public interface IGenericCrud<T> {
  void create(T entity);
  void update(T entity);
  T getByCode(int code);
  List<T> getAll();

}
