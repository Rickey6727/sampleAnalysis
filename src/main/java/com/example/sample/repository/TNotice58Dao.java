package com.example.sample.repository;

import com.example.sample.entity.TNotice58;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice58Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice58 entity
     */
    @Select
    TNotice58 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice58 entity);
}