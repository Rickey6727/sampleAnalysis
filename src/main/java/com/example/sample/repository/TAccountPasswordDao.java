package com.example.sample.repository;

import com.example.sample.entity.TAccountPassword;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TAccountPasswordDao {

    /**
     * @param accountId
     * @param mailAddress
     * @return the TAccountPassword entity
     */
    @Select
    TAccountPassword selectById(Integer accountId, String mailAddress);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TAccountPassword entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TAccountPassword entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TAccountPassword entity);
}