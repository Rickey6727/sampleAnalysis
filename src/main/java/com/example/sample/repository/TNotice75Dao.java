package com.example.sample.repository;

import com.example.sample.entity.TNotice75;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice75Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice75 entity
     */
    @Select
    TNotice75 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice75 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice75 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice75 entity);
}