package org.example.mappers;


import org.example.dto.EmployeesDto;
import org.example.models.Employees;
import org.mapstruct.Mapper;

@Mapper
public interface ConsultationMapper {

    ConsultationDTO toConDto(Consultation e);

    Consultation toModel(ConsultationDTO dto);
}
