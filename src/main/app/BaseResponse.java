package app;

public class BaseResponse {

    private final String status;
    private final Integer code;
    private final String message;

    public BaseResponse(String status, Integer code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
