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
public class MInformationSimpleTextListener implements EntityListener<MInformationSimpleText> {

    @Override
    public void preInsert(MInformationSimpleText entity, PreInsertContext<MInformationSimpleText> context) {
    }

    @Override
    public void preUpdate(MInformationSimpleText entity, PreUpdateContext<MInformationSimpleText> context) {
    }

    @Override
    public void preDelete(MInformationSimpleText entity, PreDeleteContext<MInformationSimpleText> context) {
    }

    @Override
    public void postInsert(MInformationSimpleText entity, PostInsertContext<MInformationSimpleText> context) {
    }

    @Override
    public void postUpdate(MInformationSimpleText entity, PostUpdateContext<MInformationSimpleText> context) {
    }

    @Override
    public void postDelete(MInformationSimpleText entity, PostDeleteContext<MInformationSimpleText> context) {
    }
}