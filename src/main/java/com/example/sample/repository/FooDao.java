package com.example.sample.repository;

import com.example.sample.entity.Foo;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface FooDao {

    /**
     * @param f1
     * @param f2
     * @return the Foo entity
     */
    @Select
    Foo selectById(Integer f1, String f2);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Foo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Foo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Foo entity);
}