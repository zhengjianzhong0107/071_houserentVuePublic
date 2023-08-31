package com.entity.vo;

import com.entity.FangwuzulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房屋租赁
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-09 10:34:55
 */
public class FangwuzulinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋封面
	 */
	
	private String fangwufengmian;
		
	/**
	 * 房源分类
	 */
	
	private String fangyuanfenlei;
		
	/**
	 * 租金
	 */
	
	private Integer zujin;
		
	/**
	 * 详细地址
	 */
	
	private String xiangxidizhi;
		
	/**
	 * 房屋详情
	 */
	
	private String fangwuxiangqing;
		
	/**
	 * 租赁状态
	 */
	
	private String zulinzhuangtai;
		
	/**
	 * 房主账号
	 */
	
	private String fangzhuzhanghao;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：房屋封面
	 */
	 
	public void setFangwufengmian(String fangwufengmian) {
		this.fangwufengmian = fangwufengmian;
	}
	
	/**
	 * 获取：房屋封面
	 */
	public String getFangwufengmian() {
		return fangwufengmian;
	}
				
	
	/**
	 * 设置：房源分类
	 */
	 
	public void setFangyuanfenlei(String fangyuanfenlei) {
		this.fangyuanfenlei = fangyuanfenlei;
	}
	
	/**
	 * 获取：房源分类
	 */
	public String getFangyuanfenlei() {
		return fangyuanfenlei;
	}
				
	
	/**
	 * 设置：租金
	 */
	 
	public void setZujin(Integer zujin) {
		this.zujin = zujin;
	}
	
	/**
	 * 获取：租金
	 */
	public Integer getZujin() {
		return zujin;
	}
				
	
	/**
	 * 设置：详细地址
	 */
	 
	public void setXiangxidizhi(String xiangxidizhi) {
		this.xiangxidizhi = xiangxidizhi;
	}
	
	/**
	 * 获取：详细地址
	 */
	public String getXiangxidizhi() {
		return xiangxidizhi;
	}
				
	
	/**
	 * 设置：房屋详情
	 */
	 
	public void setFangwuxiangqing(String fangwuxiangqing) {
		this.fangwuxiangqing = fangwuxiangqing;
	}
	
	/**
	 * 获取：房屋详情
	 */
	public String getFangwuxiangqing() {
		return fangwuxiangqing;
	}
				
	
	/**
	 * 设置：租赁状态
	 */
	 
	public void setZulinzhuangtai(String zulinzhuangtai) {
		this.zulinzhuangtai = zulinzhuangtai;
	}
	
	/**
	 * 获取：租赁状态
	 */
	public String getZulinzhuangtai() {
		return zulinzhuangtai;
	}
				
	
	/**
	 * 设置：房主账号
	 */
	 
	public void setFangzhuzhanghao(String fangzhuzhanghao) {
		this.fangzhuzhanghao = fangzhuzhanghao;
	}
	
	/**
	 * 获取：房主账号
	 */
	public String getFangzhuzhanghao() {
		return fangzhuzhanghao;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
