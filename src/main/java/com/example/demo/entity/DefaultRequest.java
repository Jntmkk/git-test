package com.example.demo.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Auther: yuewenbo971@hellobike.com
 * @Date: 2021/4/25 15:14
 * @Description:
 */
@Data
public class DefaultRequest {
    @NotNull(message = "id不能为null")
    private Long id;
}