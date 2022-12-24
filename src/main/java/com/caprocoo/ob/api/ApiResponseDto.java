package com.caprocoo.ob.api;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 *
 * 응답 래핑 Dto
 *
 * @author jhsong
 * @version 1.0
 * @see <pre>
 * == 개정이력 (Modification Information) ==
 *
 * 수정일    수정자    수정내용
 * -------  -------  ----------------
 * 2022-03-24  jhsong  최초생성
 *
 * </pre>
 * @since 2022-03-24
 */

@Data
@Slf4j
public class ApiResponseDto implements Serializable {

    private boolean success;
    private Object data;
    private String message;


    public ApiResponseDto(){}

    public ApiResponseDto(boolean success){
        this.success = success;
    }

    public ApiResponseDto(boolean success, Object data){
        this.success = success;
        log.info("data = "+data);
        this.data = data;
    }

    public ApiResponseDto(boolean success, Object data, String message){
        this.success = success;
        this.data = data;
        this.message = message;
    }


}
