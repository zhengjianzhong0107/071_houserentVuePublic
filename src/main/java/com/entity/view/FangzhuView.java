package com.entity.view;

import com.entity.FangzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房主
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-09 10:34:55
 */
@TableName("fangzhu")
public class FangzhuView  extends FangzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangzhuView(){
	}
 
 	public FangzhuView(FangzhuEntity fangzhuEntity){
 	try {
			BeanUtils.copyProperties(this, fangzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
