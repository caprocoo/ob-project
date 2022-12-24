package com.caprocoo.ob.service;

import com.caprocoo.ob.repository.rdb.CrudEntity;
import com.caprocoo.ob.util.DateUtil;
import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString
public abstract class CrudDto {

    protected int seq;

    protected String regId;
    protected Timestamp regDt;
    protected String updId;
    protected Timestamp updDt;

    public CrudDto() {
        this.regDt = DateUtil.getCurrentTimestamp();
        this.updDt = DateUtil.getCurrentTimestamp();
    }

    public CrudDto(String regId) {
        this.regId = regId;
        this.regDt = DateUtil.getCurrentTimestamp();
    }

    public CrudDto(CrudEntity entity) {
        this.regId = entity.getRegId();
        this.regDt = entity.getRegDt() != null ? entity.getRegDt() : null;

        this.updId = entity.getUpdId();
        this.updDt = entity.getUpdDt() != null ? entity.getUpdDt() : null;
    }

    abstract public Object toEntity();
}
