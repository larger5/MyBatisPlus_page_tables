package com.cun.app.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author linhongcun
 * @since 2018-08-01
 */
@TableName("t_student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "学生名称")
    private String name;

    @ApiModelProperty(value = "学生密码")
    private String password;

    @ApiModelProperty(value = "学生积分数")
    private Integer points;

    @ApiModelProperty(value = "学生邮件地址")
    private String email;

    @ApiModelProperty(value = "学生手机号码")
    private String phone;

    @ApiModelProperty(value = "学生学号")
    private String num;

    @ApiModelProperty(value = "学生真实姓名")
    @TableField("true_name")
    private String trueName;

    public Student(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Student() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", id=" + id +
                ", name=" + name +
                ", password=" + password +
                ", points=" + points +
                ", email=" + email +
                ", phone=" + phone +
                ", num=" + num +
                ", trueName=" + trueName +
                "}";
    }
}