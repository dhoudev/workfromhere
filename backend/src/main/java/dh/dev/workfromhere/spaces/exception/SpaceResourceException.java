package dh.dev.workfromhere.spaces.exception;

import dh.dev.workfromhere.exceptions.ErrorCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class SpaceResourceException extends RuntimeException{

    private final ErrorCode errorCode;

    public SpaceResourceException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}
