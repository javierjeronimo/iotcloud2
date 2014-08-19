package cgl.iotcloud.transport.kafka.consumer;

public class FailedFetchException extends RuntimeException {

    public FailedFetchException(String message) {
        super(message);
    }

    public FailedFetchException(Exception e) {
        super(e);
    }
}
