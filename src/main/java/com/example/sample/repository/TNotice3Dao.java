package com.example.sample.repository;

import com.example.sample.entity.TNotice3;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice3Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice3 entity
     */
    @Select
    TNotice3 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice3 entity);
}