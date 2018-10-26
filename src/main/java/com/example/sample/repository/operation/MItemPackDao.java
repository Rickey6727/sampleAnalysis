package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MItemPack;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MItemPackDao {

    /**
     * @param packId
     * @param itemType
     * @param itemId
     * @return the MItemPack entity
     */
    @Select
    MItemPack selectById(Integer packId, Integer itemType, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MItemPack entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MItemPack entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MItemPack entity);
}