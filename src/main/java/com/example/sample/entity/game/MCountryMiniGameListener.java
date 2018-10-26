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
public class MCountryMiniGameListener implements EntityListener<MCountryMiniGame> {

    @Override
    public void preInsert(MCountryMiniGame entity, PreInsertContext<MCountryMiniGame> context) {
    }

    @Override
    public void preUpdate(MCountryMiniGame entity, PreUpdateContext<MCountryMiniGame> context) {
    }

    @Override
    public void preDelete(MCountryMiniGame entity, PreDeleteContext<MCountryMiniGame> context) {
    }

    @Override
    public void postInsert(MCountryMiniGame entity, PostInsertContext<MCountryMiniGame> context) {
    }

    @Override
    public void postUpdate(MCountryMiniGame entity, PostUpdateContext<MCountryMiniGame> context) {
    }

    @Override
    public void postDelete(MCountryMiniGame entity, PostDeleteContext<MCountryMiniGame> context) {
    }
}