package Error_Code;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorCodesConfig {
    @Value("${error-codes.b1}")
    private String bucketNotExist;

    @Value("${error-codes.b2}")
    private String insufficientAccessRights;

    @Value("${error-codes.t1}")
    private String timeout;

    @Value("${error-codes.g1}")
    private String systemProblem;

    @Value("${error-codes.a1}")
    private String incorrectAccessCredentials;

    @Value("${error-codes.a2}")
    private String tokenExpired;

    @Value("${error-codes.a3}")
    private String tokenNotExist;

    @Value("${error-codes.a4}")
    private String problemWithToken;

    @Value("${error-codes.f1}")
    private String invalidHttpRequest;

    // Getters for the error messages
    public String getBucketNotExist() {
        return bucketNotExist;
    }

    public String getInsufficientAccessRights() {
        return insufficientAccessRights;
    }

    public String getTimeout() {
        return timeout;
    }

    public String getSystemProblem() {
        return systemProblem;
    }

    public String getIncorrectAccessCredentials() {
        return incorrectAccessCredentials;
    }

    public String getTokenExpired() {
        return tokenExpired;
    }

    public String getTokenNotExist() {
        return tokenNotExist;
    }

    public String getProblemWithToken() {
        return problemWithToken;
    }

    public String getInvalidHttpRequest() {
        return invalidHttpRequest;
    }
}
