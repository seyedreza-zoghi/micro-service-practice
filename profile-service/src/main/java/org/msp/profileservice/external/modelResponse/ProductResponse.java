package org.msp.profileservice.external.modelResponse;

import jakarta.persistence.Version;
import lombok.Data;

@Data
public class ProductResponse {
    private Long id;
    private String name;
    private String price;
}
