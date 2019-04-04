package com.intel.form;


import javax.validation.constraints.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TestForm extends BaseForm{

    @Id
    @GeneratedValue
    @NotNull(message = "id不能为空")
    private Integer id;

    @NotNull(message = "姓名不能为空")
    @Size(max=12,min=6,message = "姓名长度要在6-12之间")
    private String name;

    @Max(value = 30,message = "最大值超过30")
    private Integer age;

    @Size(max = 12,min= 6,message = "邮箱长度要在6-12之间")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public TestForm(){}

    public TestForm(String name, Integer age){
        this.name = name;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
