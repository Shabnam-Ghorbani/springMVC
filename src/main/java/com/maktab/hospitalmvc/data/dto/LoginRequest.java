package com.maktab.hospitalmvc.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class LoginRequest {
    @JsonProperty(value = "usernames")
    String username;
    String password;
}
