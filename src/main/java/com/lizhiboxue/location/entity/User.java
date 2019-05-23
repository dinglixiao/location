package com.lizhiboxue.location.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User {

    @Id
    private String id;
    private String username;
    private String password;

    private Boolean enabled;
    private Date createTime;
    private Date updateTime;
}
