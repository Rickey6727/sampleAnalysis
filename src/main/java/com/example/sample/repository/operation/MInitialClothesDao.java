package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInitialClothes;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MInitialClothesDao {

    /**
     * @param avatarId
     * @param clothesId
     * @return the MInitialClothes entity
     */
    @Select
    MInitialClothes selectById(Integer avatarId, Integer clothesId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInitialClothes entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInitialClothes entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInitialClothes entity);
}