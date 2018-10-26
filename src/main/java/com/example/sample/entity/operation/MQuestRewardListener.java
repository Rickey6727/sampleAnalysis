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
public class MQuestRewardListener implements EntityListener<MQuestReward> {

    @Override
    public void preInsert(MQuestReward entity, PreInsertContext<MQuestReward> context) {
    }

    @Override
    public void preUpdate(MQuestReward entity, PreUpdateContext<MQuestReward> context) {
    }

    @Override
    public void preDelete(MQuestReward entity, PreDeleteContext<MQuestReward> context) {
    }

    @Override
    public void postInsert(MQuestReward entity, PostInsertContext<MQuestReward> context) {
    }

    @Override
    public void postUpdate(MQuestReward entity, PostUpdateContext<MQuestReward> context) {
    }

    @Override
    public void postDelete(MQuestReward entity, PostDeleteContext<MQuestReward> context) {
    }
}