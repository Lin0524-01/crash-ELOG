package com.moon.elog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @Title: BaseEntity
 * @Author lin
 * @Date 2023/11/11 15:29
 * @description: 通用实体
 */
@Data
public class BaseEntity {
    @TableField(fill = FieldFill.INSERT)
    private Long createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateTime;
}
