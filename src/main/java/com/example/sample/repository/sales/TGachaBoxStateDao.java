package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaBoxState;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGachaBoxStateDao {

    /**
     * @param accountId
     * @param gachaId
     * @return the TGachaBoxState entity
     */
    @Select
    TGachaBoxState selectById(Integer accountId, Integer gachaId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaBoxState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaBoxState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaBoxState entity);
}