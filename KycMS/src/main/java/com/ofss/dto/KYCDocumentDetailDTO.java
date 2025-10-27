package com.ofss.dto;
	
	import java.time.LocalDateTime;
	
	public class KYCDocumentDetailDTO {
	    private String docId;
	    private String customerId;
	    private String docType;
	    private String fileName;
	    private String fileBase64; // :point_left: included only here
	    private String status;
	    private LocalDateTime uploadedAt;
	
	    // Getters and Setters
	    public String getDocId() {
	        return docId;
	    }
	
	    public void setDocId(String docId) {
	        this.docId = docId;
	    }
	
	    public String getCustomerId() {
	        return customerId;
	    }
	
	    public void setCustomerId(String customerId) {
	        this.customerId = customerId;
	    }
	
	    public String getDocType() {
	        return docType;
	    }
	
	    public void setDocType(String docType) {
	        this.docType = docType;
	    }
	
	    public String getFileName() {
	        return fileName;
	    }
	
	    public void setFileName(String fileName) {
	        this.fileName = fileName;
	    }
	
	    public String getFileBase64() {
	        return fileBase64;
	    }
	
	    public void setFileBase64(String fileBase64) {
	        this.fileBase64 = fileBase64;
	    }
	
	    public String getStatus() {
	        return status;
	    }
	
	    public void setStatus(String status) {
	        this.status = status;
	    }
	
	    public LocalDateTime getUploadedAt() {
	        return uploadedAt;
	    }
	
	    public void setUploadedAt(LocalDateTime uploadedAt) {
	        this.uploadedAt = uploadedAt;
	    }
	}