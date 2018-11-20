package com.sgic.leavesystem.dtoMapping;

import com.sgic.leavesystem.dto.AttachmentsDto;
import com.sgic.leavesystem.entity.Attachments;

public class AttachmentsDtoMapping {
	
	public static AttachmentsDto attachmentsToattachmentsDto(Attachments attachments ) {
		AttachmentsDto attachmentsDto = new AttachmentsDto();
		
		if(attachments != null) {
			attachmentsDto.setId(attachments.getId());
			attachmentsDto.setTerminationRecord(attachments.getTerminationRecord());		
			attachmentsDto.setAttachment(attachments.getAttachment().getId());
			
			return attachmentsDto;
			
		}
		return null;
	}

}
