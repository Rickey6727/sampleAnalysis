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
public class MEventRewardGoodsListener implements EntityListener<MEventRewardGoods> {

    @Override
    public void preInsert(MEventRewardGoods entity, PreInsertContext<MEventRewardGoods> context) {
    }

    @Override
    public void preUpdate(MEventRewardGoods entity, PreUpdateContext<MEventRewardGoods> context) {
    }

    @Override
    public void preDelete(MEventRewardGoods entity, PreDeleteContext<MEventRewardGoods> context) {
    }

    @Override
    public void postInsert(MEventRewardGoods entity, PostInsertContext<MEventRewardGoods> context) {
    }

    @Override
    public void postUpdate(MEventRewardGoods entity, PostUpdateContext<MEventRewardGoods> context) {
    }

    @Override
    public void postDelete(MEventRewardGoods entity, PostDeleteContext<MEventRewardGoods> context) {
    }
}