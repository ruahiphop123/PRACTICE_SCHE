package com.SoftwareTech.PrcScheduleWeb.dto.TeacherServiceDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReqDtoTeacherInfo {
    @NotBlank(message = "error_entity_01")
    private String teacherId;

    @NotBlank(message = "error_entity_03")
    @Pattern(regexp = "^[^@\\s]+[.\\w]*@(gmail\\.com)$",
        message = "error_account_01")
    private String instituteEmail;

    @NotBlank(message = "error_entity_03")
    @Pattern(regexp = "^[A-Za-zÀ-ỹ]{1,50}( [A-Za-zÀ-ỹ]{1,50})*$", message = "error_entity_03")
    private String lastName;

    @NotBlank(message = "error_entity_03")
    @Pattern(regexp = "^[A-Za-zÀ-ỹ]{1,50}$", message = "error_entity_03")
    private String firstName;

    @NotNull(message = "error_entity_03")
    @Past(message = "error_entity_03")
    private Date birthday;

    @NotNull(message = "error_entity_03")
    private String gender;

    @NotBlank(message = "error_entity_03")
    private String departmentId;

    @NotBlank(message = "error_entity_03")
    @Pattern(regexp = "^[0-9]{4,12}$", message = "error_entity_03")
    private String phone;
}
