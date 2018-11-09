package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MNoticeMessage;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface MNoticeMessageDao {

    /**
     * @param noticeType
     * @param countryCd
     * @param messageId
     * @return the MNoticeMessage entity
     */
    @Select
    Optional<MNoticeMessage> selectById(Integer noticeType, Integer countryCd, Integer messageId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MNoticeMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MNoticeMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MNoticeMessage entity);
}