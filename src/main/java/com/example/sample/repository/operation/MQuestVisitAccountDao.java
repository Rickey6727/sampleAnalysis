package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestVisitAccount;
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
public interface MQuestVisitAccountDao {

    /**
     * @param questId
     * @param accountId
     * @return the MQuestVisitAccount entity
     */
    @Select
    Optional<MQuestVisitAccount> selectById(Integer questId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestVisitAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestVisitAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestVisitAccount entity);
}