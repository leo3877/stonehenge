package com.bornstone.stonehenge.manager.advice;

import com.bornstone.stonehenge.entity.DeleteAbleEntity;

/**
 * Created by King.Tang on 14-10-16.
 *
 * @author King.Tang
 *         my249645546@163.com
 * @since 0.2
 */
public interface IBeforeDelete<T extends DeleteAbleEntity> extends IBefore {
    void beforeDelete(T rawData);
}
