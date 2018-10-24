package com.example.sample.repository;

import com.example.sample.entity.TInformation;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TInformationDao {

    /**
     * @param accountId
     * @return the TInformation entity
     */
    @Select
    TInformation selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TInformation entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TInformation entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TInformation entity);
}