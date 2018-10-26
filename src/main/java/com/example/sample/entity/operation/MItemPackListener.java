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
public class MItemPackListener implements EntityListener<MItemPack> {

    @Override
    public void preInsert(MItemPack entity, PreInsertContext<MItemPack> context) {
    }

    @Override
    public void preUpdate(MItemPack entity, PreUpdateContext<MItemPack> context) {
    }

    @Override
    public void preDelete(MItemPack entity, PreDeleteContext<MItemPack> context) {
    }

    @Override
    public void postInsert(MItemPack entity, PostInsertContext<MItemPack> context) {
    }

    @Override
    public void postUpdate(MItemPack entity, PostUpdateContext<MItemPack> context) {
    }

    @Override
    public void postDelete(MItemPack entity, PostDeleteContext<MItemPack> context) {
    }
}