package com.example.sample.repository;

import com.example.sample.entity.TRaiseEventState;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TRaiseEventStateDao {

    /**
     * @param accountId
     * @param eventId
     * @return the TRaiseEventState entity
     */
    @Select
    TRaiseEventState selectById(Integer accountId, Integer eventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TRaiseEventState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TRaiseEventState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TRaiseEventState entity);
}