package com.demo.ss8_btth.model.dto;

import com.demo.ss8_btth.custom_validate.MedCode;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Scanner;

public class BookingDto {
    @NotBlank(message = "Họ tên không được để trống hoặc chỉ có khoảng trắng")
    private String patientName;
    @NotBlank(message = "tuổi không được để trống ")
    @Min(value = 0, message = "Tuổi phải từ 0 trở lên")
    private Integer age;
    @NotBlank(message = "Mã được để trống ")
    @NotNull(message = "Vui lòng nhập mã khoa")
    @MedCode
    private String departmentCode;

    public BookingDto() {
    }

    public BookingDto(String patientName, Integer age, String departmentCode) {
        this.patientName = patientName;
        this.age = age;
        this.departmentCode = departmentCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
