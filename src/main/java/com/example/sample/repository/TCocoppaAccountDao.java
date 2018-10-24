package com.example.sample.repository;

import com.example.sample.entity.TCocoppaAccount;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TCocoppaAccountDao {

    /**
     * @param accountId
     * @return the TCocoppaAccount entity
     */
    @Select
    TCocoppaAccount selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCocoppaAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCocoppaAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCocoppaAccount entity);
}