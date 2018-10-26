package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MRubyPointTargetGacha;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MRubyPointTargetGachaDao {

    /**
     * @param rubyId
     * @param gachaId
     * @return the MRubyPointTargetGacha entity
     */
    @Select
    MRubyPointTargetGacha selectById(Integer rubyId, Integer gachaId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRubyPointTargetGacha entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRubyPointTargetGacha entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRubyPointTargetGacha entity);
}