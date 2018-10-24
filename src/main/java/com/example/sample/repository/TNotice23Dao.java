package com.example.sample.repository;

import com.example.sample.entity.TNotice23;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice23Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice23 entity
     */
    @Select
    TNotice23 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice23 entity);
}