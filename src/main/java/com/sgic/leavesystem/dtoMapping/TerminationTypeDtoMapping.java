package com.sgic.leavesystem.dtoMapping;


import java.util.ArrayList;
import java.util.List;

import com.sgic.leavesystem.dto.TerminationTypeDto;
import com.sgic.leavesystem.entity.TerminationType;

public class TerminationTypeDtoMapping {
	
	public static TerminationTypeDto terminationTypeToTerminationTypeDto(TerminationType terminationType ) {
		TerminationTypeDto terminationTypeDto = new TerminationTypeDto();
		if (terminationType != null) {
			terminationTypeDto.setId(terminationType.getId());
			terminationTypeDto.setTerminationType(terminationType.getTerminationTypeValue());
			return terminationTypeDto;
		}
		return null;
	}
	
	public static List<TerminationTypeDto> terminationTypeToTerminationTypeDtoList(List<TerminationType> terminationTypeList) {
		List<TerminationTypeDto> TerminationTypeDto = new ArrayList<>();

		if (terminationTypeList != null) {
			for (TerminationType terminationType : terminationTypeList) {
				TerminationTypeDto.add(terminationTypeToTerminationTypeDto(terminationType));
			}
			return TerminationTypeDto;
			
		}
		return null;
		
}
}
