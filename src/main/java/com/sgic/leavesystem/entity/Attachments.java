package com.sgic.leavesystem.entity;

import java.io.File;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "atachments")
public class Attachments implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = -1213758822852936473L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "termination_record_id")
  TerminationRecord terminationRecord;

  @Column(name = "attachment")
  File attachment;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TerminationRecord getTerminationRecord() {
    return terminationRecord;
  }

  public void setTerminationRecord(TerminationRecord terminationRecord) {
    this.terminationRecord = terminationRecord;
  }

  public File getAttachments() {
    return attachment;
  }

  public void setAttachment(File attachment) {
    this.attachment = attachment;
  }
}
