package com.example.sample.entity.sales;

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
public class MGachaGoodsListener implements EntityListener<MGachaGoods> {

    @Override
    public void preInsert(MGachaGoods entity, PreInsertContext<MGachaGoods> context) {
    }

    @Override
    public void preUpdate(MGachaGoods entity, PreUpdateContext<MGachaGoods> context) {
    }

    @Override
    public void preDelete(MGachaGoods entity, PreDeleteContext<MGachaGoods> context) {
    }

    @Override
    public void postInsert(MGachaGoods entity, PostInsertContext<MGachaGoods> context) {
    }

    @Override
    public void postUpdate(MGachaGoods entity, PostUpdateContext<MGachaGoods> context) {
    }

    @Override
    public void postDelete(MGachaGoods entity, PostDeleteContext<MGachaGoods> context) {
    }
}