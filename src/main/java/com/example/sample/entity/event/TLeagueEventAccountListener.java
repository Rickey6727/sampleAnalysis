package com.example.sample.entity.event;

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
public class TLeagueEventAccountListener implements EntityListener<TLeagueEventAccount> {

    @Override
    public void preInsert(TLeagueEventAccount entity, PreInsertContext<TLeagueEventAccount> context) {
    }

    @Override
    public void preUpdate(TLeagueEventAccount entity, PreUpdateContext<TLeagueEventAccount> context) {
    }

    @Override
    public void preDelete(TLeagueEventAccount entity, PreDeleteContext<TLeagueEventAccount> context) {
    }

    @Override
    public void postInsert(TLeagueEventAccount entity, PostInsertContext<TLeagueEventAccount> context) {
    }

    @Override
    public void postUpdate(TLeagueEventAccount entity, PostUpdateContext<TLeagueEventAccount> context) {
    }

    @Override
    public void postDelete(TLeagueEventAccount entity, PostDeleteContext<TLeagueEventAccount> context) {
    }
}