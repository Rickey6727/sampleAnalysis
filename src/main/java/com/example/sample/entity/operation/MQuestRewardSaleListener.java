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
public class MQuestRewardSaleListener implements EntityListener<MQuestRewardSale> {

    @Override
    public void preInsert(MQuestRewardSale entity, PreInsertContext<MQuestRewardSale> context) {
    }

    @Override
    public void preUpdate(MQuestRewardSale entity, PreUpdateContext<MQuestRewardSale> context) {
    }

    @Override
    public void preDelete(MQuestRewardSale entity, PreDeleteContext<MQuestRewardSale> context) {
    }

    @Override
    public void postInsert(MQuestRewardSale entity, PostInsertContext<MQuestRewardSale> context) {
    }

    @Override
    public void postUpdate(MQuestRewardSale entity, PostUpdateContext<MQuestRewardSale> context) {
    }

    @Override
    public void postDelete(MQuestRewardSale entity, PostDeleteContext<MQuestRewardSale> context) {
    }
}