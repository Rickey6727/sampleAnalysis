package com.example.sample.entity;

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
public class TBannerPopupHistoryListener implements EntityListener<TBannerPopupHistory> {

    @Override
    public void preInsert(TBannerPopupHistory entity, PreInsertContext<TBannerPopupHistory> context) {
    }

    @Override
    public void preUpdate(TBannerPopupHistory entity, PreUpdateContext<TBannerPopupHistory> context) {
    }

    @Override
    public void preDelete(TBannerPopupHistory entity, PreDeleteContext<TBannerPopupHistory> context) {
    }

    @Override
    public void postInsert(TBannerPopupHistory entity, PostInsertContext<TBannerPopupHistory> context) {
    }

    @Override
    public void postUpdate(TBannerPopupHistory entity, PostUpdateContext<TBannerPopupHistory> context) {
    }

    @Override
    public void postDelete(TBannerPopupHistory entity, PostDeleteContext<TBannerPopupHistory> context) {
    }
}