package com.fwtai.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer productId;

    private BigDecimal amount;

    private Integer sum;

    private Integer accountId;

    private LocalDateTime createTime;

    private LocalDateTime replaceTime;

}
