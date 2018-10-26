package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MItemPackName;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MItemPackNameDao {

    /**
     * @param packId
     * @param countryCd
     * @return the MItemPackName entity
     */
    @Select
    MItemPackName selectById(Integer packId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MItemPackName entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MItemPackName entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MItemPackName entity);
}