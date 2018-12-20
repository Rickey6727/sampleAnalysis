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
public class MLeagueEventListener implements EntityListener<MLeagueEvent> {

    @Override
    public void preInsert(MLeagueEvent entity, PreInsertContext<MLeagueEvent> context) {
    }

    @Override
    public void preUpdate(MLeagueEvent entity, PreUpdateContext<MLeagueEvent> context) {
    }

    @Override
    public void preDelete(MLeagueEvent entity, PreDeleteContext<MLeagueEvent> context) {
    }

    @Override
    public void postInsert(MLeagueEvent entity, PostInsertContext<MLeagueEvent> context) {
    }

    @Override
    public void postUpdate(MLeagueEvent entity, PostUpdateContext<MLeagueEvent> context) {
    }

    @Override
    public void postDelete(MLeagueEvent entity, PostDeleteContext<MLeagueEvent> context) {
    }
}