package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MRubyPointGrant;
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
public interface MRubyPointGrantDao {

    /**
     * @param gachaId
     * @param rubyLotGrantType
     * @param subId
     * @return the MRubyPointGrant entity
     */
    @Select
    Optional<MRubyPointGrant> selectById(Integer gachaId, Integer rubyLotGrantType, Integer subId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRubyPointGrant entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRubyPointGrant entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRubyPointGrant entity);
}