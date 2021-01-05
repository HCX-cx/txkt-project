package com.qf.pojo.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResp {
    private Integer code;
    private String message;
    private Object data;
    private Long total;
}
