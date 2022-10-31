package com.tutoring.javastudy.base;

import lombok.Getter;

abstract public class BaseDto<Entity extends BaseEntity> {
    @Getter
    protected String[] fillable;

    public Entity toEntity() {
        Entity entity = (Entity) new BaseEntity();
        return entity;
    }
}
