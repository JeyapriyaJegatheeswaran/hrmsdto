package com.sgic.leavesystem.service;

import java.util.List;

import com.sgic.leavesystem.entity.Attachments;

public interface AttachmentsService {
	boolean addAttachments(Attachments attachments);
	   List<Attachments> getAllAttachments();
	   boolean editAttachments(Attachments attachments, Integer id);
	   boolean deleteAttachments(Integer id);
	   Attachments getById(Integer id);

}
