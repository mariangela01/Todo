package it.learning.domain.dao;

import java.util.List;

public interface CrudDAO<Entity, Id> extends DAO {

    void create(Entity entity);

    void delete(Entity entity);

    void update(Entity entity);

    List<Entity> fetchAll();

    Entity fetchOne(Id id);
}
