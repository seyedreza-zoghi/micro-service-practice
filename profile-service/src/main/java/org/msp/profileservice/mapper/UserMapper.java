package org.msp.profileservice.mapper;

import org.mapstruct.*;
import org.msp.profileservice.dto.UserDto;
import org.msp.profileservice.model.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    User toEntity(UserDto userDto);
    UserDto toDto(User user);
}
