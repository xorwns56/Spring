package com.example.test.entity;

public class PaginationInfo {
	private int currentPageNo;
	private int recordCountPerPage;
	private int pageSize;
	private int totalRecordCount;
	
	public int getCurrentPageNo() {
		return Math.min(getTotalPageCount(), Math.max(1, currentPageNo));
	}
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}
	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRecordCount() {
		return totalRecordCount;
	}
	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}
	public int getTotalPageCount() {
		return ((totalRecordCount - 1) / recordCountPerPage) + 1;
	}
	public int getFirstPageNoOnPageList() {
		return ((getCurrentPageNo() - 1) / pageSize) * pageSize + 1;
	}
	public int getLastPageNoOnPageList() {
		return Math.min(getTotalPageCount(), getFirstPageNoOnPageList() + pageSize - 1);
	}
	public int getFirstRecordIndex() {
		return (getCurrentPageNo() - 1) * recordCountPerPage;
	}
	public int getLastRecordIndex() {
		return getCurrentPageNo() * recordCountPerPage;
	}
}
