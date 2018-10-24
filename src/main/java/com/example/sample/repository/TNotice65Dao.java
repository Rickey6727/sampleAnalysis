package com.example.sample.repository;

import com.example.sample.entity.TNotice65;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice65Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice65 entity
     */
    @Select
    TNotice65 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice65 entity);
}