package com.example.sample.entity.game;

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
public class TCareStatesListener implements EntityListener<TCareStates> {

    @Override
    public void preInsert(TCareStates entity, PreInsertContext<TCareStates> context) {
    }

    @Override
    public void preUpdate(TCareStates entity, PreUpdateContext<TCareStates> context) {
    }

    @Override
    public void preDelete(TCareStates entity, PreDeleteContext<TCareStates> context) {
    }

    @Override
    public void postInsert(TCareStates entity, PostInsertContext<TCareStates> context) {
    }

    @Override
    public void postUpdate(TCareStates entity, PostUpdateContext<TCareStates> context) {
    }

    @Override
    public void postDelete(TCareStates entity, PostDeleteContext<TCareStates> context) {
    }
}