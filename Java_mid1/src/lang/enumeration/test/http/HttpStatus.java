package lang.enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK")
    , BAD_REQUEST(400, "Bad Request")
    , NOT_FOUND(404, "Not Found")
    , INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int status;
    private final String message;

    HttpStatus(int status, String message){
        this.status = status;
        this.message = message;
    }
    public int getCode() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int inputHttp) {
        for (HttpStatus httpStatus : HttpStatus.values()) {
            if (httpStatus.getCode() == inputHttp) {
                return httpStatus;
            }
        }
        return null;
    }

    public boolean isSuccess(){
        return status >= 200 && status <= 299;
    }
}
