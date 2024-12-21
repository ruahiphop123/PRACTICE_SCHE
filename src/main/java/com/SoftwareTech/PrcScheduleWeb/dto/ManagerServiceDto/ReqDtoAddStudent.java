package com.SoftwareTech.PrcScheduleWeb.dto.ManagerServiceDto;

import com.SoftwareTech.PrcScheduleWeb.model.Grade;
import com.SoftwareTech.PrcScheduleWeb.model.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReqDtoAddStudent {
    @NotBlank(message = "error_entity_01")
    private String studentId;

    @NotNull(message = "error_entity_01")
    private Grade grade;

    @NotBlank(message = "error_entity_03")
    @Pattern(regexp = "^[A-Za-zÀ-ỹ]{1,50}( [A-Za-zÀ-ỹ]{1,50})*$", message = "error_entity_03")
    private String lastName;

    @NotBlank(message = "error_entity_03")
    @Pattern(regexp = "^[A-Za-zÀ-ỹ]{1,50}$", message = "error_entity_03")
    private String firstName;

    @NotNull(message = "error_entity_03")
    private Gender gender;

    @NotBlank(message = "error_entity_03")
    @Pattern(regexp = "^[^@\\s]+[.\\w]*@(gmail\\.com)$",
            message = "error_account_01")
    private String instituteEmail;
}
