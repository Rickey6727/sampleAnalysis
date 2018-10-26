package com.example.sample.entity.operation;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class MBonusGoodsListener implements EntityListener<MBonusGoods> {

    @Override
    public void preInsert(MBonusGoods entity, PreInsertContext<MBonusGoods> context) {
    }

    @Override
    public void preUpdate(MBonusGoods entity, PreUpdateContext<MBonusGoods> context) {
    }

    @Override
    public void preDelete(MBonusGoods entity, PreDeleteContext<MBonusGoods> context) {
    }

    @Override
    public void postInsert(MBonusGoods entity, PostInsertContext<MBonusGoods> context) {
    }

    @Override
    public void postUpdate(MBonusGoods entity, PostUpdateContext<MBonusGoods> context) {
    }

    @Override
    public void postDelete(MBonusGoods entity, PostDeleteContext<MBonusGoods> context) {
    }
}