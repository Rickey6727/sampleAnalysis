package com.example.sample.entity.account;

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
public class TTutorialStateListener implements EntityListener<TTutorialState> {

    @Override
    public void preInsert(TTutorialState entity, PreInsertContext<TTutorialState> context) {
    }

    @Override
    public void preUpdate(TTutorialState entity, PreUpdateContext<TTutorialState> context) {
    }

    @Override
    public void preDelete(TTutorialState entity, PreDeleteContext<TTutorialState> context) {
    }

    @Override
    public void postInsert(TTutorialState entity, PostInsertContext<TTutorialState> context) {
    }

    @Override
    public void postUpdate(TTutorialState entity, PostUpdateContext<TTutorialState> context) {
    }

    @Override
    public void postDelete(TTutorialState entity, PostDeleteContext<TTutorialState> context) {
    }
}