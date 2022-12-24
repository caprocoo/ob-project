package com.caprocoo.ob.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yhh
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

@Setter
@Getter
public class BackendRuntimeException extends RuntimeException {

    // TODO 오류코드 정의 필요
    String errorCode;

    public BackendRuntimeException(String message) {
        super(message);
    }

    public BackendRuntimeException(Throwable cause) {
        super(cause.getMessage(), cause.getCause());
    }

    public BackendRuntimeException(String errorCode, Throwable cause) {
        super(cause.getMessage(), cause);
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return errorCode == null ? super.getMessage() : "[" + this.errorCode + "] " + super.getMessage();
    }
}
