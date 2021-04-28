package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: yuewenbo971@hellobike.com
 * @Date: 2021/3/23 15:34
 * @Description:
 */
@Data
public class User {
    private String userName;
    private String pwd;

    @Max(100)
    @Min(0)
    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date bornTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date deadTime;

    @DecimalMax(value = "1", message = "价格必须大于0小于1")
    @DecimalMin(value = "0", message = "价格必须大于0小于1")
    private BigDecimal price;
}