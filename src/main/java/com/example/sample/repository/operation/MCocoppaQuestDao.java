package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCocoppaQuest;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MCocoppaQuestDao {

    /**
     * @param campaignId
     * @param sortNum
     * @param questId
     * @return the MCocoppaQuest entity
     */
    @Select
    MCocoppaQuest selectById(Integer campaignId, Integer sortNum, Integer questId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCocoppaQuest entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCocoppaQuest entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCocoppaQuest entity);
}