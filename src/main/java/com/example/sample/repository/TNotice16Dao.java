package com.example.sample.repository;

import com.example.sample.entity.TNotice16;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice16Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice16 entity
     */
    @Select
    TNotice16 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice16 entity);
}