package com.caprocoo.ob.repository.rdb;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@Getter
public class CrudEntity implements Serializable {

    @Column(name = "REG_ID", nullable = false, updatable = false)
    protected String regId;

    @CreationTimestamp
    @Column(name = "REG_DT", nullable = false, updatable = false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    protected Timestamp regDt;

    @Column(name = "UPD_ID")
    protected String updId;


    @UpdateTimestamp
    @Column(name = "UPD_DT")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    protected Timestamp updDt;

    public CrudEntity() {
        super();
//        this.regId = getUsername();
//        this.updId = getUsername();
        this.regId = "getUsername";
        this.updId = "getUsername";
    }

    public CrudEntity(String regId, String updId) {
        super();
        this.regId = regId;
        this.updId = updId;
    }
}
