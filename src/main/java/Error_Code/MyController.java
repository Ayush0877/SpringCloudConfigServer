package Error_Code;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private final ErrorCodesConfig errorCodesConfig;

    public MyController(ErrorCodesConfig errorCodesConfig) {
        this.errorCodesConfig = errorCodesConfig;
    }

    @GetMapping("/some-endpoint")
    public ResponseEntity<?> someEndpoint() {
        // Simulating an error condition
        String errorCode = "B1";
        String errorMessage = errorCodesConfig.getBucketNotExist();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
}
