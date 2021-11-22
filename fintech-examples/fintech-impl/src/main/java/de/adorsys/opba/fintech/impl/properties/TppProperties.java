package de.adorsys.opba.fintech.impl.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Valid
@Data
@Configuration
@ConfigurationProperties(prefix = "tpp")
public class TppProperties {

    @NotBlank
    private String fintechID;

    @NotBlank
    private String fintechDataProtectionPassword;
}
