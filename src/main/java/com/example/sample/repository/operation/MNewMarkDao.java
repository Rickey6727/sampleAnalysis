package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MNewMark;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MNewMarkDao {

    /**
     * @param screenId
     * @param tabId
     * @return the MNewMark entity
     */
    @Select
    MNewMark selectById(Integer screenId, Integer tabId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MNewMark entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MNewMark entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MNewMark entity);
}