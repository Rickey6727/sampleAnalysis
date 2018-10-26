package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MGachaSmilepoint;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MGachaSmilepointDao {

    /**
     * @param gachaId
     * @return the MGachaSmilepoint entity
     */
    @Select
    MGachaSmilepoint selectById(Integer gachaId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaSmilepoint entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaSmilepoint entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaSmilepoint entity);
}