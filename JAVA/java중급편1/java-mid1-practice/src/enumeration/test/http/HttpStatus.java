package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;
    HttpStatus(int code, String message){
        this.code = code;
        this.message = message;
    }
    public static HttpStatus findByCode(int code){ //여기서 왜 static??
        HttpStatus[] httpStatuses = HttpStatus.values();
        for (HttpStatus httpStatus : httpStatuses) {
            if(httpStatus.getCode() == code){
                return httpStatus;
            }
        }
        return null;
    }

    public int getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
    public boolean isSuccess(){
        if (this.code >= 200 && this.code <= 299){
            return true;
        }
        return false;
    }
}
