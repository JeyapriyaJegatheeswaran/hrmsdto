package com.sgic.leavesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leavesystem.entity.Attachments;
import com.sgic.leavesystem.repository.AttachmentsRepository;
@Service
public class AttachmentsServiceImpl implements AttachmentsService{
	@Autowired
	AttachmentsRepository attachmentsRepository;

	@Override
	public boolean addAttachments(Attachments attachments) {
		attachmentsRepository.save(attachments);
		return true;
	}

	@Override
	public List<Attachments> getAllAttachments() {
		
		return attachmentsRepository.findAll();
	}

	@Override
	public boolean editAttachments(Attachments attachments, Integer id) {
		if(attachmentsRepository.getOne(id) !=null) {
			attachments.setId(id);
			attachmentsRepository.save(attachments);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAttachments(Integer id) {
		attachmentsRepository.deleteById(id);
		return true;
	}

	@Override
	public Attachments getById(Integer id) {
		return attachmentsRepository.findById(id).orElse(null);
	}

}
