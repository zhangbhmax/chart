package com.chart.common.bean;

import java.util.List;

public class Page<T> {
	
	public static String Order_ASC = "asc";
	public static String Order_desc = "desc";
	/**
	 * 分页对象的List
	 */
	private List<T> resultList;
	/**
	 * 分页大小
	 */
	private Integer pageSize;
	/**
	 *第N页
	 */
	private Integer pageIndex;
	
	/**
	 * 一页记录数
	 */
	private Integer pageCount;
	/**
	 * 总记录数
	 */
	private Integer totalCount;
	/**
	 * 总页数
	 */
	private Integer totalPage;
	
	public Page(){
		
	}
	public Page(Integer totalCount,Integer pageSize){
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.totalPage = totalCount / pageSize;
		if(0 < (totalCount % pageSize)){
			this.totalPage++;
		}
	}
	public List<?> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
}
