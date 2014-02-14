package com.chart.common.utils;

import java.util.List;

import com.chart.common.bean.Page;

public class PageUtil<T> {
	private Page<T> page;
	
	public Page<T> createPage(Page<T> page,List<T> resultList,Integer totalCount){
		this.page = new Page<T>(totalCount,page.getPageSize());
		this.page.setResultList(resultList);
		this.page.setTotalCount(totalCount);
		this.page.setPageCount(resultList.size());
		return this.page;
	}
}
