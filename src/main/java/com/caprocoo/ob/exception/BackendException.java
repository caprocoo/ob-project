package com.caprocoo.ob.exception;

import lombok.Getter;
import lombok.Setter;

/**
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

@Setter
@Getter
public class BackendException extends Exception {

    // TODO 오류코드 정의 필요
    String errorCode;

    public BackendException(String message) {
        super(message);
    }

    public BackendException(String head, Throwable cause) {
        super(head + ", " + cause.getMessage(), cause);
    }

    public BackendException(String errorCode, String head, Throwable cause) {
        super(head + ", " + cause.getMessage(), cause);
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return errorCode == null ? super.getMessage() : "[" + this.errorCode + "] " + super.getMessage();
    }
}
