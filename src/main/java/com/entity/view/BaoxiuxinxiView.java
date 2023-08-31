package com.entity.view;

import com.entity.BaoxiuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报修信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-09 10:34:56
 */
@TableName("baoxiuxinxi")
public class BaoxiuxinxiView  extends BaoxiuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxiuxinxiView(){
	}
 
 	public BaoxiuxinxiView(BaoxiuxinxiEntity baoxiuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, baoxiuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
