package com.entity.view;

import com.entity.FangwutuizuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房屋退租
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-09 10:34:56
 */
@TableName("fangwutuizu")
public class FangwutuizuView  extends FangwutuizuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangwutuizuView(){
	}
 
 	public FangwutuizuView(FangwutuizuEntity fangwutuizuEntity){
 	try {
			BeanUtils.copyProperties(this, fangwutuizuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
