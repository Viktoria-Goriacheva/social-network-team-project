package ru.socialnet.team29.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "server.db")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ServerDb {

    private String port;
}






